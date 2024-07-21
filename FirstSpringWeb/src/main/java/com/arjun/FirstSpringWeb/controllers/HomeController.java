package com.arjun.FirstSpringWeb.controllers;

import com.arjun.FirstSpringWeb.models.SomeData;
import com.arjun.FirstSpringWeb.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    HomeService homeService;

    @RequestMapping("/")
    private String homeRequest() {
        return "Hey you are on home!";
    }

    // By default, every request mapping is a get request mapping
    // We can also use Request mapping with a param method = RequestMethod.GET
    @RequestMapping(value = "/someData", method = RequestMethod.GET)
    private List<SomeData> getSomeDataRequest() {
        return homeService.getSomeData();
    }

    @RequestMapping(value = "/someData/{val1}", method = RequestMethod.GET)
    private SomeData getSomeDataByVal1(@PathVariable int val1) { return homeService.getSomeDataByVal1(val1); }

    @RequestMapping(value = "/someData", method = RequestMethod.POST)
    private SomeData addSomeDataWithVal2(@RequestBody SomeData givenSomeData, @RequestParam(required = false) Integer val2) {
        return homeService.addSomeData(givenSomeData, val2);
    }

    @RequestMapping(value = "/someData",method = RequestMethod.PUT)
    private String updateSomeData(@RequestBody SomeData givenSomeDataToUpdate) {
        return homeService.updateSomeData(givenSomeDataToUpdate);
    }

    @RequestMapping(value = "/someData",method = RequestMethod.DELETE)
    private String deleteSomeData(@RequestBody SomeData givenSomeDataToUpdate) {
        return homeService.deleteSomeData(givenSomeDataToUpdate);
    }
}
