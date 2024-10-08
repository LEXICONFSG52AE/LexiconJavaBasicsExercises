import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;
        float average = sum / 3.0f;

        System.out.println("(" + num1 + " + " + num2 + " + " + num3 + ") / 3 = " + average);
    }
}
