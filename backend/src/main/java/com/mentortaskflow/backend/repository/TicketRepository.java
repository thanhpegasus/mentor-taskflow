package com.mentortaskflow.backend.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mentortaskflow.backend.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, UUID> {
    
}
