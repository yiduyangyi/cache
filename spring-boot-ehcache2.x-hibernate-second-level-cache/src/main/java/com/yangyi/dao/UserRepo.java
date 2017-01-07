package com.yangyi.dao;

import com.yangyi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Long> {
    User findByLogin(String login);

}
