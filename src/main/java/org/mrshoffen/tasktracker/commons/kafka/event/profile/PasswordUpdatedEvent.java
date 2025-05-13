package org.mrshoffen.tasktracker.commons.kafka.event.profile;

import lombok.Data;

import java.util.UUID;

@Data
public class PasswordUpdatedEvent {

    public static final String TOPIC ="event.account.password-updated";

    UUID userId;
    String newHashedPassword;
}
