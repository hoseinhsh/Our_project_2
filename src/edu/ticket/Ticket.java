package edu.ticket;

import edu.ticket.state.TicketState;
import edu.ticket.state.NewState;

/**
 * کلاس Ticket با استفاده از الگوی State برای مدیریت وضعیت‌ها
 */
public class Ticket {
    private int id;
    private TicketState state;
    private String channel;
    private String type;
    private String request;
    private String response;

    public Ticket(int id, String channel, String type) {
        this.id = id;
        this.channel = channel;
        this.type = type;
        this.state = new NewState(); // وضعیت اولیه
    }

    public String getStatus() {
        return state.getStatusName();
    }

    public void setState(TicketState state) {
        this.state = state;
    }

    public TicketState getState() {
        return state;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public int getId() {
        return this.id;
    }
}
