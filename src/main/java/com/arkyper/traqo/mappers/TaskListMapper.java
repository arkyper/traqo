package com.arkyper.traqo.mappers;

import com.arkyper.traqo.domain.dto.TaskListDto;
import com.arkyper.traqo.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
