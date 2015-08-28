package org.activestack.framework.messaging.rabbitmq;

import org.activestack.framework.messaging.ASMessaging;

/**
 * Describe the purpose of this interface here.
 */
public class ASMessagingRabbitMQ implements ASMessaging
{
    @Override
    public void sendMessage(final Object message){
        // do something to send a real message via RabbitMQ here...
    }
}
