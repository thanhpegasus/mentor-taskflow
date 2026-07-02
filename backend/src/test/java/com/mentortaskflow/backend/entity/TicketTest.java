package com.mentortaskflow.backend.entity;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.jupiter.api.Test;

class TicketTest {

	@Test
	void shouldSetAndGetTicketFields() {
		Ticket ticket = new Ticket();
		UUID id = UUID.randomUUID();
		LocalDateTime createdAt = LocalDateTime.now();

		ticket.setId(id);
		ticket.setTitle("Fix login bug");
		ticket.setDescription("User cannot login with valid account");
		ticket.setStatus("OPEN");
		ticket.setCreatedAt(createdAt);

		assertThat(ticket.getId()).isEqualTo(id);
		assertThat(ticket.getTitle()).isEqualTo("Fix login bug");
		assertThat(ticket.getDescription()).isEqualTo("User cannot login with valid account");
		assertThat(ticket.getStatus()).isEqualTo("OPEN");
		assertThat(ticket.getCreatedAt()).isEqualTo(createdAt);
	}
}
