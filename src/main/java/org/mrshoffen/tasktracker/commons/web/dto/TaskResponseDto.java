package org.mrshoffen.tasktracker.commons.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
public class TaskResponseDto extends ResourceDto {
    private UUID id;
    private String name;
    private Boolean completed;
    private Instant createdAt;
    private String color;
    private String coverUrl;

    private Long orderIndex;

    private UUID userId;
    private UUID workspaceId;
    private UUID deskId;

}