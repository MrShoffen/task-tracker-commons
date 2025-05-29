package org.mrshoffen.tasktracker.commons.kafka.event.desk;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeskUpdatedEvent {

    public static final String TOPIC = "event.desk.updated";

    private Map<String, Object> updatedField;
    private Instant updatedAt;
    private UUID updatedBy;
}
