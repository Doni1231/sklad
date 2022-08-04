package onlineApplication.uz.entity.template;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@ToString
@MappedSuperclass
public abstract class AbsNameEntity extends AbsEntity {
    @Column(nullable = false, unique = true)
    private String name;

    private boolean active;

    @Column(columnDefinition = "text")
    private String description;
}
