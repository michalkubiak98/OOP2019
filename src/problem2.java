

import java.util.Scanner;


public class problem2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean validationMain=false;

        while(!validationMain){

            System.out.println("Cyclist's first name, followed by initial, followed by last name: ");
            String name = input.nextLine();

            if (nameValidation(name)) {
                validationMain=true;
                System.out.println("You succesfully entered the name of the cyclist");

            } else {
                System.out.println("You entered a digit in the name field, try again.");
                validationMain=false;
            }
        }
    }



    public static boolean nameValidation(String name){

        boolean validation = true;
        for(int i = 0; i<=name.length()-1; i++){

                if (Character.isDigit(name.charAt(i))) {
                    validation = false;
                }

            }

        System.out.println("return value" + validation);
        return validation;
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












//ORIGINAL CODE


/*



import java.util.Scanner;


public class problem2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        boolean validationMain=false;


        while(validationMain!=true){

            System.out.println("Cyclist's first name, followed by initial, followed by last name: ");
            String name = input.nextLine();

                if(nameValidation(name)==true){

                    validationMain=true;
                    System.out.println("You succesfully entered the name of the cyclist");

                }
                else {

                    System.out.println("You entered a digit in the name field, try again.");
                    validationMain=false;

                }
        }
    }



    public static boolean nameValidation(String name){

        boolean validation = false;
        while(validation != true){


            for(int i = 0; i<=name.length(); i++){

                if (Character.isDigit(name.charAt(i))) {
                    return false;
                }
                else return true;

            }



        }

        return validation;
    }




}



 */