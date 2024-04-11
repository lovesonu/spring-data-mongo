package com.javatech.repository;

import com.javatech.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task,String> {

    List<Task>  findByAssigneeAndPriority(String assinee, String priority);

    @Query(value = "{assignee: ?0 ,priority: ?1}",fields = "{'description' : 1, 'storypoint':2}")
    //select * from where assignee =? and priority=? // in jpa
    List<Task> findTaskWithAssigneeAndPriority(String assignee, String priority);
}
