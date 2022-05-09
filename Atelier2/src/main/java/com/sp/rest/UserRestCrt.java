 package com.sp.rest;

  import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.web.bind.annotation.PathVariable;
  import org.springframework.web.bind.annotation.RequestBody;
  import org.springframework.web.bind.annotation.RequestMapping;
  import org.springframework.web.bind.annotation.RequestMethod;
  import org.springframework.web.bind.annotation.RestController;

  import com.sp.model.User;
  import com.sp.service.UserService;

  @RestController
  public class UserRestCrt {
      @Autowired
      UserService uService;
      
      @RequestMapping(method=RequestMethod.POST,value="/user")
      public void addUser(@RequestBody User user) {
          uService.addUser(user);
      }
      @RequestMapping(method=RequestMethod.GET,value="/user/all")
      public List<User> getAllUser() {
          List<User> h=uService.findAll();
          return h;
      }
      
      @RequestMapping(method=RequestMethod.POST,value="/logUser")
      public void CheckUser(@RequestBody User user) {
    	  System.out.println(user.getName());
          uService.CheckUser(user);
      }
      
      /*
      @RequestMapping(method=RequestMethod.GET,value="/User/{id}")
      public User getUser(@PathVariable String id) {
          User h=uService.getUser(Integer.valueOf(id));
          return h;
      }
      */
  }
