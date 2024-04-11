package com.javatech.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "Tasks")
public class Task {
    @Id
    private String taskId;
    private String description;
    private String priority;
    private String assignee;
    private int storyPoint;
}
