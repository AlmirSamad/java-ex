package ArrayELista.Exercicios.Pensionato;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Pensionato {
    static void main() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos estudantes vão alaugar? ");
        var n = sc.nextInt();
        sc.nextLine();
        Estudante[] quarto = new Estudante[10];

        for (int i = 0; i < n; i++) {

            System.out.println("Nome: ");
            var nome = sc.nextLine();
            System.out.println("email: ");
            var email = sc.nextLine();

            System.out.println("Qual quarto deseja alugar? ");
            var quartoVago = sc.nextInt();
            sc.nextLine();

            quarto[quartoVago] = new Estudante(nome, email);
        }

        System.out.println("\nQuartos ocupados:");
        for (int i = 0; i < 10; i++) {
            if (quarto[i] != null) {
                System.out.println("RENT#"+i + ": " + quarto[i].getNome() + ", " + quarto[i].getEmail());
            }
        }

    }
}
