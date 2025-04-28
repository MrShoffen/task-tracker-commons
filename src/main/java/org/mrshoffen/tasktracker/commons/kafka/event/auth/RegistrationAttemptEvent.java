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
public class RegistrationAttemptEvent {

    public static final String TOPIC = "event.registration.new";

    private UUID registrationId;
    private String email;
    private String timeZone;
    private String country;
    private String region;
}
