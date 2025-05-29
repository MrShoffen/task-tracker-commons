package org.mrshoffen.tasktracker.commons.kafka.event.desk;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mrshoffen.tasktracker.commons.web.dto.DeskResponseDto;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeskUpdatedEvent {

    public static final String TOPIC = "event.desk.updated";

    private DeskResponseDto updatedDesk;

}
