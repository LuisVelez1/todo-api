package com.todoapi.persistance.repository;

import com.todoapi.persistance.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TaskRepository extends JpaRepository <Task, UUID> {
}
