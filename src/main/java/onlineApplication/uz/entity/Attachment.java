package onlineApplication.uz.entity;


import lombok.*;
import onlineApplication.uz.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Attachment extends AbsEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private long size;

    @Column(nullable = false)
    private String contentType;
}
