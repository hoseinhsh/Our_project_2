package edu.ticket.state;

import edu.ticket.Ticket;
import edu.ticket.type.TypeHandler;
import edu.ticket.type.TypeHandlerFactory;

/**
 * وضعیت ارجاع داده شده: تیکت به واحد مناسب ارجاع شده
 */
public class AssignedState implements TicketState {
    @Override
    public void handle(Ticket ticket) {
        // استفاده از Strategy Pattern برای مدیریت نوع درخواست
        TypeHandler typeHandler = TypeHandlerFactory.getHandler(ticket.getType());
        typeHandler.assignTicket(ticket);
        
        // تغییر وضعیت به IN_PROGRESS
        ticket.setState(new InProgressState());
    }

    @Override
    public String getStatusName() {
        return "ASSIGNED";
    }
}
