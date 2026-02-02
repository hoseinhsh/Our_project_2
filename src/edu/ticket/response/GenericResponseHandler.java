package edu.ticket.response;

import edu.ticket.Ticket;

/**
 * استراتژی تولید پاسخ برای درخواست‌های عمومی
 */
public class GenericResponseHandler implements ResponseHandler {
    @Override
    public void sendResponse(Ticket ticket) {
        System.out.println("Sending generic response");
        ticket.setResponse("Generic response sent");
    }
}
