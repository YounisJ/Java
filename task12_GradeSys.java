
import java.util.Scanner;

public class task12_GradeSys {

    public static void main(String[] args) {

        // B. Take input of each student's name, marks, and grade from the user and store information in arrays
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numStudents = sc.nextInt();
        String[] names = new String[numStudents];
        int[] marks = new int[numStudents];
        String[] grades = new String[numStudents];


        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter the name of student " + (i+1) + ": ");

            String name = sc.next();
            names[i] = name;

            System.out.println("Enter the marks of student " + (i+1) + ": ");
            int mark = sc.nextInt();
            marks[i] = mark;
            System.out.println("Enter the Grade of student " + (i+1) + ": ");

            String grade=sc.next();
            grades[i] = grade;
        }


        System.out.println("Name\tMarks\tGrade");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(names[i] + "\t" + marks[i] + "\t\t" + grades[i]);
        }

//         D. Use for each to do the C part again
        System.out.println("Name\tMarks\tGrade");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(names[i] + "\t" + marks[i] + "\t" + grades[i]);
        }

    }

}