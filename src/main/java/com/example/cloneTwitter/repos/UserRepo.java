package com.example.cloneTwitter.repos;

import com.example.cloneTwitter.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
