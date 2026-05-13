package ArrayELista.Exercicios;

import java.util.Scanner;

public class Ex10 {
//    Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//        que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//        de homens.

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        var n = sc.nextInt();
        sc.nextLine();
        double[] altura = new double[n];
        String[] genero = new String[n];

        var menorAltura = 0.0;
        var maiorAltura = 0.0;
        var mediaMulheres = 0.0;
        var somaMulheres = 0;
        var numeroHomens = 0;

        for (int i = 0; i < altura.length; i++) {
            System.out.println("Altura da "+ (i +1)+ " a pessoa: ");
            altura[i] = sc.nextDouble();
            sc.nextLine();
            System.out.println("Genero da "+ (i +1)+" a pessoa: ");
            genero[i] = sc.nextLine();

            if (menorAltura == 0){
                menorAltura = altura[i];
            }

            if (genero[i].equals("M")){
                numeroHomens++;
            }

            if (altura[i] < menorAltura){
                menorAltura = altura[i];
            }

            if (altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
            if(genero[i].equals("F")){
                mediaMulheres = altura[i] + mediaMulheres;
                somaMulheres++;
            }

        }

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura =" + maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", (mediaMulheres/somaMulheres));
        System.out.println("Numeor de homens = "+ numeroHomens);

    }
}
