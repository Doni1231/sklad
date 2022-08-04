package onlineApplication.uz.entity;

import lombok.*;
import onlineApplication.uz.entity.template.AbsNameEntity;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class Country extends AbsNameEntity {
}
