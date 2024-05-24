import java.util.Scanner;

public class DoWhile {

    public static void main(String[]Args){
        Scanner scanner =new Scanner(System.in);
        int run=1;
        do {
            System.out.println("Enter a Number");
            int num1;
            num1=scanner.nextInt();
            System.out.println("enter a second number");
            int num2;
            num2=scanner.nextInt();
            int sum=num1+num2;

            System.out.println("the sum is " + sum);

            System.out.println("Would you like to run the calculator again press 1 to continue and 2 to stop");

            run=scanner.nextInt();
        } while (run==1);
    }
}
