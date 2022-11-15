import java.util.Locale;
import java.util.Scanner;

/*  This program converts some given value in real to dollar and add IOF to the conversion.
    Independs on objects and uses only static calculation and static members. */

public class App {

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // input
        System.out.println("What is the dollar price?");
        double dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double amount = sc.nextDouble();
        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
        sc.close();

        // output 
        System.out.printf("Amount to be paid in reais = %.2f\n", result);

    }
}
