package org.mrshoffen.tasktracker.commons.kafka.event.workspace;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkspaceCreatedEvent {

    public static final String TOPIC = "event.workspace.created";

    private UUID userId;
    private UUID workspaceId;

}
