package org.mrshoffen.tasktracker.commons.kafka.event.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskDeletedEvent {

    public static final String TOPIC = "event.task.deleted";

    //todo deleted BY
    private UUID userId;
    private UUID workspaceId;
    private UUID deskId;
    private UUID taskId;

    private Instant deletedAt;
}
