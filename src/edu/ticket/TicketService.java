package edu.ticket;

import edu.ticket.logger.Logger;

/**
 * سرویس مدیریت تیکت با استفاده از الگوهای طراحی
 */
public class TicketService {

    /**
     * پردازش تیکت با استفاده از الگوی State
     * هر وضعیت خودش رفتار مناسب را مدیریت می‌کند
     */
    public void handle(Ticket ticket) {
        // پردازش تیکت بر اساس وضعیت فعلی آن
        ticket.getState().handle(ticket);
        
        // ثبت لاگ عملیات
        Logger.log(ticket);
    }
}
