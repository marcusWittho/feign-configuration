package com.feign.project2.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "clickup", url = "https://api.clickup.com/api/v2")
public interface UserEndpoint {

  @GetMapping("task/{taskId}")
  Object getTask(@PathVariable("taskId") String taskId,
    @RequestHeader("Authorization") String token);
}
