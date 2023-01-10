package com.example.demo.service;

import com.example.demo.entity.Attachment;
import com.example.demo.repository.AttachmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

@Service
@Slf4j
public class AttachmentService {

    @Autowired
    AttachmentRepository attachmentRepository;

    @Value("${upload.folder}")
    private String path;

    public HttpEntity<?> byteFile(UUID id) {
        try {
            Attachment attachment = attachmentRepository.findById(id).orElseThrow(() -> new ResolutionException("getAttachmentID"));
            log.debug("success: {}", attachment);
            return ResponseEntity.ok()
                    .contentType(MediaType.parseMediaType(attachment.getContentType()))
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; fileName=\"" + attachment.getName() + "\"")
                    .body(Files.readAllBytes(Paths.get(attachment.getPath())));
        } catch (Exception e) {
            log.error("Error: {}", e.getMessage());
            return ResponseEntity.status(HttpStatus.CONFLICT).body("ERROR");
        }
    }

    public String getExt(String fileName) {
        String ext = null;
        if (fileName != null && !fileName.isEmpty()) {
            int dot = fileName.lastIndexOf(".");
            if (dot > 0 && dot <= fileName.length() - 2) {
                ext = fileName.substring(dot);
            }
        }
        return ext;
    }
}
