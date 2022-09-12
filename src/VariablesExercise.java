import java.util.Scanner;

public class VariablesExercise {
    public static void main(String[] args) {
        /*
        String firstName = "Benji";
        String lastName = "Milan";
        String name = firstName + lastName;
        System.out.println(name);


        int num1 = 10, num2 = 40;
        System.out.println(num1+num2);
        float result = num1/num2;
        int num3= 8;
        System.out.println(++num3);
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();
        System.out.println("Hello " + firstName + " " + lastName + "!\n\n");

        System.out.println("Enter two numbers on separate lines:");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int sum = int1+int2;
        System.out.println("The sum of your numbers is " + sum);
    }
}
