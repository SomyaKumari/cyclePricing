package com.cycle.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class BreakAndHandle {

    private String type;
    private Double price = 0.0;
    public BreakAndHandle(){

    }
}
