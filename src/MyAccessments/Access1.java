package MyAccessments;

import java.util.Scanner;

public class Access1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;

        System.out.println("Enter first number: ");
         x = input.nextInt();

        System.out.println("Enter second number: ");
         y = input.nextInt();

        System.out.println("Enter third number: ");
         z = input.nextInt();

        int product = x*y*z;

        System.out.println("Product is " + product);

    }
}
