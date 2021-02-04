package com.eduardofelizardo.testetecnnicoum;
/**
 * Δ < 0, então a equação não possui resultados reais;
 *
 * Δ = 0, então a equação possui apenas um resultado real ou
 * possui dois resultados iguais (essas duas afirmações são equivalentes);
 *
 * Δ > 0, então a equação possui dois resultados distintos reais.
 */

import java.util.Scanner;

public class TesteTecnico1 {

    public static void main(String[] args) {
        /* Declara a entrada via teclado de valores */
        Scanner baskara = new Scanner(System.in);

        /* declararar varáveis */
        double a, b, c, delta, x1, x2;

        /* obtendo valores */
        System.out.print("Digite o numero relacionado a letra a: ");
        a = baskara.nextDouble();
        System.out.print("Digite o numero relacionado a letra b: ");
        b = baskara.nextDouble();
        System.out.print("Digite o numero relacionado a letra c: ");
        c = baskara.nextDouble();

        /* Obtendo o delta */
        delta = (Math.pow(b, 2)) - (4 * a * c);

        /* Calculo das raizes */
        if (delta == 0) {
            /* Uma raiz */
            double x = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.printf("x = %.5f\n", x);
        } else if (delta > 0 & (2 * a) != 0) {
            /* Duas raizes */
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("x1 = %.5f\n", x1);
            System.out.printf("x1 = %.5f\n", x2);
        } else {
            /* raiz negativa */
            System.out.println("Impossível calcular.");
        }
         baskara.close();
    }
}
