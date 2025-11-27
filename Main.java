import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // == Get user input for full name ==
        System.out.print("Enter first name: ");
        String firstName = in.nextLine();
        System.out.print("Enter last name: ");
        String lastName = in.nextLine();

        // == Call method to get full name ==
        String fullName = getFullName(firstName, lastName);
        System.out.println("Full Name: " + fullName);

        // == Get user input for squaring a number ==
        System.out.print("Enter a number to square: ");
        int number = in.nextInt();
        int squared = computeSquare(number);

        // == Call method to compute square ==
        System.out.println("Squared: " + squared);


        // == Get user input for grade ==
        System.out.print("Enter your grade: ");
        double grade = in.nextDouble();
        boolean passing = isPassing(grade);

        // == Call method to check if passing ==
        System.out.println("Is passing: " + passing);

        // == Get user input for average calculation ==
        System.out.print("Enter three integers to compute average: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        double average = getAverage(num1, num2, num3);

        // == Call method to compute average ==
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
