package MyAccessments;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Account big = new Account();

        System.out.println("Enter initial name: "+ big.getName());

        System.out.println("Enter your name: ");
        String theName = input.next();
    }

}
