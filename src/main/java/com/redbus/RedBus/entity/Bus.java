package com.redbus.RedBus.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bus_operator")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long busId;
    @Column(name = "bus_number", unique = true)
    private String busNumber;
    private String busType;
    private String fromLocation;
    private String toLocation;
    private LocalDate fromDate;
    private LocalDate toDate;
    private int totalDuration; // in minutes
    private String fromTime;
    private String toTime;
    private double price;
    private int totalSeats;
    private int availableSeats;

    @OneToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;
}
