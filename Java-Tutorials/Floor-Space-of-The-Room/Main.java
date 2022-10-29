import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        switch (sc.next()) {
            case "triangle":
                
                double aSideOfTriangle = sc.nextDouble();
                double bSideOfTriangle = sc.nextDouble();
                double cSideOfTriangle = sc.nextDouble();
                double paraMeter = (aSideOfTriangle + bSideOfTriangle + cSideOfTriangle) / 2;
                double sS = Math.sqrt(paraMeter * (paraMeter - aSideOfTriangle) * 
                                      (paraMeter - bSideOfTriangle) * (paraMeter - cSideOfTriangle));
                
                System.out.println(sS);
                break;
                
            case "rectangle":
                
                double aSideOfRectangle = sc.nextDouble();
                double bSideOfRectangle = sc.nextDouble();
                
                System.out.println(aSideOfRectangle * bSideOfRectangle);
                
                break;
                
            case "circle":
                
                double radiusR = sc.nextDouble();
                System.out.println(3.14 * radiusR * radiusR);
                
                break;
    
            default:
                break;
        }
    }
}
