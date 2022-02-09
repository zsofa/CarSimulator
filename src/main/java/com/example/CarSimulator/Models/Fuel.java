package com.example.CarSimulator.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Fuel {
    private static final int FULL_TANK = 50; // fuel measured in liter
    private int actualAmountOfFuel;

}
