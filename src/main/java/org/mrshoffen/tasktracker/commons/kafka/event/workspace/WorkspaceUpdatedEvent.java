package org.mrshoffen.tasktracker.commons.kafka.event.workspace;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mrshoffen.tasktracker.commons.web.dto.TaskResponseDto;
import org.mrshoffen.tasktracker.commons.web.dto.WorkspaceResponseDto;

import java.time.Instant;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkspaceUpdatedEvent {

    public static final String TOPIC = "event.workspace.updated";

    private Map<String, Objects> updatedField;
    private Instant updatedAt;
    private UUID updatedBy;
}
