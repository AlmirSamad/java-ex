package ArrayELista.Exercicios;

import java.util.Scanner;
import java.util.SortedMap;

public class Ex6 {
    static void main() {
//        Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//        mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//        os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.


        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos elementos vai ter o vetor? ");
        var n = sc.nextInt();

        double soma = 0;
        double med = 0;

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            soma = vetor[i] + soma;
        }

        med = soma/ vetor.length;

        System.out.printf("Média: %.2f%n", med);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < med){
                System.out.println(vetor[i]);
            }
        }

    }
}
