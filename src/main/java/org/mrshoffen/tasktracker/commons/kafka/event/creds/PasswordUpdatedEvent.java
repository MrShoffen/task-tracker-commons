package org.mrshoffen.tasktracker.commons.kafka.event.creds;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class PasswordUpdatedEvent {

    public static final String TOPIC = "event.credentials.email-update-attempt";

    private UUID userId;
    private String newHashedPassword;
}
