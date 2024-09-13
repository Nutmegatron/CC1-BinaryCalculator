import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        {

            //created integer variables for the remainders and an array for binary numbers
            int remainder, i = 1, j;
            int[] binaryNumber = new int[100];

            //scanner to take user input
            Scanner myCalc = new Scanner(System.in);
            System.out.println("Enter a decimal number: ");
            String decimalNumber = myCalc.nextLine();


            int decNumber = 0;
            if (decimalNumber.equals("STOP")) {
                System.exit(0);
            } else {
                decNumber = Integer.parseInt(decimalNumber);
            }

            remainder = decNumber;

            //While loop converts the decimal to binary
            while (remainder != 0) {
                binaryNumber[i++] = remainder % 2;
                remainder = remainder / 2;
            }

            //Output is shown using the print method
            System.out.println("This Binary number is ");
            for (j = i - 1; j > 0; j--) {
                System.out.print(binaryNumber[j]);
            }


        }
    }

}


