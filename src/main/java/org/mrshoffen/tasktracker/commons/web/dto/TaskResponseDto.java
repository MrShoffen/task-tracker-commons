package org.mrshoffen.tasktracker.commons.web.dto;

import lombok.Data;
import org.mrshoffen.tasktracker.commons.utils.HateoasLinks;

import java.time.Instant;
import java.util.UUID;


@Data
public class TaskResponseDto {
    private UUID id;
    private String name;
    private Boolean completed;
    private Instant createdAt;
    private UUID parentTaskId;

    private UUID userId;
    private UUID workspaceId;
    private UUID deskId;

    private HateoasLinks api;
}