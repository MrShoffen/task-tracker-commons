package org.mrshoffen.tasktracker.commons.kafka.event.comment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentDeletedEvent {

    public static final String TOPIC = "event.comment.deleted";

    private UUID userId;
    private UUID workspaceId;
    private UUID taskId;
    private UUID commentId;

    private Instant deletedAt;
}
