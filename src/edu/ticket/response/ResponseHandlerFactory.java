package edu.ticket.response;

/**
 * Factory برای ایجاد ResponseHandler مناسب
 */
public class ResponseHandlerFactory {
    public static ResponseHandler getHandler(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }
        
        switch (type.toUpperCase()) {
            case "BUG":
                return new BugResponseHandler();
            default:
                return new GenericResponseHandler();
        }
    }
}
