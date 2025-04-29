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
public class RegistrationFailedEvent {

    public static final String TOPIC = "event.registration.failed";

    private UUID registrationId;
}
