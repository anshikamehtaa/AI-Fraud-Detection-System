package com.anshika.frauddetection.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserResponseDTO {
    private Long id;
    private String name;
    private String email;
    private String role;
}
