package com.hmso.tasks.domain.mappers;

import com.hmso.tasks.domain.dto.TaskListDto;
import com.hmso.tasks.domain.entities.Task;
import com.hmso.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList );
}
