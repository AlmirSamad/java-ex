package ArrayELista.Exercicios.Ex3;
import java.util.Scanner;

public class Ex3 {
//    Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//    tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//    bem como os nomes dessas pessoas caso houver.
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?" );
        int n = sc.nextInt();
        sc.nextLine();
        Pessoa[] pessoasVetor =  new Pessoa[n];
        double somaidade = 0;
        double soma = 0;
        double med = 0;

        for (int i = 0; i < pessoasVetor.length; i++) {
            System.out.println("Dados da pessoa " + (i + 1) +" pessoa: ");
            System.out.println("Nome: ");
            var nome = sc.nextLine();
            System.out.println("Idade: ");
            var idade =  sc.nextInt();
            System.out.println("Altura: ");
            var altura =  sc.nextDouble();
            sc.nextLine();

            pessoasVetor[i] = new Pessoa(nome, idade, altura);

            soma = pessoasVetor[i].getAltura() + soma;

            if (pessoasVetor[i].getIdade() < 16){
                somaidade++;
            }

        }

        med = soma / pessoasVetor.length;
        System.out.println("Altura média: " + med);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", (somaidade / pessoasVetor.length) * 100);
        for (int i = 0; i < pessoasVetor.length; i++) {
            if (pessoasVetor[i].getIdade() < 16){
                System.out.println(pessoasVetor[i].getNome());
            }
        }

        sc.close();
    }

}
