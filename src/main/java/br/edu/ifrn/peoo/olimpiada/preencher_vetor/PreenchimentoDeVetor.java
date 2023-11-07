package br.edu.ifrn.peoo.olimpiada.preencher_vetor;

import java.util.*;

/* Faça um programa que leia um valor T e preencha um vetor N[1000]
 * com a sequência de valores de 0 até T-1 repetidas vezes, conforme
 * exemplo abaixo. Imprima o vetor N.
 */

public class PreenchimentoDeVetor {

    public static void main(String[] args) {

        Scanner objScanner = new Scanner(System.in);
        Random objRandom = new Random();

        int t = objScanner.nextInt();
        int[] v = new int[1000];

        for (int i = 0; i < v.length; i++) {

            v[i] = objRandom.nextInt(t);

        }

        for (int i = 0; i < v.length; i++) {

            System.out.printf("N[%d] = %d\n", i, v[i]);

        }

    }

}
