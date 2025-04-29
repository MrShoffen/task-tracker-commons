package org.mrshoffen.tasktracker.commons.kafka.event.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegistrationSuccessfulEvent {

    public static final String TOPIC = "event.registration.success";

    private UUID userId;

    private String email;
    private String hashedPassword;

    private String timeZone;
    private String country;
    private String region;
}
