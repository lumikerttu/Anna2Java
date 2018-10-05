package com.kerttu;

public class Ring {
    double raadius;
    String varv;

    public Ring() {
        this.raadius = 0.0;
        this.varv = "värvitu";
    }

    public Ring(double raadius, String varv) {
        this.raadius = raadius;
        this.varv = varv;
    }

    public double ringjoonePikkus() {
        return 2 * Math.PI * this.raadius;

    }

    @Override
    public String toString() {
        return "Ring{" +
                "raasdius=" + raadius +
                ", varv='" + varv + '\'' +
                '}';
    }
}