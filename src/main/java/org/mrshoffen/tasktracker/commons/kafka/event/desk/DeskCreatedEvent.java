package org.mrshoffen.tasktracker.commons.kafka.event.desk;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mrshoffen.tasktracker.commons.web.dto.DeskResponseDto;

import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeskCreatedEvent {

    public static final String TOPIC = "event.desk.created";

    private DeskResponseDto createdDesk;
}
