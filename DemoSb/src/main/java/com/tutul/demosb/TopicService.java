package com.tutul.demosb;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private static List<Topic> topics= new ArrayList<>(Arrays.asList(
                new Topic("python", "Django", "Pythons desciption"),
                new Topic("java", "SpringBoot", "Springs description"),
                new Topic("javascript", "JavaScript", "JavaScript description")

    ));
    public static List<Topic>getTopics(){
        return topics;
    }

    public static Topic getTopic(String id){
      return  topics.stream().filter(t-> t.getID().equals(id)).findFirst().get();
    }

    public static void addTopic(Topic topic) {
        topics.add(topic);
    }
//
  public static void updateTopic(String id, Topic topic) {
////        for(int i=0; i<topics.size(); i++){
////            Topic t=topics.get(i);
////            if(t.getID().equals(id)){
////                topics.set(i, topic);
////                return;
////                                             }
////                                                  }
                 //using Lambda and Ternary Instead of Bangla code
        topics.replaceAll(t -> t.getID().equals(id) ? topic : t);
    }

    public static void deleteTopic(String id) {
        topics.removeIf(t->t.getID().equals(id));
    }
}
