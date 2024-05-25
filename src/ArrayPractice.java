import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[]Args){

        int[] input =new int[4];

            input[0] = 2;
            input[1] = 3;
            input[2] = 4;
            input[3] = 5;
            for (int i = 0; i < input.length; i++) {
                input[i] = input[i]+3;
            }
            System.out.println(Arrays.toString(input));
        }
    }


