import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sequenceLen = scanner.nextInt();
        
        for (int i = 1; sequenceLen > 0; i++) {
            for (int j = 0; j < i && sequenceLen > 0; j++, sequenceLen--) {
                System.out.print(i + " ");
            }
        }
    }
}
