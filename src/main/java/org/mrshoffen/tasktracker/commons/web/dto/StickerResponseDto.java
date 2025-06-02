package org.mrshoffen.tasktracker.commons.web.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;


@Data
@NoArgsConstructor
public class StickerResponseDto {
    private UUID id;
    private String name;
    private Instant createdAt;
    private String color;
    private String icon;
    private UUID userId;
    private UUID workspaceId;
    private UUID taskId;

}