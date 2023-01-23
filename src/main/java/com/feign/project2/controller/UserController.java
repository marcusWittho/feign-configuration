package com.feign.project2.controller;

import com.feign.project2.repository.UserEndpoint;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  private final UserEndpoint userEndpoint;

  public UserController(UserEndpoint userEndpoint) {
    this.userEndpoint = userEndpoint;
  }

  @RequestMapping(path = "/user/{taskId}")
  public Object getUser(@PathVariable("taskId") String taskId,
      @RequestHeader("Authorization") String token) {

    return userEndpoint.getTask(taskId, token);
  }
}
