import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bus height: ");
        int busHeight = sc.nextInt();
        System.out.println("Enter number of Bridges: ");
        int noOfBridges = sc.nextInt();
        int n = noOfBridges;
        int bridge;

        String message = "Will not crash";

        for (int i = 1; i <= n; i++) {
            bridge = sc.nextInt();

            if (busHeight >= bridge) {
                message = "Will crash on bridge " + i;
                break;
            }
        }

        System.out.println(message);
    }
}
