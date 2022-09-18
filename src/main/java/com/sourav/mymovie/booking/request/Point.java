package com.sourav.mymovie.booking.request;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Point {
    private Integer x;
    private Integer y;
    private String status;
}
