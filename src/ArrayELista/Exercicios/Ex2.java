package ArrayELista.Exercicios;

import java.util.Scanner;

public class Ex2 {
    static void main() {
//        Faça um programa que leia N números reais e armazene-os em um vetor.
//        Em seguida:
//        - Imprimir todos os elementos do vetor
//        - Mostrar na tela a soma e a média dos elementos do v

        Scanner sc = new Scanner(System.in);
        int n = 0;
        int soma = 0;
        double med = 0;

        System.out.println("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        sc.nextLine();

        int[] numeroVetor = new int[n];

        for (int i = 0; i < numeroVetor.length; i++) {
            System.out.println("Digite um numero: ");
            numeroVetor[i] = sc.nextInt();
            soma = soma +numeroVetor[i];
        }

        med = (double) soma /numeroVetor.length;

        System.out.println("Valores: " + numeroVetor);
        System.out.println("Soma: " + soma);
        System.out.printf("Média: " + med);




    }
}
