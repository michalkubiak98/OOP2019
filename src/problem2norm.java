
import java.util.Scanner;

public class problem2norm {

    public static void main(String[] args) {

        System.out.println("Enter name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Enter distance: ");
        int distance = input.nextInt();

        int rate=0;
        if(distance<=10)
            rate = distance*7;
        else {
            rate = 70+((distance-10)*10);
        }

        System.out.println("name: "+ name + "\nDistance: "+
                            "\nRate: "+ rate + "c");
        


    }
}






/*
 Calculations and if – else (the sponsored cyclist). A cyclist is sponsored at the rate of 7c for each km up to 10 km,
  and 10c for each km in excess of 10km.

  Write a program which will ask for the cyclist’s first name, initial and last name
   and the distance cycled.

    Your program should calculate the money due, then display a dialog containing the cylist’s full name
    (first name + initial + last name), the distance cycled, and the money due.

     Note here that the problem involves 2 different rates

     if the number of km exceeds 10 so, for example, if the cyclist is sponsored for 15km then the first 10km are sponsored at 7c
      and the remaining 5 km are sponsored at 10c giving


 */
