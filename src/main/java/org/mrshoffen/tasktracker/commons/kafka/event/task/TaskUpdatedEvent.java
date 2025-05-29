package org.mrshoffen.tasktracker.commons.kafka.event.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mrshoffen.tasktracker.commons.web.dto.TaskResponseDto;

import java.time.Instant;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskUpdatedEvent {

    public static final String TOPIC = "event.task.updated";

    private Map<String, Objects> updatedField;
    private Instant updatedAt;
    private UUID updatedBy;
}
