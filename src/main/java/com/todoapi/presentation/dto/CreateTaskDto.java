package com.todoapi.presentation.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateTaskDto {

    @NotBlank(message = "The tittle can't be empty")
    private String title;

    private String description;

    private boolean completed;
}
