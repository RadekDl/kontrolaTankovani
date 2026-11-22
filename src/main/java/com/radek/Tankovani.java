package com.radek;

public class Tankovani {
    private double prirustekVNadrzi;
    private double natankovano;
    private Auto auto;


    public Tankovani(double prirustekVNadrzi, double natankovano, Auto auto) {
        this.prirustekVNadrzi = prirustekVNadrzi;
        this.natankovano = natankovano;
        this.auto = auto;
    }

    public void vypisTankovaniSSpz(){
        System.out.println("tankovaní auta s SPZ: " + auto.getSpz() + ", natankováno: "
        + natankovano + ", přírustek v nádrži: " + prirustekVNadrzi + ", rozdíl v tankování je: "+ rozdíl);
    }
    double rozdíl = 0;

    public double rozdilMeziTankovanimAPrirustkemVNadrzi(){
        rozdíl = prirustekVNadrzi - natankovano;
        return rozdíl;
    }


    @Override
    public String toString() {
        return "Tankovani{" +
                "prirustekVNadrzi=" + prirustekVNadrzi +
                ", natankovano=" + natankovano +
                ", auto=" + auto.getSpz() +
                '}';
    }
}
