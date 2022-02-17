package com.company;

public class Generar {

    public static void llenar(int[] A) {
        int random = (int) Math.round(Math.random() * 300 + 100);
        for (int i = 0; i < A.length; i++) {
            if (generar(random, A) == true) {
                A[i]=random;
            } else {
                random = (int) Math.round(Math.random() * 300 + 100);
                i--;
            }
            random = (int) Math.round(Math.random() * 300 + 100);
        }
    }

    public static boolean generar(int random, int []A) {
        int contador = 0;
        for (int i = 0; i < A.length; i++) {
            if (random == A[i]) {
                contador++;
            }
        }
        if (contador == 0) {
            return true;
        } else {
            return false;
        }
    }
}
