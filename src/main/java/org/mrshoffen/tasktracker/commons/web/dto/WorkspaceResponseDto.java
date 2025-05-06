package org.mrshoffen.tasktracker.commons.web.dto;

import lombok.Data;
import org.mrshoffen.tasktracker.commons.utils.HateoasLinks;

import java.time.Instant;
import java.util.UUID;

@Data
public class WorkspaceResponseDto {
    private UUID id;
    private String name;
    private Boolean isPublic;
    private Instant createdAt;

    private UUID userId;

    private HateoasLinks api;
}