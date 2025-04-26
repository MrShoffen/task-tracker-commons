package org.mrshoffen.tasktracker.commons.kafka.event.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserCreatedEvent {

    public static final String TOPIC = "event.users.created";

    private UUID id;
    private String email;
    private String userIpAddr;
}
