package com.todoapi.presentation.mapper;

import com.todoapi.persistance.entity.Task;
import com.todoapi.presentation.dto.CreateTaskDto;
import com.todoapi.presentation.dto.TaskDto;

public class TaskMapper {

    public static TaskDto toDto(Task task){
        return TaskDto.builder()
                .id(task.getId())
                .title(task.getTitle())
                .description(task.getDescription())
                .completed(task.getCompleted())
                .createdAt(task.getCreatedAt())
                .updateAt(task.getUpdatedAt())
                .build();
    }

    public static Task toEntity (CreateTaskDto taskDto){
        return Task.builder()
                .title(taskDto.getTitle())
                .description(taskDto.getDescription())
                .completed(taskDto.isCompleted())
                .build();
    }
}
