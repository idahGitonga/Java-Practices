import java.util.Scanner;

public class Grades {

    public static void main(String[]Args){
        int marks;
        char grade;
        System.out.println("Please Enter marks scored");
        Scanner scanner=new Scanner(System.in);

        marks=scanner.nextInt();

        if(marks==0){
            grade='F';
            System.out.println("Your grade is " + grade) ;
        }else if (marks<25){
            grade='D';
            System.out.println("Your grade is " + grade) ;
        } else if (marks<50) {
            grade='C';
            System.out.println("Your grade is " + grade) ;

        } else if (marks<75) {
            grade='B';
            System.out.println("Your grade is " + grade) ;

        }else {
            grade='A';
            System.out.println("Your grade is" + grade);
        }

        String message;
        switch (grade){
            case 'A' :
                message="excellent";
                break;
            case'B':
                message="Above Average";
                break;
            case'C':
                message="Average";
                break;
            case'D':
                message="Need for improvement";
                break;
            case'F':
                message="Fail";
                break;
            default:
                message="Error, invalid input";
                break;
        }
    }
}
