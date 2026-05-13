package ArrayELista.Exercicios.CadastroDeFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static void main() {
        List<Funcionario> funcionarios = new ArrayList<>();
        Scanner sc =  new Scanner(System.in);

        System.out.println("How many employees will be registered? ");
        var n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i +1));
            System.out.println("ID: ");
            var id = sc.nextLong();
            sc.nextLine();
            System.out.println("Name: ");
            var name = sc.nextLine();
            System.out.println("Salary: ");
            var salary = sc.nextDouble();

            Funcionario x =  new Funcionario(id, name, salary);
            funcionarios.add(x);
        }

        for(Funcionario x : funcionarios){
            System.out.println(x);
        }

        System.out.println("-------");
        System.out.println("Qual funcionario vai receber aumento? ");
        var func = sc.nextLong();

        Funcionario result = funcionarios.stream()
                .filter(x -> x.getId() == func)
                .findFirst()
                .orElse(null);

        if (result !=null){
            System.out.println("Quanto de aumento? ");
            var aumento = sc.nextDouble();
            result.increase(aumento);
        }else {
            System.out.println("Não encontrado");
        }

        System.out.println("-------------");
        System.out.println("Lista de funcionários: ");
        for(Funcionario x : funcionarios){
            System.out.println(x);
        }
    }




}
