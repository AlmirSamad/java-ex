package ArrayELista.Exercicios.Ex8;

import ArrayELista.Exercicios.Ex3.Pessoa;

import java.util.Scanner;

public class Ex8 {
//    Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//    devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//    da pessoa mais velha.

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas vc vai digitar? ");
        var n =  sc.nextInt();
        sc.nextLine();
        int idadeVelha = 0;
        String nomeVelho ="";

        PessoaEx8[] pessoas = new PessoaEx8[n];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados da pessoa " + (i + 1) +" pessoa: ");
            System.out.println("Nome: ");
            var nome = sc.nextLine();
            System.out.println("Idade: ");
            var idade =  sc.nextInt();
            sc.nextLine();
            pessoas[i] = new PessoaEx8(nome, idade);

            if (pessoas[i].getIdade() > idadeVelha ){
                idadeVelha = pessoas[i].getIdade();
                nomeVelho =  pessoas[i].getNome();

            }
        }

        System.out.println("Pessoa mais velha: " + nomeVelho);


    }
}
