import java.util.Scanner;

public class EnterANumberUnder500 {
    private static void under500(int numba) throws CustomException{
        if (numba > 500) {
            throw new CustomException("Numbers over 500 stoopid");
        }
    }

    public static void main(String args[]) throws CustomException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number under 500: ");
        int number = scanner.nextInt();
        try {
            under500(number);
        }
        catch(CustomException ex) {
            System.out.println("Numbers over 500 stoopid" + ex);
        }
        finally {
            System.out.println("You entered a number");
        }

    }
}
