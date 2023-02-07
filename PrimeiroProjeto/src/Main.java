import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // LESSON ONE

        int firstNumber, secondNumber, sumOfTwoNumbers;

        Scanner scanner = new Scanner(System.in);

        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();
        sumOfTwoNumbers = firstNumber + secondNumber;

        System.out.printf("SOMA: %d\n\n", sumOfTwoNumbers);

        // LESSON TWO

        double circleRadius;

        circleRadius = scanner.nextDouble();
        circleRadius = Math.PI * Math.pow(circleRadius, 2);
        System.out.printf("A=%.4f", circleRadius);

        // LESSON THREE

        int a, b, c, d, difference;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        difference = (a * b - c * d);

        System.out.printf("DIFFERENCE =%d", difference);

        // LESSON FOUR

        float numberOfHoursWorked, amountReceivedPerHour, finalSalary;
        int employeeId;

        employeeId = scanner.nextInt();
        numberOfHoursWorked = scanner.nextFloat();
        amountReceivedPerHour = scanner.nextFloat();
        finalSalary = numberOfHoursWorked * amountReceivedPerHour;

        System.out.printf("NUMBER= %d\nSALARY= %.2f", employeeId, finalSalary);
        scanner.close();
    }
}