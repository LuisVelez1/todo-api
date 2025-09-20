package com.todoapi.service.implementation;

import com.todoapi.exception.TaskNotFoundException;
import com.todoapi.persistance.entity.Task;
import com.todoapi.persistance.repository.TaskRepository;
import com.todoapi.presentation.dto.CreateTaskDto;
import com.todoapi.presentation.dto.TaskDto;
import com.todoapi.presentation.mapper.TaskMapper;
import com.todoapi.service.interfaces.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.todoapi.presentation.mapper.TaskMapper.toDto;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    public TaskDto create(CreateTaskDto createtaskDto) {
        if (createtaskDto.getTitle() == null || createtaskDto.getTitle().isBlank()) {
            throw new IllegalArgumentException("The title can't be empty");
        }
        Task task = taskRepository.save(TaskMapper.toEntity(createtaskDto));
        return TaskMapper.toDto(task);
    }

    @Override
    public TaskDto update(UUID id, TaskDto taskDto) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException("Task not found"));

        task.setTitle(taskDto.getTitle());
        task.setDescription(taskDto.getDescription());
        task.setCompleted(taskDto.isCompleted());

        task = taskRepository.save(task);
        return toDto(task);
    }

    @Override
    public void delete(UUID id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException("Task with id " + id + " not found"));
        taskRepository.delete(task);
    }

    @Override
    public TaskDto getById(UUID id) {
        return taskRepository.findById(id)
                .map(TaskMapper::toDto)
                .orElseThrow(() -> new TaskNotFoundException("Task not found"));
    }

    @Override
    public List<TaskDto> getAll() {
        return taskRepository.findAll()
                .stream()
                .map(TaskMapper::toDto)
                .collect(Collectors.toList());
    }
}
