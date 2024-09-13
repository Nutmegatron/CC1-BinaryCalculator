import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        {
//            while loop to keep program running until the user inputs "STOP"
            while (true)
            {
                //created integer variables for the remainders and an array for binary numbers
                int remainder, i = 1, j;
                int[] binaryNumber = new int[100];

                //scanner to take user input
                Scanner myCalc = new Scanner(System.in);
                System.out.print("\nEnter a decimal number: ");
                String decimalNumber = myCalc.nextLine();

//                initialize decNumber variable
                int decNumber = 0;
//                terminates the program if user inputs specific string
                if (decimalNumber.equals("STOP"))
                {
                    System.out.print("Program has been terminated");
                    System.exit(0);
                } else
//                converts string to integer if user inputs decimal
                {
                    decNumber = Integer.parseInt(decimalNumber);
                }

//                set remainder equal to decNumber
                remainder = decNumber;

                //While loop converts the decimal to binary and takes the remainder of the user input to get binary digits
                while (remainder != 0) {
                    binaryNumber[i++] = remainder % 2;
                    remainder = remainder / 2;
                }

                //Output is shown using the print method
                System.out.print("This Binary number is ");
                for (j = i - 1; j > 0; j--) {
                    System.out.print(binaryNumber[j]);
                }
            }
        }
    }
}

