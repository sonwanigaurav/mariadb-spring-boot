package com.mariadb.mariadbspringboot.handler.rest;

import com.mariadb.mariadbspringboot.application.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class SpringBootController {
    private final static Logger LOGGER = LoggerFactory.getLogger(SpringBootController.class);

    private final UserService userService;

    public SpringBootController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/hello")
    public String helloWorld(HttpServletRequest request) {
        LOGGER.info("hello world debug statement");
        return "Hello World";
    }
}
