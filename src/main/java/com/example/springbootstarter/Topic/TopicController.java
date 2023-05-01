package com.example.springbootstarter.Topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TopicController {

@Autowired
    private TopicService topicService;
//@RequestMapping("/topics")
//@RequestMapping("/topics", method = RequestMethod.GET)
    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
}

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
    return topicService.getTopic(id);
}

    @PostMapping("/topics/add")
    public String addTopic(@RequestBody Topic topic) {
       return topicService.addTopic(topic);
}

    @RequestMapping(method = RequestMethod.PUT , value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic , @PathVariable String id)
    {
        TopicService.updateTopic(id , topic);
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id)
    {
        TopicService.deleteTopic(id);
    }



}
