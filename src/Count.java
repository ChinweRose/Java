import java.util.Scanner;
public class Count {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10) {
            System.out.print("Enter your grade: ");
            int grade = input.nextInt();

            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }
            int average = total/10 ;

            System.out.printf("Total of all 10 grade is %d%n", total);
            System.out.printf("Average is: %d%n", average);





    }
}
