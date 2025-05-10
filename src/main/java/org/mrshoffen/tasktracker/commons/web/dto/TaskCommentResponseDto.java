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
    UUID id;
    private String message;
    private Instant createdAt = Instant.now();
    private UUID userId;
    private String authorEmail;
    private UUID workspaceId;
    private UUID deskId;
}
