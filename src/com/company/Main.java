package com.company;

public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AnadirPuerta();
        System.out.println(miCoche.puertas);
    }
}

class Coche {
    public int puertas = 5;

    public void AnadirPuerta() {
        this.puertas++;
    }
}