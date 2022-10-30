import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter two numbers with operator (like 2000 + 3000) : ");
        long firstNumber = sc.nextLong();
        
        char operation = sc.next().charAt(0);

        long secondNumber = sc.nextLong();
        
        switch (operation) {
            case '+':
                System.out.println(firstNumber  +  secondNumber);
                break;
            case '-':
                System.out.println(firstNumber  -  secondNumber);
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(firstNumber / secondNumber);
                }
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}
