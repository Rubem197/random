package com.company;

import static com.company.Generar.llenar;

public class Main {

    public static void main(String[] args) {
        int[] primero = new int[20];

        llenar(primero);
        for (int j : primero) {
            System.out.println(j);
        }


    }
}
