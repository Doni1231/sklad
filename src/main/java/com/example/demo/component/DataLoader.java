package com.example.demo.component;


import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.entity.enums.RoleName;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    final
    UserRepository userRepository;

    final
    RoleRepository roleRepository;

    final
    @Lazy
    PasswordEncoder passwordEncoder;

    @Value("${spring.sql.init.mode}")
    private String initMode;

    public DataLoader(
            UserRepository userRepository,
            RoleRepository roleRepository,
            @Lazy PasswordEncoder passwordEncoder
    ) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        if (initMode.equals("always")) {

            userRepository.save(
                    new User(
                            "SuperAdmin",
                            "SuperAdminov",
                            "+998991234567",
                            "superadmin@gmail.com",
                            passwordEncoder.encode("123"),
                            "admin123",
                            new HashSet<>(roleRepository.findAllByRoleName(RoleName.ROLE_ADMIN)),
                            true,
                            null
                    )
            );
        }
    }

}
