public class Student {

    String name = "";
    int age = 0;
    String course = "";
    double grade1 = 0.0;
    double grade2 = 0.0;
    double grade3 = 0.0;
    double average = 0.0;
    boolean isPassed = true;

    public Student( String studentName, int studentAge, String studentCourse, double studentGrade1, double studentGrade2, double studentGrade3){

        name = studentName;
        age = studentAge;
        course = studentCourse;
        grade1 = studentGrade1;
        grade2 = studentGrade2;
        grade3 = studentGrade3;
        isPassed = false;
    }
    public void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age +", Course: " + course);
        System.out.println("Grades: " + grade1 + ", " + grade2 + ", " + grade3);
    }
    public void calculateAverage(){
       average = (grade1 + grade2 + grade3)/3;
       System.out.println("Average: " + average);
    }

    public void getLetterGrade(){
        if (average >= 90){
            System.out.println("Letter Grade: A");
        }else if(average >= 80 && average <= 89){
            System.out.println("Letter Grade: B");
        }else if(average >= 70 && average <= 79){
            System.out.println("Letter Grade: C");
        }else if(average >= 60 && average <= 69){
            System.out.println("Letter Grade: D");
        }else{
            System.out.println("Letter Grade: F");
        }
    }

    public void isPassing(){
        if(average >= 70){
            isPassed = true;
            System.out.println("Status: PASSING");
        }else {
            System.out.println("Status: FAILING");
        }
    }
}
