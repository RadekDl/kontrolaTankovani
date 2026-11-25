package com.radek;

import java.time.LocalDate;
import java.time.LocalTime;

public class Tankovani {
    private Auto auto;
    private double natankovanoLitru;
    private LocalDate datumTankovani;
    private LocalTime casTankovani;


    public Tankovani(Auto auto, double natankovanoLitru, LocalDate datumTankovani, LocalTime casTankovani) {
        this.auto = auto;
        this.natankovanoLitru = natankovanoLitru;
        this.datumTankovani = datumTankovani;
        this.casTankovani = casTankovani;
    }

    @Override
    public String toString() {
        return "Tankovani{" +
                "auto=" + auto.getSpz() +
                ", natankovanoLitru=" + natankovanoLitru +
                ", datumTankovani=" + datumTankovani +
                ", casTankovani=" + casTankovani +
                 '}';
    }
}
