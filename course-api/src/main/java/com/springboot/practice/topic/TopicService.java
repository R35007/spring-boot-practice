package com.springboot.practice.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

  @Autowired
  private TopicRepository topicRepository;

  public void createTopic(Topic topic) {
    topicRepository.save(topic);
  }

  public Topic readTopic(String id) {
    return topicRepository.findById(id).get();
  }

  public List<Topic> readAllTopics() {
    List<Topic> topics = new ArrayList<>();
    topicRepository.findAll().forEach(topics::add);
    return topics;
  }

  public void updateTopic(Topic topic) {
    topicRepository.save(topic);
  }

  public void deleteTopic(String id) {
    topicRepository.deleteById(id);
  }
}
