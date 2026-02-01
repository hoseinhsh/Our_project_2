package edu.ticket.channel;

import edu.ticket.Ticket;

/**
 * استراتژی مدیریت کانال وب
 */
public class WebChannelHandler implements ChannelHandler {
    @Override
    public void handleChannel(Ticket ticket) {
        System.out.println("Received from web");
    }
}
