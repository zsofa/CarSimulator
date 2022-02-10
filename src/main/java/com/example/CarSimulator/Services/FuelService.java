package com.example.CarSimulator.Services;

import com.example.CarSimulator.Models.Fuel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuelService {

    @Autowired
    private SpeedService speedService;
    private Fuel fuel;

    public List<Integer> getRoundSpeeds() {
        return speedService.getRoadSpeeds();
    }

    public int getSumOfKmFromRounds() {
        List<Integer> rounds = speedService.getRoadSpeeds();
        int sum = 0;

        for (int i = 0; i < rounds.size(); i++) {
            sum += rounds.get(i);
        }

        return sum;
    }


    public int getRoundConsumption() {
        return (getSumOfKmFromRounds() / 100) * fuel.getConsumption();

    }

    public int getFuelLevel() {
        int actual = fuel.getTank() - getRoundConsumption();
        fuel.setTank(actual);
        return fuel.getTank();
    }



}
