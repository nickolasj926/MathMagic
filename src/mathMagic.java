import java.util.Scanner;
public class mathMagic {
    public static void main(String[] args) {
            Scanner mathMagic = new Scanner(System.in);
            System.out.println("Enter any whole number: ");
            int yourNumber = mathMagic.nextInt();
            int firstStep = yourNumber * yourNumber;
            //The excessive use of System.out.println is for a more user-friendly display when run.
            System.out.println("Your number multiplied by itself:");
            System.out.println(firstStep);
            int secondStep = firstStep + yourNumber;
            System.out.println("The sum of your number and " + firstStep + ":");
            System.out.println(secondStep);
            int thirdStep = secondStep / yourNumber;
            System.out.println("Your number divided into " + secondStep + ":");
            System.out.println(thirdStep);
            int fourthStep = thirdStep + 17;
            System.out.println("The sum of 17 and " + thirdStep + ":");
            System.out.println(fourthStep);
            int fifthStep = fourthStep - yourNumber;
            System.out.println("Your number subtracted from " + fourthStep + ":");
            System.out.println(fifthStep);
            int sixthStep = fifthStep / 6;
            System.out.println("Six divided into " + fifthStep + ":");
            System.out.println(sixthStep);
            int magicAnswer = sixthStep;
            System.out.println("Your magic answer is: " + magicAnswer);
            /*You can go back to the beginning to change your number and
            the magicAnswer should always be three no matter the input.*/

        }

    }
