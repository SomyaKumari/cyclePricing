package com.cycle.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rim {
    private String type;
    private Double price;
    public Rim(){

    }
}
