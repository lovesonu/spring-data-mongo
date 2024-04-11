package com.javatech.controller;

import com.javatech.model.Task;
import com.javatech.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
//@Api(tags = "ExampleCom_biiiiild")
public class TaskContoroller {

    @Autowired
    private TaskService taskService;

    //    @ApiOperation(value = "Post example")
    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    //    @ApiOperation(value = "Get example")
    @GetMapping("/all")
    public List<Task> findAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{taskId}")
    public Task findTaskById(@PathVariable String taskId) {
        return taskService.getTaskById(taskId);
    }

    @PutMapping
    public Task updateTask(@RequestBody Task task) {
        return taskService.updateTask(task);
    }

    @DeleteMapping("/{taskId}")
    public String deleteTask(@PathVariable String taskId) {
        return taskService.deleteTask(taskId);
    }

    @GetMapping("/assinee/{assinee}/priority/{priority}")
    public List<Task> findByAssigneeAndPriority(@PathVariable String assinee, @PathVariable String priority) {
        return taskService.findByAssigneeAndPriority(assinee, priority);
    }

    @GetMapping("/assinee/{assinee}/pri/{priority}")
    public List<Task> getWithAssigneeAndPriority(@PathVariable String assinee, @PathVariable String priority) {
        return taskService.getWithAssigneeAndPriority(assinee, priority);
    }
}
