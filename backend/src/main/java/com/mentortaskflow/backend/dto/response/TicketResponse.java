package com.mentortaskflow.backend.dto.response;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Data;

@Data
public class TicketResponse {
    private UUID id;
    private String title;
    private String description;
    private String status;
    private LocalDateTime createdAt;
}
