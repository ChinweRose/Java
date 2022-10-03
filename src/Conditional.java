import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        double firstNumber = input.nextInt();


        System.out.println("Enter second number:");
        double secondNumber = input.nextInt();

        double max = Math.max(firstNumber, secondNumber);
        System.out.println(max);
    }
}
