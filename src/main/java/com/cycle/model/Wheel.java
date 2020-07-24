package com.cycle.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class Wheel {

    private Spoke spokes;
    private Rim rim;
    private Tube tube;
    private Tyre tyre;
    private Double price = 0.0;
    public Wheel(){

    }
}
