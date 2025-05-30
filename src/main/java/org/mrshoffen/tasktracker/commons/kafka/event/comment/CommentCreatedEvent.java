package org.mrshoffen.tasktracker.commons.kafka.event.comment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mrshoffen.tasktracker.commons.web.dto.TaskCommentResponseDto;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentCreatedEvent {

    public static final String TOPIC = "event.comment.created";

    private TaskCommentResponseDto createdSticker;

}
