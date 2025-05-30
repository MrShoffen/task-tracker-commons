package org.mrshoffen.tasktracker.commons.kafka.event.registration;

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

    private UUID registrationId;
    private String email;
    private String hashedPassword;

    private String firstName;
    private String lastName;

    private String avatarUrl;

    private String country;
    private String region;
}
