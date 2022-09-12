import java.util.*;
public class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        int int1, int2;
        System.out.println("Enter 2 separate numbers:");
        int1 = scanner.nextInt();
        int2 = scanner.nextInt();

        if (int1 > int2) System.out.println(int1);
        else if (int2 > int1) System.out.println(int2);

        System.out.println("Enter another number:");
        int int3 = scanner.nextInt();
        if (int3%2 == 0) {
            System.out.println("Your number is even!");
        }
        else System.out.println("Your number is odd!");

        System.out.println("Enter a traffic light colour (green, red or yellow)");
        String traffic = scanner.nextLine();
        if (traffic == "green") {
            System.out.println("Go!");
        }
        else if (traffic == "yellow") {
            System.out.println("Wait!");
        }
        else if (traffic == "red") {
            System.out.println("STOP!");
        }
        else {
            System.out.println("You entered an incorrect input!");
        }
        */

        int month = 0;
        System.out.println("Enter the number of a month between 1 and 12:");
        while(month < 1 || month > 12) {
            month = scanner.nextInt();
            if (month < 0 || month > 12) System.out.println("You entered an invalid input! Try again:");
        }
        switch(month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
        }


    }
}
