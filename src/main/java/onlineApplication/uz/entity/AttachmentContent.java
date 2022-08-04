package onlineApplication.uz.entity;


import lombok.*;
import onlineApplication.uz.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class AttachmentContent extends AbsEntity {

    @OneToOne(fetch = FetchType.LAZY)
    private Attachment attachment;

    @Column(nullable = false)
    private byte[] content;
}
