package br.edu.ifrn.peoo.olimpiada.soma_impares;

import java.util.Scanner;

/* Leia 2 valores inteiros X e Y. A seguir, calcule
 * e mostre a soma dos números impares entre eles.
 */

public class SomaDeImpares {

    public static void main(String[] args) {

        Scanner objScanner = new Scanner(System.in);

        int x = objScanner.nextInt();
        int y = objScanner.nextInt();
        int soma = 0;

        if (x < y) {

            for (int i = x + 1; i <= y - 1; i++) {

                if (i % 2 == 1) {

                    soma += i;

                }

            }

        } else {

            for (int i = y + 1; i <= x - 1; i++) {

                if (i % 2 != 0) {

                    soma += i;

                }

            }

        }

        System.out.println(soma);

    }

}
