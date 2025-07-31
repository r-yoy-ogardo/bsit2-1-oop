import java.util.Scanner;

public class Main{

    static String studentID = "";
    static String firstName = "";
    static String lastName = "";
    static String course = "";
    static String section = "";

    static int midtermScore = 0;
    static int finalScore = 0;
    static int projectScore = 0;
    static int attendancePercentage = 0;

    static int allOverScore = 0;
    static float averageScore = 0;

    public static void main (String[] args){
        System.out.println("PLEASE INPUT YOUR STUDENT INFORMATION");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your ID Number: ");
        studentID = scanner.nextLine();
        System.out.print("Enter Your First Name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter Your Last Name: ");
        lastName = scanner.nextLine();
        System.out.print("Enter Your Course: ");
        course = scanner.nextLine();
        System.out.print("Enter Your Section: ");
        section = scanner.nextLine();

        System.out.println("");
        System.out.println("STUDENT INFORMATION");
        System.out.println("Student Id: " + studentID);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        System.out.println("");
        System.out.println("PLEASE INPUT YOUR SCORES");
        System.out.print("Enter Your Midterm Score: ");
        midtermScore = scanner.nextInt();
        System.out.print("Enter Your Final Score: ");
        finalScore = scanner.nextInt();
        System.out.print("Enter Your Project Score: ");
        projectScore = scanner.nextInt();
        System.out.print("Enter Your Attendance Percentage: ");
        attendancePercentage = scanner.nextInt();

        System.out.println("");
        System.out.println("STUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midtermScore);
        System.out.println("Final Exam Score: " + finalScore);
        System.out.println("Project Score: " + projectScore);
        System.out.println("Attendance Score: " + attendancePercentage);

        allOverScore = midtermScore + finalScore + projectScore + attendancePercentage;
        averageScore = (allOverScore * 100) / 400 ;

        System.out.println("");
        System.out.println("Average Score: "+ averageScore );

        if(averageScore < 75){
            System.out.println("Remarks: FAILED");
        }
        else{
            System.out.println("Remarks: PASSED");
        }
        scanner.close();
    }
}
