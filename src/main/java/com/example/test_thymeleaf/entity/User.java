package com.example.test_thymeleaf.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @ClassName User
 * @Description TODO
 * @Author pyt
 * @Date 2019/5/24 14:01
 * @Version
 */
@Entity
@Data
public class User {
    @Id
    private Long id;
    private String name, password;
    @CreatedDate
    private Date createAt;//用户创建时间
    @LastModifiedDate
    private Date updateAt;//用户更新时间
}
