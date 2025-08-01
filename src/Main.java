import java.util.Scanner;

public class Main {
    static int number = 0;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("PLEASE INPUT 5 NUMBERS");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i+ ": " );
            number = number+scanner.nextInt();

        }
        System.out.println("");
        System.out.println("Total Number: "+number);

        scanner.close();
    }
}