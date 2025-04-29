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

    public RegistrationSuccessfulEvent(RegistrationAttemptEvent attempt){
        this.registrationId = attempt.getRegistrationId();
        this.email = attempt.getEmail();
        this.hashedPassword = attempt.getHashedPassword();
        this.timeZone = attempt.getTimeZone();
        this.country = attempt.getCountry();
        this.region = attempt.getRegion();
    }

    private UUID registrationId;

    private String email;
    private String hashedPassword;

    private String timeZone;
    private String country;
    private String region;
}
