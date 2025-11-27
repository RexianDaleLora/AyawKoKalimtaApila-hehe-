import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = in.nextLine();
        System.out.print("Enter last name: ");
        String lastName = in.nextLine();
        String fullName = getFullName(firstName, lastName);
        System.out.println("Full Name: " + fullName);
        System.out.print("Enter a number to square: ");
        int number = in.nextInt();
        int squared = computeSquare(number);
        System.out.println("Squared: " + squared);
        System.out.print("Enter your grade: ");
        double grade = in.nextDouble();
        boolean passing = isPassing(grade);
        System.out.println("Is passing: " + passing);
        System.out.print("Enter three integers to compute average: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        double average = getAverage(num1, num2, num3);
        System.out.println("Average: " + average);
        in.close();
    }

    public static String getFullName(String first, String last) {
        return first + " " + last;
    }

    public static int computeSquare(int num1) {
        return num1 * num1;
    }

    public static boolean isPassing(double grade) {
        return grade >= 75.0;
    }

    public static double getAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}