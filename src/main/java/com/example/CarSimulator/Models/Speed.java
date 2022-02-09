package com.example.CarSimulator.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter

public class Speed {
    private  List<Integer> speed; // speed is measured in km/h

    public Speed(List<Integer> speed) {
        this.speed = new ArrayList<>();
    }
}
