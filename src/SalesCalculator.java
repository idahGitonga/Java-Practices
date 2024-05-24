import java.util.Scanner;

public class SalesCalculator {

    public static void main (String[]Args) {
        int payment = 1000;
        int sales;
        int bonus;
        int totalSales;
//input for sales
        System.out.println("enter sales made");
        Scanner scanner=new Scanner(System.in);
        sales=scanner.nextInt();
        //condition for sales that get a bonus
        if(sales>10){
            bonus=250;
        }else{bonus=0;}
        totalSales=bonus+payment;

        System.out.println("the total payment for sales is " + totalSales);
       int difference=10-sales;

        if(sales>=10){
            System.out.println("congratulations for the good sales");
        }
        else{
            System.out.println("You are short " + difference+ " sales");
        }


    }
}
