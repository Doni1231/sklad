package onlineApplication.uz.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import onlineApplication.uz.entity.template.AbsEntity;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"phone"}),
        @UniqueConstraint(columnNames = {"email"}),
        @UniqueConstraint(columnNames = {"username"}),
})
@Entity(name = "users")
public class User extends AbsEntity {

    @Column(nullable = false)
    private String firstName; //ISMI

    @Column(nullable = false)
    private String lastName; //FAMILYASI

    @Column(nullable = false)
    private String phone; //TELEFON RAQAMI. BUNDAN USERNAME SIFATIDA FOYDLANS HAM BO'LADI

    @Column(nullable = false)
    private String email;   //XAT YUBORISH UCHUN EMAIL. BUNDAN USERNAME SIFATIDA FOYDLANS HAM BO'LADI


    @Column(nullable = false)
    private String username;

    private String changingEmail;

    @JsonIgnore
    @Column(nullable = false)
    private String password; //PASSWORD

    private String emailCode; //USER GA EMAIL GA  TASDIQLASHI UCHUN uuid GENERATSIYA QILGAN VA YUBORGAN KODIMIZ.

    private boolean active; //USER UCHUN. AGAR FALSE BO'LSA ZAKAZ OLOLMAYDI VA ZAKAZ BILAN ISHLOLMAYDI

    private boolean online; //USER UCHUN. APPLICATION DAGI HOLATI
}
