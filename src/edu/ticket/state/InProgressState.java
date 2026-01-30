package edu.ticket.state;

import edu.ticket.Ticket;
import edu.ticket.response.ResponseHandler;
import edu.ticket.response.ResponseHandlerFactory;

/**
 * وضعیت در حال رسیدگی: تیکت در حال پردازش است
 */
public class InProgressState implements TicketState {
    @Override
    public void handle(Ticket ticket) {
        System.out.println("Working on ticket");
        
        // استفاده از Strategy Pattern برای تولید پاسخ
        ResponseHandler responseHandler = ResponseHandlerFactory.getHandler(ticket.getType());
        responseHandler.sendResponse(ticket);
        
        // تغییر وضعیت به RESOLVED
        ticket.setState(new ResolvedState());
    }

    @Override
    public String getStatusName() {
        return "IN_PROGRESS";
    }
}
