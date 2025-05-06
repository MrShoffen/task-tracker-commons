package org.mrshoffen.tasktracker.commons.bff.web.dto;

import lombok.Data;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class FullWorkspaceDto {
    private UUID id;
    private String name;
    private Boolean isPublic;

    private Instant createdAt;

    private UUID userId;

    List<FullDeskDto> desks = new ArrayList<>();
}
