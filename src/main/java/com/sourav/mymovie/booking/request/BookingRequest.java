package com.sourav.mymovie.booking.request;

import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Data
public class BookingRequest {

    private String bookingId;
    private Seat seat;
    private Date bookingDate;
    private Time showTime;
    private Long theatreId;
    private Integer movieId;

}
