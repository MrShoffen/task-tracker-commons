package org.mrshoffen.tasktracker.commons.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
public class DeskDto extends ResourceDto {
    private UUID id;
    private String name;
    private Instant createdAt;

    private UUID userId;
    private UUID workspaceId;

}