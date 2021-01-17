package com.springboot.practice.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class TopicController {

  @Autowired
  private TopicService topicService;

  @GetMapping(value = "/topics")
  public List<Topic> getTopics() {
    return topicService.readAllTopics();
  }

  @GetMapping(value = "/topics/{id}")
  public Topic getTopic(@PathVariable String id) {
    return topicService.readTopic(id);
  }

  @PostMapping(value = "/topics")
  public void addTopic(@RequestBody Topic topic) {
    topicService.createTopic(topic);
  }

  @PutMapping(value = "/topics/{id}")
  public void updateTopic(@RequestBody Topic topic) {
    topicService.updateTopic(topic);
  }

  @DeleteMapping(value = "/topics/{id}")
  public void deleteTopic(@PathVariable String id) {
    topicService.deleteTopic(id);
  }

}
