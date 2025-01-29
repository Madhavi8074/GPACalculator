package projects;

import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalGradePoints = 0;
        int totalCredits = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter grade points for subject " + i + " (0-10 scale): ");
            double grade = scanner.nextDouble();

            System.out.print("Enter credit hours for subject " + i + ": ");
            int credits = scanner.nextInt();

            totalGradePoints += (grade * credits);
            totalCredits += credits;
        }

        // Calculate GPA
        double gpa = totalGradePoints / totalCredits;

        // Display GPA
        System.out.printf("Your GPA is: %.2f\n", gpa);

        scanner.close();
    }
}
