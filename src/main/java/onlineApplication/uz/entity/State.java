package onlineApplication.uz.entity;

import lombok.*;
import onlineApplication.uz.entity.template.AbsNameEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class State extends AbsNameEntity {

    @ManyToOne()
    private Country country;
}
