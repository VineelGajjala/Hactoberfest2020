import java.util.Scanner;

public class PrimeTest {

    public boolean isPrime(int number) {
        boolean isPrime = false;
        int divider = 2;
        int numbersDivisbleBy = 0;

            while (divider < number) {
                if (number % divider == 0) {
                    numbersDivisibleBy++;
                }
                divider++;
            }
        return (numbersDivisibleBy == 0);
    }

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        PrimeTest primeTest = new PrimeTest();
        System.out.println("Type an integer:");
        final int number = scanner.nextInt();
        scanner.close();
        if (primeTest.isPrime(number)) {
            System.out.println("Number " + number + " is a prime number.");
        } else {
            System.out.println("Number " + number + " is not a prime number.");
        }
    }
}
