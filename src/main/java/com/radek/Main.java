package com.radek;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("1BA4567", "1026", "ADAM");
        Auto auto1 = new Auto("2BA5678", "1098", "DAVID");

        Tankovani tankovani = new Tankovani(156, 158.6, auto);
        Tankovani tankovani1 = new Tankovani(504, 504, auto1);

        tankovani.rozdilMeziTankovanimAPrirustkemVNadrzi();
        tankovani1.rozdilMeziTankovanimAPrirustkemVNadrzi();

        System.out.println("záporná hodnota zmamená že je v nádrži menší přírustek než se zaplatilo");


        tankovani.vypisTankovaniSSpz();
        tankovani1.vypisTankovaniSSpz();

    }

}