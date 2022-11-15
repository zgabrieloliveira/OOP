import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Rectangle r = new Rectangle();
        Scanner sc = new Scanner(System.in);

        // input (getting width and height)
        System.out.println("Enter the width and height:");
        r.width = sc.nextDouble();
        r.height = sc.nextDouble();

        // output (returning area, perimeter and diagonal)
        System.out.println(r);

        sc.close();
    }
}
