package edu.ticket.type;

import edu.ticket.Ticket;

/**
 * استراتژی مدیریت درخواست‌های نوع عمومی
 */
public class GenericTypeHandler implements TypeHandler {
    @Override
    public void assignTicket(Ticket ticket) {
        System.out.println("Assigned to support");
    }
}
