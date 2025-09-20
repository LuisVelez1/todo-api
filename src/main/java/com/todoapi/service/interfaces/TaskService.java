package com.todoapi.service.interfaces;

import com.todoapi.presentation.dto.CreateTaskDto;
import com.todoapi.presentation.dto.TaskDto;
import java.util.List;
import java.util.UUID;


public interface TaskService {
    TaskDto create(CreateTaskDto createtaskDto);
    TaskDto update(UUID id, TaskDto taskDto);
    void delete (UUID id);
    TaskDto getById(UUID id);
    List<TaskDto> getAll();
}
