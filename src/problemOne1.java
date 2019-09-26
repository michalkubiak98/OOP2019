
import java.util.Scanner;

public class problemOne1 {
    public static void main(String[] args) {


        double exchange;


        System.out.println("Please enter the exchange rate for GB:");

        Scanner input = new Scanner(System.in);
        exchange = input.nextDouble();
        float sum=1;



        while (!(sum ==0)) {

            System.out.println("Enter your sum: ");
            sum = input.nextFloat();

            if(!(sum ==0)){
                System.out.println(sum + " Euro is equal to " + String.format("%,.2f",(sum  * exchange)) + " GB");

            }
            else System.out.println("Goodbye");


        }

    }
}