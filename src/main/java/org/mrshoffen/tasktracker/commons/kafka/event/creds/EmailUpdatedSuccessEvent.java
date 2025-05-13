package org.mrshoffen.tasktracker.commons.kafka.event.creds;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class EmailUpdatedSuccessEvent {

    public static final String TOPIC = "event.credentials.email-updated";

    private UUID userId;
    private String newEmail;
}
