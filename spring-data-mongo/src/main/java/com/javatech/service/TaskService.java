package com.javatech.service;

import com.javatech.model.Task;
import com.javatech.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task saveTask(Task task) {
        task.setTaskId(UUID.randomUUID().toString().split("-")[0]);
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(String taskId) {
        return taskRepository.findById(taskId).get();
    }

    public Task updateTask(Task task) {
        Task existTask = taskRepository.findById(task.getTaskId()).get();
        existTask.setTaskId(existTask.getTaskId());
        existTask.setDescription(task.getDescription());
        existTask.setPriority(task.getPriority());
        existTask.setAssignee(task.getAssignee());
        existTask.setStoryPoint(task.getStoryPoint());
        return taskRepository.save(existTask);
    }
    public String deleteTask(String taskId){
      taskRepository.deleteById(taskId);
        return taskId + "Task is delete !!";

    }

    public List<Task> findByAssigneeAndPriority(String assignee, String priority) {
        return taskRepository.findByAssigneeAndPriority(assignee, priority);
    }

    public List<Task> getWithAssigneeAndPriority(String assinee, String priority) {
        return taskRepository.findTaskWithAssigneeAndPriority(assinee, priority);
    }
}
