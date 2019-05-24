package com.example.test_thymeleaf.controller;

import com.example.test_thymeleaf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author pyt
 * @Date 2019/5/24 13:41
 * @Version
 */
@Controller
//@RestController
public class HelloController {
    /*@RequestMapping("/hello")
    public String hello() {
        return "Hello,thymeleaf!!!";
    }*/
    @RequestMapping("/hello")
    public String hello(Model model) {
        String name = "pyt";
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping("/login")
    public ModelAndView login(Model model) {
        model.addAttribute("title","表单测试");
        model.addAttribute("user",new User());
        return new ModelAndView("hello","userModel",model);
    }

    @PostMapping("/login2")
    public ModelAndView add(User user){
        System.out.println(user.toString());
        return new ModelAndView("redirect:/login");

    }
}
