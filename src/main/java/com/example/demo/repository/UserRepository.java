package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;


@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

  boolean  existsByEmailAndIdNot(String email,UUID id);

  boolean existsByPhoneNumberAndIdNot(String phoneNumber, UUID id);

  Optional<User> findByEmailCodeAndChangingEmail(String emailCode, String email);

  Optional<User> findByEmailCodeAndEmail(String emailCode, String email);

  Optional<User> findByEmailOrPhoneNumber(String email, String phoneNumber);
}
