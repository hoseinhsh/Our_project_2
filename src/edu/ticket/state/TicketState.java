package edu.ticket.state;

import edu.ticket.Ticket;

/**
 * الگوی State: رابط وضعیت‌های مختلف تیکت
 */
public interface TicketState {
    void handle(Ticket ticket);
    String getStatusName();
}
