import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input ="";
        String whole = "";

        while(!input.equals("q")) {

            System.out.println("Enter number: ");
            input =  sc.nextLine();
            whole += input + "\n";






        }




        System.out.println("Your numbers are:\n" + whole);

    }
}
