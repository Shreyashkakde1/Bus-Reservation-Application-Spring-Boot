package com.redbus.RedBus.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusDto {
    private String busNumber;
    private String busType;
    private String fromLocation;
    private String toLocation;


    private Date fromDate;


    private Date toDate;

    private int totalDuration; // in minutes
    private String fromTime;
    private String toTime;
    private double price;
    private int totalSeats;
    private int availableSeats;

}
