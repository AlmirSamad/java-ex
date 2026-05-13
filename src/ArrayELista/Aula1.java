package ArrayELista;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Aula1 {
    static void main() {
        Scanner sc = new Scanner(System.in);


        System.out.println("N = ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        double med = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Altura: ");
            vetor[i] = sc.nextDouble();
            med = vetor[i] + med;
        }
        System.out.printf("Altura média é: %.2f%n" , (med/n));

//        var arrayList = new int[]{10, 5, 25};
//
//        for (int i = 0; i < arrayList.length; i++) {
//            double med =0;
//            med = arrayList[i] + med;
//            System.out.println(med/i);
//        }


        sc.close();
    }

    private static void metodo01() {
        int x = 10;
        if (x > 0){
            int y = 10;
        }
        System.out.println(x);
    }

    private static void metodo02(){
        ProdutoTeste produtoTeste2 = metodo03();
        System.out.println(produtoTeste2.getNome());

    }

    private static ProdutoTeste metodo03() {
        ProdutoTeste produtoTeste03 = new ProdutoTeste("Tv", 9000);
        return produtoTeste03;
    }
}
