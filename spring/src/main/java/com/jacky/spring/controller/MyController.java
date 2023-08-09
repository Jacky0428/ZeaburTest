package com.jacky.spring.controller;

import com.jacky.DomainTest;
import com.jacky.spring.entity.User;
import com.jacky.spring.repository.MyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class MyController {

    private final MyRepository myRepository;

    // hello
    @RequestMapping("/hello")
    public String hello() {
        DomainTest domainTest = new DomainTest();
        return "Hello World2! " + domainTest.name;
    }

    // findAll
    @RequestMapping("/findAll")
    public List<?> findAll() {
        return myRepository.findAll();
    }

    // save
    @RequestMapping("/save")
    public List<?> save() {
        User user = new User(new Random().nextInt(100), UUID.randomUUID().toString());
        myRepository.save(user);
        return myRepository.findAll();
    }

}
