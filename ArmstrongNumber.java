import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean isArmstrong(int number) {
        String digits = Integer.toString(number);
        int numDigits = digits.length();
        int sumOfPowers = 0;
        
        for (int i = 0; i < numDigits; i++) {
            int digit = Character.getNumericValue(digits.charAt(i));
            sumOfPowers += Math.pow(digit, numDigits);
        }
        
        return sumOfPowers == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
}
