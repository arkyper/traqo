package com.arkyper.traqo.domain.dto;

import java.time.LocalDateTime;
import java.util.UUID;
import com.arkyper.traqo.domain.entities.TaskPriority;
import com.arkyper.traqo.domain.entities.TaskStatus;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}

