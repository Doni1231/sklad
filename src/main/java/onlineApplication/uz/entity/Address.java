package onlineApplication.uz.entity;

import lombok.*;
import onlineApplication.uz.entity.template.AbsNameEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Address extends AbsNameEntity {

    @ManyToOne(optional = true)
    private Region region;
}
