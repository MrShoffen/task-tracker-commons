package org.mrshoffen.tasktracker.commons.web.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class TaskCommentsCountDto {
    private UUID taskId;
    private Long count;
    private Long unreadCount;
}
