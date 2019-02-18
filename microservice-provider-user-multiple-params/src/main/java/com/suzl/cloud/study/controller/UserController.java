package com.suzl.cloud.study.controller;

import com.suzl.cloud.study.entity.User;
import com.suzl.cloud.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
  * @Description:
  * @author: zhenglongsu@163.com
  * @date: 2018.11.06 14:23
  */
 @RestController
 public class UserController {
   @Autowired
   private UserRepository userRepository;

   @GetMapping("/{id}")
   public User findById(@PathVariable Long id) {
     User findOne = this.userRepository.findOne(id);
     return findOne;
   }

   @GetMapping("/get")
   public User get(User user) {
     return user;
   }

   @PostMapping("/post")
   public User post(@RequestBody User user) {
     return user;
   }
 }
