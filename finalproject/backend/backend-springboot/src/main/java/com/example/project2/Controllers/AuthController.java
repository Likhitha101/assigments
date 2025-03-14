package com.example.project2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.project2.entities.*;
import com.example.project2.Repositories.Customerrepo;
import com.example.project2.Repositories.DriverRepo;
import com.example.project2.dto.LoginRequest;
import com.example.project2.dto.LoginResponse;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200") // Allow Angular requests
public class AuthController {

    @Autowired
    private Customerrepo customerRepo;

    @Autowired
    private DriverRepo driverRepo;

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest) {
        
        if (loginRequest.getEmail().equals("admin@example.com") && loginRequest.getPassword().equals("admin123")) {
            return ResponseEntity.ok().body(new LoginResponse(0L, "ADMIN", "Login successful"));
        }

        // Check in Customer table
        Optional<Customer> customerOpt = customerRepo.findByEmail(loginRequest.getEmail());
        if (customerOpt.isPresent() && customerOpt.get().getPassword().equals(loginRequest.getPassword())) {
            return ResponseEntity.ok().body(
                new LoginResponse(customerOpt.get().getId(), customerOpt.get().getRole().toString(), "Login successful")
            );
        }

        // Check in Drivers table
        Optional<Drivers> driverOpt = driverRepo.findByEmail(loginRequest.getEmail());
        if (driverOpt.isPresent() && driverOpt.get().getPassword().equals(loginRequest.getPassword())) {
            return ResponseEntity.ok().body(
                new LoginResponse(driverOpt.get().getId(), driverOpt.get().getRole().toString(), "Login successful")
            );
        }

        // If no user found
        return ResponseEntity.badRequest().body("Invalid email or password");
    }
}