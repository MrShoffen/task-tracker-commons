package org.mrshoffen.tasktracker.commons.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class WorkspaceResponseDto extends ResourceDto {
    private UUID id;
    private String name;
    private Boolean isPublic;
    private Instant createdAt;

    private UUID userId;

}