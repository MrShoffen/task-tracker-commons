package org.mrshoffen.tasktracker.commons.kafka.event.authentication;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthenticationSuccessfulEvent {

    public static final String TOPIC = "event.authentication.success";

    private UUID userId;
    private String email;
    private String ipAddr;
}
