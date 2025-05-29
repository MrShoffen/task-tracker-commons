package org.mrshoffen.tasktracker.commons.kafka.event.workspace;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mrshoffen.tasktracker.commons.web.dto.TaskResponseDto;
import org.mrshoffen.tasktracker.commons.web.dto.WorkspaceResponseDto;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkspaceUpdatedEvent {

    public static final String TOPIC = "event.workspace.updated";

    private WorkspaceResponseDto updatedWorkspace;
}
