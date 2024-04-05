package com.redbus.RedBus.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "driver_info")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String driverName;
    private String driverLicenseNumber;
    private String aadharNumber;
    private String contactNumber;
    private String alternateContactNumber;
    private String emailId;

    @OneToOne(mappedBy = "driver")
    private Bus bus;
}
