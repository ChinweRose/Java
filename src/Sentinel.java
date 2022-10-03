import java.util.Scanner;
public class Sentinel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.print("Enter grade or -1 to quit:");
        int grade = input.nextInt();

        while (grade != -1){
            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.print("Enter another grade or -1 to quit:");
            grade = input.nextInt();
        }

        if (gradeCounter != 0){
            double average = total/gradeCounter;

            System.out.printf("%nTotal of %d grades is: %d%n", gradeCounter,total);
            System.out.printf("Average is: %.2f%n", average);

        }

    }
}
