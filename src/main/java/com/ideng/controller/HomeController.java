package com.ideng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Javier on 17/8/2017.
 */

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return  "hola";
    }
}
