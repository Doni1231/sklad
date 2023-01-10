package com.example.demo.repository;

import com.example.demo.entity.Role;
import com.example.demo.entity.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Set<Role> findAllByRoleName(RoleName roleName);
}
