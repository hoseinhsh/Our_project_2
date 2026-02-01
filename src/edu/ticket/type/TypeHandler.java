package edu.ticket.type;

import edu.ticket.Ticket;

/**
 * الگوی Strategy: رابط استراتژی‌های مختلف برای مدیریت انواع درخواست
 */
public interface TypeHandler {
    void assignTicket(Ticket ticket);
}
