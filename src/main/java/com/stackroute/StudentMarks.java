/*Create a class called StudentMarks, which prompts user for the number of students, reads it
        from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
        grades of each of the students and saves them in an int array called stuGrades. Your program shall
        check that the grade is between 0 and 100 else has to trow an error message.
*/

package com.stackroute;
import java.util.Scanner;
public class StudentMarks {
    private final int LOWEST_GRADE  = 0;
    private final int HIGHEST_GRADE = 100;

    // student's grades
    private int[] grades;

    private Scanner in;
    public static void main(String[] args)
    {
        StudentMarks marks = new StudentMarks();
        marks.in = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = marks.in.nextInt();

        marks.run(numStudents);
    }
    private void run(int numOfStudents)
    {
        if (numOfStudents <= 0) {
            System.out.println("Invalid number of students.");
            return;
        }
        grades = new int[numOfStudents];

        double sum = 0;
        int    i   = 0;
        while (i < numOfStudents)
        {
            System.out.printf("Enter the grade for student %1$d: ", (i+1));
            int grade = in.nextInt();

            // check if grade is between 0 and 100
            if ((grade >= LOWEST_GRADE) && (grade <= HIGHEST_GRADE)) {
                grades[i] = grade;
                sum      += grade;
                i++;
                continue;
            }
            System.out.println("Invalid grade, try again...");
        }
        System.out.printf("The average is %1$.2f\n", (sum / numOfStudents));
    }

}