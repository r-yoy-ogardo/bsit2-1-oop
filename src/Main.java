public class Main {
    public static void main (String[] args){
        Student student1 = new Student("Christan Jay", 20, "BSIT", 65.0, 70.0, 68.0);
        Student student2 = new Student("Samantha Gayle", 18, "BSIT", 85.0, 90.0, 88.0);
        Student student3 = new Student("Nikki", 19, "BSIT", 92.0, 95.0, 89.0);

        System.out.println("Student Information:");
        student1.displayInfo();
        student1.calculateAverage();
        student1.getLetterGrade();
        student1.isPassing();
        System.out.println(" ");

        student2.displayInfo();
        student2.calculateAverage();
        student2.getLetterGrade();
        student2.isPassing();
        System.out.println(" ");

        student3.displayInfo();
        student3.calculateAverage();
        student3.getLetterGrade();
        student3.isPassing();
        System.out.println(" ");

        System.out.println("Summary: 2 out of 3 students are passing.");
    }
}