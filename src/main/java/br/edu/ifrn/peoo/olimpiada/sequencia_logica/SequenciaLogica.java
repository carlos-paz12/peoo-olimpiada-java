package br.edu.ifrn.peoo.olimpiada.sequencia_logica;

import java.util.Scanner;

/* Escreva um programa que leia um valor inteiro N. N * 2 linhas
 * de saída serão apresentadas na execução do programa, seguindo
 * a lógica do exemplo abaixo. Para valores com mais de 6 dígitos,
 * todos os dígitos devem ser apresentados.
 */

public class SequenciaLogica {

    public static void main(String[] args){

        Scanner objScanner = new Scanner(System.in);

        int n = objScanner.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.printf("%d %d %d\n", i, (int) Math.pow(i, 2), (int) (i * Math.pow(i, 2)));
            System.out.printf("%d %d %d\n", i, (int) Math.pow(i, 2) + 1, (int) (i * Math.pow(i, 2)) + 1);

        }

    }

}