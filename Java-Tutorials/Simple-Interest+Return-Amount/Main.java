import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    float simpleInterest;
    float principal;
    float time;
    float interestRate;
    float returnAmt;
    
    System.out.println("This is the program to calculate the Simple Interest -> ");
    
    // Taking input for Principal Amount
    System.out.print("\nEnter Principal Amount : ");
    principal = userInput.nextInt();
    
    // Taking input for Interest Rate
    System.out.print("\nEnter Interest Rate : ");
    interestRate = userInput.nextInt();
    
    // Taking input for Time 
    System.out.print("\nEnter Time : ");
    time = userInput.nextInt();
    
    // Calculating Simple Interest
    simpleInterest = (principal * interestRate * time) / 100;
    
    // Calculating Return Amount
    returnAmt = principal + simpleInterest;
    
    // Printing Simple Interest
    System.out.print("\nSimple Interest is : " + simpleInterest + "\n");
    
    // Printing Return Amount
    System.out.println("\nTotal Amount to Return is : " + returnAmt);

    userInput.close();
  }
}
