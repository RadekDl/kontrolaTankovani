package com.radek;

import java.time.LocalDate;
import java.time.LocalTime;

public class PrirustekVNadrzi {
    private Auto auto;
    private double prirustekVLitrech;
    private LocalDate datum;
    private LocalTime cas;

    public PrirustekVNadrzi(double prirustekVLitrech, LocalDate datum, LocalTime cas) {
        this.prirustekVLitrech = prirustekVLitrech;
        this.datum = datum;
        this.cas = cas;
    }


}
