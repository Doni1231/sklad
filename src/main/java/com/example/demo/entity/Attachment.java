package com.example.demo.entity;


import com.example.demo.entity.template.AbsEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Attachment extends AbsEntity {

    @Column
    private String name;

    @Column(nullable = false)
    private long size;

    @Column(nullable = false)
    private String contentType;

    @Column(nullable = false)
    private String path;

    @Column
    private String extension;


}
