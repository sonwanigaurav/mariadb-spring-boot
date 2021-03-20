package com.mariadb.mariadbspringboot.handler.rest;

import com.mariadb.mariadbspringboot.application.UserService;
import com.mariadb.mariadbspringboot.domain.IGMUserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public ResponseEntity<?> createOrUpdateIGMUser(@RequestBody IGMUserEntity igmUserEntity) throws Exception {
        LOGGER.info("Calling getReturnBranches with RequestBody : {}", igmUserEntity);
        IGMUserEntity savedData =  userService.createOrUpdateIGMUser(igmUserEntity);
        return new ResponseEntity<>(savedData, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> helloWorld(@PathVariable("id") String id) {
        IGMUserEntity savedData =  userService.getUserById(Long.valueOf(id));
        return new ResponseEntity<>(savedData, HttpStatus.OK);
    }
}
