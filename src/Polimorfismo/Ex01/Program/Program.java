package Polimorfismo.Ex01.Program;

import Polimorfismo.Ex01.Entity.Employee;
import Polimorfismo.Ex01.Entity.OutsourcedEmployee;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        var n = sc.nextInt();
        sc.nextLine();

        List<Employee> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #"+ i +" data:");
            System.out.println("Outsourced (y/n)?");
            var outOrNot = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            var name = sc.nextLine();
            System.out.print("Hour: ");
            var hour = sc.nextInt();
            System.out.print("Valueper hour: ");
            var valuePerHour =  sc.nextDouble();

            if (outOrNot == 'y') {

                System.out.print("Additional charge: ");
                var addCharger =  sc.nextDouble();
                sc.nextLine();
                list.add(new OutsourcedEmployee(name,hour, valuePerHour, addCharger));
            }else {
                list.add(new Employee(name, hour, valuePerHour));
            }


        }

        System.out.println("Payment: ");
        for (Employee e : list){
            System.out.println(e.getName() + " - $" + e.payment() );
        }
    }
}
