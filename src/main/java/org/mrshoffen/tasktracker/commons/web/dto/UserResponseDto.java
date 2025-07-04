package org.mrshoffen.tasktracker.commons.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class UserResponseDto {
    String email;
    String firstName;
    String lastName;
    String avatarUrl;
    String country;
    String region;
}