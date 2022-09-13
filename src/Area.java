import java.util.Scanner;

public class Area {
    private int length;
    private int width;

    public int returnArea() {
        return(length * width);
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area rectangle = new Area();
        System.out.println("First enter the width of your rectangle, then enter the length:");
        rectangle.setWidth(scanner.nextInt());
        rectangle.setLength(scanner.nextInt());
        System.out.println("The area of your rectangle is: " + rectangle.returnArea());
    }
}
