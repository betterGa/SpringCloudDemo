package com.jia.controller;

import com.jia.entity.Student;
import com.jia.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Struct;
import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignHandler {

    @Autowired
    private FeignProviderClient client;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return client.findAll();
    }

    @GetMapping("/index")
    public String index() {
        return client.index();
    }
}
