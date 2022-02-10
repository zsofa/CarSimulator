package com.example.CarSimulator.Controllers;

import com.example.CarSimulator.Services.FuelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuelController {

    @Autowired
    FuelService fuelService;

    @GetMapping("/drive_consumption")
    public ResponseEntity<Integer> getOneRoadConsumption() {
        int literPerRound = fuelService.getRoundConsumption();
        if (literPerRound == 0) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(literPerRound, HttpStatus.OK);
        }
    }

    @GetMapping("/fuel_level")
    public ResponseEntity<Integer> getFuelLevelAfterRound() {
        int fuelPerRound = fuelService.getFuelLevel();
        return new ResponseEntity<>(fuelPerRound, HttpStatus.OK);
    }
}
