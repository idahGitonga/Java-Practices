import java.util.Scanner;

public class Greetings {

    public static void main(String[]Args){
        greetings();
    }
    public static void greetings(){
        Scanner scanner=new Scanner(System.in);
        String firstName;
        String lastName;
        System.out.println("Enter Your First Name");

        firstName=scanner.nextLine();

        System.out.println("Enter Your Last Name");

        lastName=scanner.nextLine();

        System.out.println("Greetings "+firstName+" " +lastName);

    }
}
