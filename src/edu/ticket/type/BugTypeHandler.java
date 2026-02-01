package edu.ticket.type;

import edu.ticket.Ticket;

/**
 * استراتژی مدیریت درخواست‌های نوع BUG
 */
public class BugTypeHandler implements TypeHandler {
    @Override
    public void assignTicket(Ticket ticket) {
        System.out.println("Assigned to engineering");
    }
}
