
import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {


        String value;
        int number;
        int numberTwo;

        System.out.println("Enter A for Addition\nEnter S for Subtraction"+
                            "\nEnter M for Multiplication\nEnter D for Division\n:");

        Scanner input = new Scanner(System.in);
        value = input.nextLine();

        switch (value) {
            case "A":
                System.out.println("Enter a number");
                number = input.nextInt();
                System.out.println("Enter another number");
                numberTwo = input.nextInt();
                System.out.println(number + " and " + numberTwo + " added together give you " + (number + numberTwo));
                break;
            case "S":
                System.out.println("Enter a number");
                number = input.nextInt();
                System.out.println("Enter another number");
                numberTwo = input.nextInt();
                System.out.println(number + " and " + numberTwo + " subtracted from one another give you " + (number - numberTwo));
                break;
            case "M":
                System.out.println("Enter a number");
                number = input.nextInt();
                System.out.println("Enter another number");
                numberTwo = input.nextInt();
                System.out.println(number + " and " + numberTwo + " multiplied together give you " + (number * numberTwo));
                break;
            case "D":
                System.out.println("Enter a number");
                number = input.nextInt();
                System.out.println("Enter another number");
                numberTwo = input.nextInt();
                System.out.println(number + " and " + numberTwo + " divided by one another give you " + (number / numberTwo));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + value);
        }
    }
}
