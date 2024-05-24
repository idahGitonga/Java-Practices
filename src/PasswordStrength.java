import java.util.Scanner;

public class PasswordStrength {

    //write a program to test the strength of a proposed password.
    //current username is johndoe
    //current password ABC_1234
    //TASK
    //prompt user to enter a new password, make sure the password is complex in that
    //at least 8 characters long
    //contains an uppercase
    //contains a special character
    //not similar to the old password

    //solution

    //declare variables for the username and password

    private static String currentUserName="johndoe";
    private static String currentPassword="ABC_1234";


    public static void main(String[]Args){
        printPasswordRules();
        Scanner scanner=new Scanner(System.in);
        boolean valid;


        do {
            System.out.println("Enter your new password");
            var proposedPassword =scanner.nextLine();
            valid=changePassword(proposedPassword);

        }while(!valid);
        System.out.println("The proposed password is valid");

    }
    public static void printPasswordRules(){
        System.out.println("Your password must be at least 8 characters long");
        System.out.println("Your password must contain an Uppercase letter");
        System.out.println("Your password must contain a special character");
        System.out.println("Your password must be different from the previous password");
        System.out.println("Your password must not contain the username");


    }
    public static boolean changePassword (String newPassword){
        boolean valid=true;
        String errorMessage="";
        if (newPassword.length()<8){
            valid=false;
            errorMessage="Your password is not 8 characters long";
        }

        if(newPassword.toUpperCase().contains(currentUserName.toUpperCase())){
            valid=false;
            errorMessage="Your password should not contain the username";

        }
       if(newPassword.equals(newPassword.toLowerCase())){
      valid=false;
           errorMessage="Your password should have an uppercase letter";

       }
      if(newPassword.matches("[A-zA-z0-9]*")){
          valid=false;
          errorMessage="Your password should have a special character";


      }
        return valid;
    }

}
