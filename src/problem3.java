import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {

        System.out.println("Enter name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Enter taxable income: ");
        int income = input.nextInt();


        double rate=0;

        if(income>=0 && income <=20000){
            rate = 0;
        }
        else if(income>20000 && income <=36000){
            rate = 0.20;
        }
        if(income>36000){
            rate = 0.41;
        }

        double taxDue = income - (income*rate);

        System.out.println("Your name is: " + name +
                "\nYour income is: " + income +
                "\nYour tax rate is: " + rate +
                "\nYour tax due is: " + taxDue +
                "\nYour income after tax is: " + (taxDue));

    }
}
