import java.util.Scanner;

public class FizzBuzzProblem {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integer numbers: ");
        int startInput = scanner.nextInt();
        int endInput = scanner.nextInt();

        for (int fizzBuzz = startInput; fizzBuzz <= endInput; fizzBuzz++) {

            if (fizzBuzz % 3 == 0 && fizzBuzz % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (fizzBuzz % 5 == 0) {
                System.out.println("Buzz");
            } else if (fizzBuzz % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(fizzBuzz);
            }
        }
    }
}
