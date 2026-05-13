package ArrayELista.Exercicios;

import java.util.Scanner;

public class Ex5 {
//    Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//    o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//    considerando a primeira posição como 0 (zero).

    static void main() {
        Scanner sc = new Scanner(System.in);

        double maiorvalor = 0;
        int posicao = 0;

        System.out.println("Quantos numeros voce vai digitar? ");
        var n = sc.nextInt();

        double[] numeroVetor = new double[n];

        for (int i = 0; i < numeroVetor.length; i++) {
            System.out.println("Digite um numero: ");
            numeroVetor[i] = sc.nextInt();

            if (numeroVetor[i] > maiorvalor){
                maiorvalor = numeroVetor[i];
                posicao = i;
            }

        }

        System.out.println("Maior valor: " + maiorvalor);
        System.out.println("posição: " + posicao);
    }
}
