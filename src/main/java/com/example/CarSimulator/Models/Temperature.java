package com.example.CarSimulator.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Temperature {
    private static final int MAX_TEMP = 30; // temperature measured in celsius
    private static final int MIN_TEMP = 10;
    private int outsideTemp;
    private int actualCarTemp;

}
