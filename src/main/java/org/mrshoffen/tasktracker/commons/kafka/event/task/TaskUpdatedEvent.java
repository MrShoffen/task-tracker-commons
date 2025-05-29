package org.mrshoffen.tasktracker.commons.kafka.event.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskUpdatedEvent {

    public static final String TOPIC = "event.task.updated";

    private UUID workspaceId;
    private UUID deskId;
    private UUID taskId;
    private Map<String, Object> updatedField;
    private Instant updatedAt;
    private UUID updatedBy;
}
