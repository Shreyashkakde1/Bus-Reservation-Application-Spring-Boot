package com.redbus.RedBus.service.impl;

import com.redbus.RedBus.entity.Driver;
import com.redbus.RedBus.payloads.DriverDto;
import com.redbus.RedBus.repository.DriverRepository;
import com.redbus.RedBus.service.DriverService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {
    @Autowired
    private DriverRepository driverRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public DriverDto addDriver(DriverDto driver) {
        Driver newDriver = modelMapper.map(driver, Driver.class);

        Driver savedDriver = driverRepository.save(newDriver);
        return modelMapper.map(savedDriver,DriverDto.class);

    }
}
