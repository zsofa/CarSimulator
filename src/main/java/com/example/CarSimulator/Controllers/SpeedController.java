package com.example.CarSimulator.Controllers;

import com.example.CarSimulator.Services.SpeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpeedController {

    @Autowired
    SpeedService speedService;

    @GetMapping("/round_speeds")
    public ResponseEntity<List<Integer>> getOneRoundSpeeds() {
        List<Integer> speeds = speedService.getRoadSpeeds();
        if (speeds.isEmpty()) {
            return new ResponseEntity<>(speeds, HttpStatus.BAD_REQUEST);
        } else
            return new ResponseEntity<>(speeds, HttpStatus.OK);
    }
}
