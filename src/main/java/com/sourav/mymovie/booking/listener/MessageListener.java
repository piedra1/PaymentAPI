package com.sourav.mymovie.booking.listener;

import com.sourav.mymovie.booking.integration.PaymentGateway;
import com.sourav.mymovie.booking.request.BookingRequest;
import com.sourav.mymovie.booking.transformer.MessageTransformer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageListener implements RabbitListenerConfigurer {

    @Autowired
    PaymentGateway paymentGateway;

    @Override
    public void configureRabbitListeners(RabbitListenerEndpointRegistrar registrar) {
        // registrar.
    }

    @RabbitListener(queues = "${spring.rabbitmq.queue}", concurrency = "3")
    public String receiveMessage(BookingRequest object) {
        log.info("Recieved Object " + object.toString());
        String rsp = paymentGateway.doTransactions(object);
        return rsp;
    }
}
