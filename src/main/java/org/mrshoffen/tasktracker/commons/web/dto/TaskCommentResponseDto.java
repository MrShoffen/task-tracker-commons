package org.mrshoffen.tasktracker.commons.web.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class TaskCommentResponseDto extends ResourceDto {
    private UUID id;
    private String message;
    private Instant createdAt = Instant.now();
    private UUID userId;
    private UUID workspaceId;
    private UUID deskId;
}
