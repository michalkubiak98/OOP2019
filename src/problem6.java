import java.util.Scanner;

public class problem6 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int number;
        int numberTwo;
        String choice="";





        while (!choice.equals("q")) {


            System.out.println("Enter A for Addition\nEnter S for Subtraction"+
                    "\nEnter M for Multiplication\nEnter D for Division\n:");
            choice = input.nextLine();

            switch (choice) {
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
                    System.out.println("Goodbye");
            }


        }


    }
}