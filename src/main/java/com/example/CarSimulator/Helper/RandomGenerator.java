package com.example.CarSimulator.Helper;

import com.example.CarSimulator.Models.Speed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class RandomGenerator {

    @Autowired
    private Speed speed;

    private Random random = new Random();
    private int minHour = 1;
    private int maxHour = 3;

    public int hourGenerator() {
        return random.nextInt(maxHour - minHour) + minHour;
    }

    public List<Integer> getRoadSpeeds() {

        List<Integer> roundSpeeds = new ArrayList<>();
        List<Integer> speedList = speed.getSpeed();

        for (int i = 0; i < hourGenerator(); i++) {
            roundSpeeds.add(speedList.get(random.nextInt(speedList.size())));
        }

        return roundSpeeds;
    }
}
