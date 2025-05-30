package org.mrshoffen.tasktracker.commons.kafka.event.sticker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mrshoffen.tasktracker.commons.web.dto.TaskResponseDto;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StickerCreatedEvent {

    public static final String TOPIC = "event.sticker.created";

    private TaskResponseDto createdSticker;
}
