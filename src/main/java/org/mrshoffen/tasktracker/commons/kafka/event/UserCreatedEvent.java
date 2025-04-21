package org.mrshoffen.tasktracker.commons.kafka.event;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class UserCreatedEvent {
    UUID id;
    String email;
}
