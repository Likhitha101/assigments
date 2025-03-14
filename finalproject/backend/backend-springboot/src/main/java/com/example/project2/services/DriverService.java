// DriverService.java
package com.example.project2.services;

import com.example.project2.entities.Drivers;

import lombok.RequiredArgsConstructor;

import com.example.project2.Repositories.DriverRepo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverService {
    private final DriverRepo driverRepository = null;

    public List<Drivers> getAvailableDrivers() {
        return driverRepository.findByAvailableTrueAndApprovedTrue();
    }

    public void updateDriverAvailability(Long driverId, boolean available) {
        Drivers driver = driverRepository.findById(driverId)
                .orElseThrow(() -> new RuntimeException("Driver not found"));
        driver.setAvailable(available);
        driverRepository.save(driver);
    }
}