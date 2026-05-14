package EstudoEnum.Ex03.Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static void main() throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

        System.out.println("Enter cliente data: ");

        System.out.println("Name: ");
        var name = sc.nextLine();
        System.out.println("Email: ");
        var email =  sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        System.out.println("Enter order data: ");

    }
}
