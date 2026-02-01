package edu.ticket.channel;

import edu.ticket.Ticket;

/**
 * استراتژی مدیریت کانال ایمیل
 */
public class EmailChannelHandler implements ChannelHandler {
    @Override
    public void handleChannel(Ticket ticket) {
        System.out.println("Received from email");
    }
}
