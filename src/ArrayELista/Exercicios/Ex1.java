package ArrayELista.Exercicios;

import java.util.Scanner;

public class Ex1 {

//    Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//    e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Números: ");
        n  = sc.nextInt();

        while (n > 10){
            System.out.println("No máximo 10");
            n = sc.nextInt();
        }

        sc.nextLine();
        int[] numerosVetor = new int[n];

        for (int i = 0; i < numerosVetor.length; i++) {
            System.out.println("Digite um número: ");
            numerosVetor[i] = sc.nextInt();
        }

        System.out.println("Números negativos");

        for (int i = 0; i < numerosVetor.length; i++) {
            if (numerosVetor[i] < 0){
                System.out.println(numerosVetor[i]);
            }
        }
        sc.close();
    }
}
