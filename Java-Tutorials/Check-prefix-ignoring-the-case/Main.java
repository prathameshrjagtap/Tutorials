import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string to check if it starts with j or not");
        String inputStr = scanner.next();
        String newStr = inputStr.substring(0,1);
        System.out.println(newStr.equalsIgnoreCase("J"));
    }
}
