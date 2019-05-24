package com.example.test_thymeleaf.repository;

import com.example.test_thymeleaf.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findById(Long id);

    <S extends User> S save(S user);

    Optional<User> findByName(String name);
}
