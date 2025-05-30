package org.mrshoffen.tasktracker.commons.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class WorkspaceResponseDto {
    private UUID id;
    private String name;
    private Boolean isPublic;
    private String coverUrl;
    private Instant createdAt;

    private UUID userId;

}