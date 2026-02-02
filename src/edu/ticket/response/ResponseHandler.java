package edu.ticket.response;

import edu.ticket.Ticket;

/**
 * الگوی Strategy: رابط استراتژی‌های مختلف برای تولید و ارسال پاسخ
 */
public interface ResponseHandler {
    void sendResponse(Ticket ticket);
}
