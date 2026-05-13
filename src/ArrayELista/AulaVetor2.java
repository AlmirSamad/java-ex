package ArrayELista;

import java.util.Scanner;

public class AulaVetor2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("N = ");
        int n = sc.nextInt();
        ProdutoTeste[] prodVect = new ProdutoTeste[n];
        double med = 0;

        for (int i = 0; i < prodVect.length; i++) {
            sc.nextLine();
            var nome = sc.nextLine();
            var price = sc.nextDouble();
            prodVect[i] = new ProdutoTeste(nome, price);
            med = prodVect[i].getPrice() + med;
        }
        System.out.printf("Preço média é: %.2f%n" , (med/ prodVect.length));
    }
}
