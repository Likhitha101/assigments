package com.example.project2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.project2.Repositories.DriverRepo;
import com.example.project2.entities.*;
import java.util.List;

@RestController
@RequestMapping("/api/drivers")
@CrossOrigin(origins = "http://localhost:4200") // Allow frontend requests
public class DriverController {

    @Autowired
    private DriverRepo driverRepo;

    @PostMapping("/register")
    public ResponseEntity<?> registerDriver(@RequestBody Drivers driver) {
        driver.setRole(Role.DRIVER);  // Automatically set role
        driverRepo.save(driver);      // Save to DB
        return ResponseEntity.ok("Driver registered successfully");
    }

    @GetMapping("/all")
    public List<Drivers> getAllDrivers() {
        return driverRepo.findAll();
    }
}
