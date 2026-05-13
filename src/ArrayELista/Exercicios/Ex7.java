package ArrayELista.Exercicios;

import java.util.Scanner;

public class Ex7 {

//    Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
//    aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
//    digitado, mostrar a mensagem "NENHUM NUMERO PAR"
static void main() {
    Scanner sc = new Scanner(System.in);
    int pares = 0;
    System.out.println("Quantos elementos vai ter o vetor? ");
    var n = sc.nextInt();
    int[] vetor = new int[n];
    var soma = 0;

    for (int i = 0; i < vetor.length; i++) {
        System.out.println("Digite um numero: ");
        vetor[i] = sc.nextInt();

        if (vetor[i] % 2 == 0){
            pares++;
            soma = vetor[i] + soma;
        }
    }
    if (soma!=0){
        System.out.println("Média dos pares: "+(soma/pares));
    }else {
        System.out.println("NENHUM NUMERO PAR");
    }


//    int[] vetorPares = new int[pares];
//    int indexPar = 0;
//
//    for (int i = 0; i < vetor.length; i++) {
//        if (vetor[i] % 2 == 0){
//            vetorPares[indexPar] = vetor[i];
//            indexPar++;
//
//        }
//    }

}
}
