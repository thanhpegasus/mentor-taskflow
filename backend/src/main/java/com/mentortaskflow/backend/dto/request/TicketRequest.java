package com.mentortaskflow.backend.dto.request;

import lombok.Data;

@Data
public class TicketRequest {
    private String title;
    private String description;
}
