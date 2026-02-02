package edu.ticket.logger;

import edu.ticket.Ticket;

/**
 * کلاس برای ثبت لاگ عملیات تیکت
 */
public class Logger {
    public static void log(Ticket ticket) {
        System.out.println("Logging ticket handling : " + ticket.getId() + " -> " + ticket.getStatus());
    }
}
