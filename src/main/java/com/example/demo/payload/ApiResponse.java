package com.example.demo.payload;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse {
    private String message;
    private boolean success;
    private Object object;
    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;

    public ApiResponse(String fileName, String fileDownloadUri, String fileType, long size) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }
    public ApiResponse(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public ApiResponse(boolean success, Object object) {
        this.success = success;
        this.object = object;
    }

    public ApiResponse(String message, Object object) {
        this.message = message;
        this.object = object;
    }

    public ApiResponse(Object object) {
        this.object = object;
    }


}
