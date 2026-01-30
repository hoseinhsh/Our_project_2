package edu.ticket.state;

import edu.ticket.Ticket;
import edu.ticket.channel.ChannelHandler;
import edu.ticket.channel.ChannelHandlerFactory;

/**
 * وضعیت جدید: تیکت تازه ایجاد شده
 */
public class NewState implements TicketState {
    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket created");
        
        // استفاده از Strategy Pattern برای مدیریت کانال
        ChannelHandler channelHandler = ChannelHandlerFactory.getHandler(ticket.getChannel());
        channelHandler.handleChannel(ticket);
        
        // تغییر وضعیت به ASSIGNED
        ticket.setState(new AssignedState());
    }

    @Override
    public String getStatusName() {
        return "NEW";
    }
}
