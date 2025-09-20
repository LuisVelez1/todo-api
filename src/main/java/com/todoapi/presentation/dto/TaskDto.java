package com.todoapi.presentation.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {

    private UUID id;

    @NotBlank(message = "The title can't be empty")
    private String title;

    private String description;

    private boolean completed;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;
}
