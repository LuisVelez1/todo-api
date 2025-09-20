package com.todoapi.presentation.controller;


import com.todoapi.exception.TaskNotFoundException;
import com.todoapi.persistance.entity.Task;
import com.todoapi.presentation.dto.CreateTaskDto;
import com.todoapi.presentation.dto.TaskDto;
import com.todoapi.service.interfaces.TaskService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/task")
@RequiredArgsConstructor
@Tag(name = "Task", description = "CRUD for task operation")
public class TaskController {
    private final TaskService taskService;

    @PostMapping
    @Operation(summary = "Create task", description = "Create a new task with title, description and state (complete).")
    public ResponseEntity <TaskDto> save(@Valid @RequestBody CreateTaskDto taskDto) {
        TaskDto savedTask = this.taskService.create(taskDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTask);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update task", description = "Update a task using title, description, state (complete) or updateAt.")
    public ResponseEntity <TaskDto> update(@PathVariable UUID id, @Valid @RequestBody TaskDto taskDto) {
        TaskDto updateTask = this.taskService.update(id, taskDto);
        return ResponseEntity.status(HttpStatus.OK).body(updateTask);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete task", description = "Delete a task using the ID.")
    public ResponseEntity <Void> delete (@PathVariable UUID id) {
            this.taskService.delete(id);
            return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a task by id", description = "Retrieves the task stored in the DB using the ID.")
    public ResponseEntity <TaskDto> getById(@PathVariable UUID id){
        TaskDto taskDto = this.taskService.getById(id);
        return ResponseEntity.ok(taskDto);
    }

    @GetMapping
    @Operation(summary = "List all task", description = "Get all task from DB storage.")
    public ResponseEntity<List<TaskDto>> getAll () {
        return ResponseEntity.ok(taskService.getAll());
    }
}
