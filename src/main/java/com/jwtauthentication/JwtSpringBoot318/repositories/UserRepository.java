package com.jwtauthentication.JwtSpringBoot318.repositories;

import com.jwtauthentication.JwtSpringBoot318.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    public Optional<User> findByEmail(String email);
}
