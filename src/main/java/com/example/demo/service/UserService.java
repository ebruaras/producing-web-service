package com.example.demo.service;

import io.spring.guides.gs_producing_web_service.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;




@Service
public class UserService {
    private static final Map<String, User> users=new HashMap<>();


    @PostConstruct
    public void initialize(){
        User jessy=new User();
        jessy.setName("Jessy");
        jessy.setMemberId(1111);
        jessy.setSalary(3000);
        users.put(jessy.getName(),jessy);

        User peter=new User();
        peter.setName("Peter");
        jessy.setMemberId(2222);
        jessy.setSalary(3500);
        users.put(peter.getName(),peter);

        User jane=new User();
        jane.setName("Jane");
        jane.setMemberId(3333);
        jane.setSalary(4000);
        users.put(jane.getName(),jane);

    }
    public User getUser(String name){
        return users.get(name);
    }

}
