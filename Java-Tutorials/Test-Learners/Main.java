import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an option (between 1-4) : ");
        int inputNum = sc.nextInt();

        switch (inputNum) {
            case 1: // For Java
                System.out.println("Yes!");
                break;
            case 2: // For Kotlin
            case 3: // For Scala
            case 4: // For Python
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
                break;
        }
    }
}
