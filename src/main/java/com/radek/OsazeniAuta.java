package com.radek;

public class OsazeniAuta {
    private Auto auto;
    private String jmeno;

    public OsazeniAuta(Auto auto, String jmeno) {
        this.auto = auto;
        this.jmeno = jmeno;
    }

    @Override
    public String toString() {
        return "OsazeniAuta{" +
                "auto=" + auto +
                ", jmeno='" + jmeno + '\'' +
                '}';
    }
}
