package edu.ticket.factory;

import edu.ticket.Ticket;

/**
 * الگوی Factory: برای ایجاد تیکت‌ها با تنظیمات مناسب
 * این الگو امکان ایجاد آبجکت‌های پیچیده را به صورت مرحله به مرحله فراهم می‌کند
 */
public class TicketFactory {
    
    /**
     * ایجاد تیکت جدید با پارامترهای داده شده
     * 
     * @param id شناسه تیکت
     * @param channel کانال ورودی (WEB, EMAIL)
     * @param type نوع درخواست (BUG, ...)
     * @return تیکت جدید
     */
    public static Ticket createTicket(int id, String channel, String type) {
        // اعتبارسنجی ورودی‌ها
        validateInputs(channel, type);
        
        // ایجاد تیکت با وضعیت اولیه NEW
        Ticket ticket = new Ticket(id, channel, type);
        
        return ticket;
    }
    
    /**
     * اعتبارسنجی ورودی‌ها
     */
    private static void validateInputs(String channel, String type) {
        if (channel == null || channel.trim().isEmpty()) {
            throw new IllegalArgumentException("Channel cannot be null or empty");
        }
        
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Type cannot be null or empty");
        }
        
        // اعتبارسنجی کانال
        String upperChannel = channel.toUpperCase();
        if (!upperChannel.equals("WEB") && !upperChannel.equals("EMAIL")) {
            throw new IllegalArgumentException("Invalid channel: " + channel);
        }
    }
}
