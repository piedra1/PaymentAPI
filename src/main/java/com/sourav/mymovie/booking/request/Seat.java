package com.sourav.mymovie.booking.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@Slf4j
@EqualsAndHashCode
public class Seat {

    private List<Point> points;
}
