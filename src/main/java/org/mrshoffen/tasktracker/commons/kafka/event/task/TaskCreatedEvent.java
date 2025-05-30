package org.mrshoffen.tasktracker.commons.kafka.event.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mrshoffen.tasktracker.commons.web.dto.TaskResponseDto;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskCreatedEvent {

    public static final String TOPIC = "event.task.created";

    private TaskResponseDto createdTask;
}
