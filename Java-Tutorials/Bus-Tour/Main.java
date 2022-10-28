import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int n = sc.nextInt();
        int bridge;

        String message = "Will not crash";

        for (int i = 1; i <= n; i++) {
            bridge = sc.nextInt();

            if (weight >= bridge) {
                message = "Will crash on bridge " + i;
                break;
            }
        }

        System.out.println(message);
    }
}
