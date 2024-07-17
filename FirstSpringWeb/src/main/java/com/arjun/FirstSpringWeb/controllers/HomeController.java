package com.arjun.FirstSpringWeb.controllers;

import com.arjun.FirstSpringWeb.models.SomeData;
import com.arjun.FirstSpringWeb.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    HomeService homeService;

    @RequestMapping("/")
    private String homeRequest() {
        return "Hey you are on home!";
    }

    @RequestMapping("/getSomeData")
    private List<SomeData> getSomeDataRequest() {
        return homeService.getSomeData();
    }
}
