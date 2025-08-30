package com.arkyper.traqo.mappers;

import com.arkyper.traqo.domain.dto.TaskDto;
import com.arkyper.traqo.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);
    
    TaskDto toDto(Task task);

}
