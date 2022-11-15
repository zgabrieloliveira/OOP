/*  First OOP code made using classes and methods, this program allows the user to:
    enter with the product data, remove or add items on the stock and consult the product data */

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        // entering a product
        System.out.println("Enter product data:");
        System.out.println("Name:");
        product.name = sc.nextLine();
        System.out.println("Price:");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock:");
        product.quantity = sc.nextInt();
        System.out.println(product);

        // adding units of the product
        System.out.println("\nEnter the number of products to be added in the stock:");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product);

        // removing units of the product
        System.out.println("\nEnter the number of products to be removed from the stock:");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);

        sc.close();

    }
}
