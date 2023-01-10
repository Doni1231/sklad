package com.example.demo.entity;

import com.example.demo.entity.template.AbsEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@Table(name = "users",
        uniqueConstraints = {
                @UniqueConstraint(name = "phoneNumber", columnNames = {"phoneNumber"}),
                @UniqueConstraint(name = "email", columnNames = {"email"}),
        })
public class User extends AbsEntity implements UserDetails {

    @Column(nullable = false)
    private String firstName;   //ISMI

    @Column(nullable = false)
    private String lastName;   //FAMILYASI

    @Column(nullable = false)
    private String phoneNumber;   //TELEFON RAQAMI. BUNDAN USERNAME SIFATIDA FOYDLANS HAM BO'LADI

    @JsonIgnore
    @Column(nullable = false)
    private String password;   //PAROLI

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String emailCode;

    private String changingEmail;

    @OneToOne
    private Attachment photo;   // USERNING AVATAR PHOTOSI

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_role",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    @ToString.Exclude
    private Set<Role> roles;//USERNING ROLELARI

    private Boolean onlineAgent;

    private String stripeCustomerId;//

    private boolean isAccountNonExpired = true;

    private boolean isAccountNonLocked = true;

    private boolean isCredentialsNonExpired = true;

    private boolean enabled = false;



    public User(String firstName, String lastName, String phoneNumber, String email,
                String password, String emailCode, Set<Role> roles, boolean enabled, Attachment photo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.emailCode = emailCode;
        this.roles = roles;
        this.enabled = enabled;
        this.photo = photo;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> authorities = new HashSet<>();
        roles.forEach(r -> {
            authorities.add(new SimpleGrantedAuthority(r.getRoleName().name()));
        });

        return authorities;
    }

    @Override
    public String getUsername() {
        return phoneNumber;
    }

    @Override
    public boolean isAccountNonExpired() {
        return isAccountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isAccountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
