package org.mrshoffen.tasktracker.commons.kafka.event.desk;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeskDeletedEvent {

    public static final String TOPIC = "event.desk.deleted";

    private UUID userId;
    private UUID workspaceId;
    private UUID deskId;

}
