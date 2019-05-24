package com.example.test_thymeleaf.service;

import com.example.test_thymeleaf.entity.User;
import com.example.test_thymeleaf.repository.UserRepository;
import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author pyt
 * @Date 2019/5/24 14:22
 * @Version
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        userList = IteratorUtils.toList(userRepository.findAll().iterator());
        return userList;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User getUserbyId(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.isPresent() ? userOptional.get() : null;
    }
}
