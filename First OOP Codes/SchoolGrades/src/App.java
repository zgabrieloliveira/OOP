import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student st = new Student();

        System.out.println("Enter the student's name:");
        st.name = sc.nextLine();
        System.out.println("Enter the grade of the first Trimester:");
        st.grade1 = sc.nextDouble();

        while (st.grade1>30) {
            System.out.println("\nThe first Trimester worths only 30 points! Try again...");
            System.out.println("Enter the grade of the first Trimester:");
            st.grade1 = sc.nextDouble();
        }

        System.out.println("Enter the grade of the second Trimester:");
        st.grade2 = sc.nextDouble();

        while (st.grade2>35) {
            System.out.println("\nThe second Trimester worths only 35 points! Try again...");
            System.out.println("Enter the grade of the second Trimester:");
            st.grade2 = sc.nextDouble();
        }

        System.out.println("Enter the grade of the third Trimester:");
        st.grade3 = sc.nextDouble();

        while (st.grade3>35) {
            System.out.println("\nThe third Trimester worths only 35 points! Try again...");
            System.out.println("Enter the grade of the third Trimester:");
            st.grade3 = sc.nextDouble();
        }

        sc.close();

        if (st.finalGrade() >= 60)
            System.out.println(st + "\nPASS");
        else 
            System.out.println(st + " \nFAILED\n" + String.format("%.2f", st.missingPoints()));
    }
}
