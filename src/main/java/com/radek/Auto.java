package com.radek;

import java.util.ArrayList;

public class Auto {
    private String spz;
    private String intCislo;
    private ArrayList<Tankovani> seznamTankovani = new ArrayList<>();


    public Auto(String spz, String intCislo) {
        this.spz = spz;
        this.intCislo = intCislo;

    }


    public String getSpz() {
        return spz;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "spz='" + spz + '\'' +
                ", intCislo='" + intCislo + '\'' +
                ", seznamTankovani=" + seznamTankovani+
                '}';
    }
}
