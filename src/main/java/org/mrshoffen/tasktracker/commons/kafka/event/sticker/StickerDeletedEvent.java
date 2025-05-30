package org.mrshoffen.tasktracker.commons.kafka.event.sticker;

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
public class StickerDeletedEvent {

    public static final String TOPIC = "event.sticker.deleted";

    private UUID userId;
    private UUID workspaceId;
    private UUID deskId;
    private UUID taskId;
    private UUID stickerId;

    private Instant deletedAt;
}
