import edu.ticket.Ticket;
import edu.ticket.TicketService;
import edu.ticket.factory.TicketFactory;

public class Main {

    public static void main(String[] args) {

        TicketService ticketService = new TicketService();

        // Example 1: Bug reported from web (استفاده از Factory Pattern)
        Ticket ticket = TicketFactory.createTicket(1, "WEB", "BUG");
        ticket.setRequest("I see a very very BAD BUG!");
        ticketService.handle(ticket);
        
        System.out.println("\n--- Example 2: Generic request from email ---");
        Ticket ticket2 = TicketFactory.createTicket(2, "EMAIL", "FEATURE");
        ticket2.setRequest("I need a new feature!");
        ticketService.handle(ticket2);
    }
}
