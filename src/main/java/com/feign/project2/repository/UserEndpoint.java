package com.feign.project2.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "clickup", url = "${sample.client.urlClickup}")
public interface UserEndpoint {

  @GetMapping("task/{taskId}")
  Object getByTaskId(@PathVariable("taskId") String taskId,
    @RequestHeader("Authorization") String token);

  @GetMapping("list/{listId}/task")
  Object getAllTasks(@PathVariable("listId") String listId,
    @RequestHeader("Authorization") String token);
}
