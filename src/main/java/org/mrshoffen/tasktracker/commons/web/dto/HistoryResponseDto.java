package org.mrshoffen.tasktracker.commons.web.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mrshoffen.tasktracker.commons.web.history.RecordType;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;

@Data
@NoArgsConstructor
public class HistoryResponseDto {

    private UUID id;
    private RecordType type;
    private UUID taskId;
    private UUID workspaceId;
    private Instant timestamp;
    private UUID author;
    private Map<String, Object> additionalInfo;
}
