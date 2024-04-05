package com.redbus.RedBus.payloads;

import com.redbus.RedBus.entity.Bus;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDto {
    private String driverName;
    private String driverLicenseNumber;
    private String aadharNumber;
    private String contactNumber;
    private String alternateContactNumber;
    private String emailId;
    private Bus bus;
}
