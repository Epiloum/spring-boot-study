package com.epiloum.study.demo.controller;

import com.epiloum.study.demo.entities.UserEntity;
import com.epiloum.study.demo.repogitories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value="/count", method=RequestMethod.GET)
    @ResponseBody
    public String count() {
        return String.valueOf(userRepository.count());
    }

    @RequestMapping(value="/list", method=RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<UserEntity>> list() {
        List<UserEntity> data = userRepository.findAll();
        return ResponseEntity.ok().body(data);
    }
}
