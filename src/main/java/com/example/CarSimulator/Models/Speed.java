package com.example.CarSimulator.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Speed {
    private static final int MIN_SPEED = 0; // speed is measured in km/h
    private static final int MAX_SPEED = 170;
    private int actualSpeed;

}
