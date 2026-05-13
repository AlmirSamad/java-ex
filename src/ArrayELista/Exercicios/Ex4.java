package ArrayELista.Exercicios;

import java.util.Scanner;

public class Ex4 {
//    Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//    tela todos os números pares, e também a quantidade de números pares.
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar? ");
        var n = sc.nextInt();
        sc.nextLine();
        int[] numeros = new int[n];

        var nPares = 0;

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0 ){
                nPares++;
            }
        }

        int[] numerospares =  new int[nPares];
        int indexPar = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0 ){
                numerospares[indexPar] = numeros[i];
                indexPar++;
            }
        }

        System.out.println("Numeros pares: ");
        for (int i = 0; i < numerospares.length; i++) {
            System.out.print(numerospares[i] + "  ");
        }
        System.out.println();
        System.out.println("Quantidade de numeros pares: "+ numerospares.length);
    }
}
