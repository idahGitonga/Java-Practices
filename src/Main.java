import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

public static void main (String []Args){
    System.out.println("Hello world");

    // get hrs worked

    int hours=0;

    System.out.println("enter the number of hours worked");

    Scanner scanner=new Scanner(System.in);

    hours=scanner.nextInt();

    //get hourly pay rate
    double rate=0;
    System.out.println("enter your hourly pay rate");
    rate=scanner.nextDouble();
//multiply hrs and pay rate

    double hourlyRate= rate*hours;

    //display the result
    System.out.println(hourlyRate);

    //exercise
    //ask a user to input the season of the year
    String season;
    System.out.println("enter the season for the year");

 season=scanner.next();

 //Request for a whole number

    String adjective;

    System.out.println("Enter An Adjective");
    adjective=scanner.next();

    //enter a whole number
    int num;

    System.out.println("Enter a whole number");
    num=scanner.nextInt();
   // Display Result
    System.out.println("on a "+adjective+" "+season+" i drink a minimum of "+num+" cups of coffee ");


}

}