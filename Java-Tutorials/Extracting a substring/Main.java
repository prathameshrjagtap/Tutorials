import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String oldStr = scanner.next();
        System.out.println("Enter Two integers: ");
        int beginInd = scanner.nextInt();
        int endInd = scanner.nextInt();
        System.out.println(oldStr.substring(beginInd, endInd + 1));
    }
}
