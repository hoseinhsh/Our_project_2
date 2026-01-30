package edu.ticket.state;

import edu.ticket.Ticket;

/**
 * وضعیت حل شده: تیکت حل شده است
 */
public class ResolvedState implements TicketState {
    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket resolved");
        ticket.setState(new ClosedState());
    }

    @Override
    public String getStatusName() {
        return "RESOLVED";
    }
}
