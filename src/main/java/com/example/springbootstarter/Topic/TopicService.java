package com.example.springbootstarter.Topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

       private List<Topic> topics = Arrays.asList(
                new Topic( "Spring" , "Spring Framework" , "Spring Framework Description"),
                new Topic( "Java" , "Java Framework" , "Java Framework Description"),
                new Topic( "Javascript" , "Javascript Framework" , "Javascript Framework Description")
        );
       public List<Topic> getAllTopics() {
           return topics;
       }
       public Topic getTopic(String id){
           return topics.stream().filter( t -> t.getId().equals(id) ).findFirst().get();
       }
}
