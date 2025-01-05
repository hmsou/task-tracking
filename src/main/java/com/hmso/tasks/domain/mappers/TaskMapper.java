package com.hmso.tasks.domain.mappers;

import com.hmso.tasks.domain.dto.TaskDto;
import com.hmso.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);

}
