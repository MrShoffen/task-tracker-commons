package org.mrshoffen.tasktracker.commons.kafka.event.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskCreatedEvent {

    public static final String TOPIC = "event.task.created";

    private UUID userId;
    private UUID workspaceId;
    private UUID deskId;
    private UUID taskId;

}
