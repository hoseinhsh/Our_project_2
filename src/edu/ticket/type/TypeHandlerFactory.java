package edu.ticket.type;

/**
 * Factory برای ایجاد TypeHandler مناسب
 */
public class TypeHandlerFactory {
    public static TypeHandler getHandler(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }
        
        switch (type.toUpperCase()) {
            case "BUG":
                return new BugTypeHandler();
            default:
                return new GenericTypeHandler();
        }
    }
}
