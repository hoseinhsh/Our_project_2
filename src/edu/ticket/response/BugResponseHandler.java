package edu.ticket.response;

import edu.ticket.Ticket;

/**
 * استراتژی تولید پاسخ برای درخواست‌های نوع BUG
 */
public class BugResponseHandler implements ResponseHandler {
    @Override
    public void sendResponse(Ticket ticket) {
        System.out.println("Sending bug response");
        ticket.setResponse("Bug response sent");
    }
}
