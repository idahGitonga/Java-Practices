import java.util.Scanner;

public class Rectangle {
    static double length;
    static double width;
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[]Args){
       int calculation;

      System.out.println("What would you like to calculate the area or the perimeter ---reply with 1 for 'perimeter' or 2 for 'area' for what you chose to calculate");
       calculation=scanner.nextInt();

        if (calculation==1) {

            calculatePerimeter();
        }
        else if(calculation==2){
            calculateArea();
        }else {
            System.out.println("you provided the wrong response please check how you typed the options given");
        }

    }

    public static void calculatePerimeter(){
        System.out.println("enter the Width of the triangle");
        width=scanner.nextDouble();

        System.out.println("enter the Length of the triangle");
        length= scanner.nextDouble();
        double perimeter=(width+length)*2;
        System.out.println("The perimeter of the rectangle is "+ perimeter);

    }

    public static void calculateArea(){
        System.out.println("enter the Width of the rectangle");
        width=scanner.nextDouble();

        System.out.println("enter the Length of the rectangle");
        length= scanner.nextDouble();
        double area=width*length;
        System.out.println("The Area of the rectangle is "+ area);

    }


}
