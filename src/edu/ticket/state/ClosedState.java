package edu.ticket.state;

import edu.ticket.Ticket;

/**
 * وضعیت بسته شده: تیکت بسته شده است
 */
public class ClosedState implements TicketState {
    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket closed");
        // وضعیت نهایی - هیچ تغییری نمی‌دهد
    }

    @Override
    public String getStatusName() {
        return "CLOSED";
    }
}
