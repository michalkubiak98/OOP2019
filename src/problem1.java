import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("\nEnter your class name: ");
        String className = input.nextLine();

        System.out.print("\nEnter how many snacks you would like: ");
        int snacks = input.nextInt();

        System.out.print("\n\nYour name is " + name + " and you are in the " +
                                className + " class. You want " + snacks +
                                " snacks and it will cost you " + snacks*2 + " euro.");


    }
}
