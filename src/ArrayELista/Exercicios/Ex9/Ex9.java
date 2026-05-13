package ArrayELista.Exercicios.Ex9;

import java.util.Scanner;

public class Ex9 {

//    Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//    no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//    os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//    igual a 6.0 (seis).

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos serao digitados? ");
        var n = sc.nextInt();
        sc.nextLine();
        Alunos[] alunos = new Alunos[n];

        // calcular a média das notas dos alunos
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do" + (i +1) + "o aluno:");
            var nome = sc.nextLine();
            var n1 = sc.nextDouble();
            var n2 = sc.nextDouble();
            sc.nextLine();
            alunos[i] = new Alunos(nome, n1, n2);
        }



        System.out.println("Alunos aprovados:");
        for (int i = 0; i < alunos.length; i++) {
            var med = (alunos[i].getN1() + alunos[i].getN2()) /2;
            if (med >= 6){
                System.out.println(alunos[i].getNome());
            }

        }
    }
}
