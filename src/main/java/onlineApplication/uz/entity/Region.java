package onlineApplication.uz.entity;

import lombok.*;
import onlineApplication.uz.entity.template.AbsNameEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class Region extends AbsNameEntity {

    @ManyToOne()
    private State state;
}
