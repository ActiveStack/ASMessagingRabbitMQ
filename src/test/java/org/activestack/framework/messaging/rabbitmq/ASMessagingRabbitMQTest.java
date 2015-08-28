package org.activestack.framework.messaging.rabbitmq;


import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

public class ASMessagingRabbitMQTest
{
    @Test
    public void testSendMessage() throws Exception {
        final ASMessagingRabbitMQ asMessaging = new ASMessagingRabbitMQ();

        final String someMessage = "someMessage";

        asMessaging.sendMessage(someMessage);

        // @todo Verify message was sent
    }

}
