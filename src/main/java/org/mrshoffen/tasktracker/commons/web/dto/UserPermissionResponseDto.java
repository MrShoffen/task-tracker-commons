package org.mrshoffen.tasktracker.commons.web.dto;

import lombok.Data;
import org.mrshoffen.tasktracker.commons.web.permissions.Permission;

import java.util.List;
import java.util.UUID;

@Data
public class UserPermissionResponseDto extends ResourceDto {
    private Long id;
    private UUID userId;
    private UUID workspaceId;
    private List<Permission> permissions;
}
