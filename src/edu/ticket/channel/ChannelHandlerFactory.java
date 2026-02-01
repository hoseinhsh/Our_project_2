package edu.ticket.channel;

/**
 * Factory برای ایجاد ChannelHandler مناسب
 */
public class ChannelHandlerFactory {
    public static ChannelHandler getHandler(String channel) {
        if (channel == null) {
            throw new IllegalArgumentException("Channel cannot be null");
        }
        
        switch (channel.toUpperCase()) {
            case "WEB":
                return new WebChannelHandler();
            case "EMAIL":
                return new EmailChannelHandler();
            default:
                throw new IllegalArgumentException("Unknown channel: " + channel);
        }
    }
}
