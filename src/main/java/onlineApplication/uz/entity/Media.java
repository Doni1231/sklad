package onlineApplication.uz.entity;


import lombok.*;
import onlineApplication.uz.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@Entity
public class Media extends AbsEntity {

    @Column(nullable = false)
    private UUID path;

    @Column
    private String fileLocation;

    @ManyToOne
    private User userId;


}
