package com.redbus.RedBus.repository;

import com.redbus.RedBus.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus,Long> {
}
