import java.util.Scanner;

public class TheathrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.next();
        int age = scanner.nextInt();
        int price = 0;

        if (age < 0 || age > 122) {
            System.out.println("Error!");
            return;
        }

        if (day.equals("Weekday")) {
            if (age >= 0 && age <= 18) {
                price = 12;
            } else if (age > 18 && age <= 64) {
                price = 18;
            } else if (age <= 122) {
                price = 12;
            }
        }

        if (day.equals("Weekend")) {
            if (age >= 0 && age <= 18) {
                price = 15;
            } else if (age > 18 && age <= 64) {
                price = 20;
            } else if (age <= 122) {
                price = 15;
            }
        }

        if (day.equals("Holiday")) {
            if (age >= 0 && age <= 18) {
                price = 5;
            } else if (age > 18 && age <= 64) {
                price = 12;
            } else if (age > 64 && age <= 122) {
                price = 10;
            }
        }
        if (price > 0) {
            System.out.printf("%d$", price);
        }
    }
}