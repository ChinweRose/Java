import java.util.Scanner;
public class Age {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int total = 0;
        int ageCounter = 1;

        while (ageCounter <= 7){
            System.out.print("Enter age: ");
            int age = input.nextInt();
            ageCounter = ageCounter + 1;
            total = total + age;
        }

        int average = total / 7;

        System.out.printf("%nTotal of the seven ages is: %d%n ", total);
        System.out.printf("Average is: %d%n ", average);
    }
}