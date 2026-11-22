package com.radek;

public class Auto {
    private String spz;
    private String intCislo;
    private String jmenoRidice;

    public Auto(String spz, String intCislo, String jmenoRidice) {
        this.spz = spz;
        this.intCislo = intCislo;
        this.jmenoRidice = jmenoRidice;
    }

    public String getSpz() {
        return spz;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "spz = '" + spz + '\'' +
                ", intCislo = '" + intCislo + '\'' +
                ", jmenoRidice = '" + jmenoRidice + '\'' +
                '}';
    }
}
