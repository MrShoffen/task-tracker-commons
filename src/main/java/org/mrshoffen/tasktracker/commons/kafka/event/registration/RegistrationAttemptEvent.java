package org.mrshoffen.tasktracker.commons.kafka.event.registration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegistrationAttemptEvent {

    public static final String TOPIC = "event.registration.new";

    private UUID registrationId;
    private String confirmationLink;
    private Instant validUntil;

    private String email;
    private String hashedPassword;

    private String firstName;
    private String lastName;

    private String avatarUrl;

    private String timeZone;
    private String country;
    private String region;
}
