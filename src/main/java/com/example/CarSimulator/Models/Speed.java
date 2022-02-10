package com.example.CarSimulator.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Speed {
    private List<Integer> speed; // speed is measured in km/h

    public Speed(List<Integer> speed) {
        this.speed = new ArrayList<>();
        speed.add(30);
        speed.add(50);
        speed.add(70);
        speed.add(90);
        speed.add(100);
        speed.add(130);
    }
}
