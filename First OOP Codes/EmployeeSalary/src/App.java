import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        // getting employee's data
        System.out.println("Enter the employee's name:");
        employee.name = sc.nextLine();
        System.out.println("Enter the employee's gross salary:");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Enter the employee's tax:");
        employee.tax = sc.nextDouble();

        // showing employee's data
        System.out.println("Employee: " + employee);

        // increasing salary by a given percentage 
        System.out.printf("Which percentage to increase salary?: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        // showing updated employee's data
        System.out.println("Updated data: " + employee);

        sc.close();
        
    }
}
