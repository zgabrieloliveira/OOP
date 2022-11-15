import java.util.Locale;
import java.util.Scanner;

/* This project simulates a bank system and allows the user to:
 * sign-up new accounts (with number, holder and optional initial deposit)
 * deposit on the account
 * withdraw from the account
 *
 * PS: the account number will never change after the sign-up and 
 * the balance only changes through deposits and withdraws.
 */

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account acc;
        double value;

        System.out.println("Enter account number:");
        int number = sc.nextInt();

        System.out.println("Enter the account holder:");
        sc.nextLine(); // getting the \n left by the previous scan
        String holder = sc.nextLine();

        System.out.println("Is there a initial deposit? (y/n)");
        char confirmation = sc.next().charAt(0);

        if (confirmation == 'y') {
            System.out.println("Enter inicial deposit value:");
            value = sc.nextDouble();
            acc = new Account(number, holder, value); // in case of inicial deposit
        }
        else
            acc = new Account(number, holder); // in case of no inicial deposit   

        System.out.println("\nAccount data:" + acc); // output after sign-up

        System.out.println("Enter a deposit value:");
        value = sc.nextDouble();
        acc.deposit(value);
        System.out.println("Updated Account data:\n" + acc); // output after deposit operation

        System.out.println("Enter a withdraw value:");
        value = sc.nextDouble();
        acc.withdraw(value);
        System.out.println("Updated Account data:\n" + acc); // output after withdraw operation

        sc.close();

    }
}
