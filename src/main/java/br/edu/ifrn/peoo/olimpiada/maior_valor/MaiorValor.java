package br.edu.ifrn.peoo.olimpiada.maior_valor;

import java.util.Scanner;

/* Faça um programa que leia três valores e apresente o maior
 * dos três valores lidos seguido da mensagem "eh o maior".
 */

public class MaiorValor {

    public static void main(String[] args) {

        Scanner objScanner = new Scanner(System.in);

        int x = objScanner.nextInt();
        int y = objScanner.nextInt();
        int z = objScanner.nextInt();

        int maiorXY = (x + y + Math.abs(x - y)) / 2;

        if (maiorXY > z) {

            System.out.println(maiorXY + " eh o maior");

        } else {

            System.out.println(z + " eh o maior");

        }

    }

}