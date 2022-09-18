package com.sourav.mymovie.booking.integration;

import com.sourav.mymovie.booking.request.BookingRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Component
public class PaymentGateway {

    // Call third party api provider and initiate a transaction
    // On successful transactions , a transaction Id will be generated and amount is deducted
    RestTemplate template;
    URI uri;
    public String doTransactions(BookingRequest bookingRequest) {

        String response = template.getForObject(uri, String.class);
        return response;
    }

}
