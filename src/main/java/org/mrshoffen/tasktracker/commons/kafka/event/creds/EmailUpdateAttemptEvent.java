package org.mrshoffen.tasktracker.commons.kafka.event.creds;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class EmailUpdateAttemptEvent {

    public static final String TOPIC = "event.credentials.password-updated";

    private UUID userId;
    private String newEmail;
    private String confirmationCode;
}
