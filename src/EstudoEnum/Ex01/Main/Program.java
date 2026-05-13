package EstudoEnum.Ex01.Main;

import EstudoEnum.Ex01.Entities.Department;
import EstudoEnum.Ex01.Entities.Enum.WorkerLevel;
import EstudoEnum.Ex01.Entities.HourContract;
import EstudoEnum.Ex01.Entities.Worker;

import javax.xml.transform.Source;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

        System.out.println("Enter department's name:");
        var department = sc.nextLine();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        var name = sc.nextLine();
        System.out.print("Level: ");
        var level = sc.nextLine();
        System.out.print("Base salary: ");
        var baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));

        System.out.println(worker);

        System.out.println("How many contracts to this worker?: ");
        var n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //Criação de um contrato
            System.out.println("Enter contract #"+i+" data:");
            System.out.println("Date (DD/MM/YYYY): ");
            Date contracDate = sdf.parse(sc.next());

            System.out.println("Valueper hour: ");
            var valueHour = sc.nextDouble();
            System.out.println("Duration (hours): ");
            var durationHour= sc.nextInt();

            HourContract contract =  new HourContract(contracDate, valueHour, durationHour);

            //Faz esse contrato ser associado ao trabalhador
            worker.addContract(contract);

        }

        System.out.println("Enter month and year to calculate income(MM/YYYY):");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: "+ worker.getDepartment().getName());

        System.out.println("Income for "+ monthAndYear +": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
