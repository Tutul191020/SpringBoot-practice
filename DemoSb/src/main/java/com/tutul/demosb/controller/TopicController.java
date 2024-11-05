package com.tutul.demosb.controller;

import com.tutul.demosb.Topic;
import com.tutul.demosb.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return TopicService.getTopics();

    }

    @RequestMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable String id) {
        return TopicService.getTopic(id);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        TopicService.addTopic(topic);


    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
        TopicService.updateTopic(id, topic);

    }
    @RequestMapping(method=RequestMethod.DELETE , value= "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        TopicService.deleteTopic(id);
    }

}







