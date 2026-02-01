package edu.ticket.channel;

import edu.ticket.Ticket;

/**
 * الگوی Strategy: رابط استراتژی‌های مختلف برای مدیریت کانال‌های ورودی
 */
public interface ChannelHandler {
    void handleChannel(Ticket ticket);
}
