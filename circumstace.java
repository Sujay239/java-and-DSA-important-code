import java.util.*;

public class Circumtances_Circle {

    public static double calculateCircumstance(double radius){
        return (2*3.14*radius);
    }
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
       double radius = x.nextDouble();
       x.close();
        System.out.println("The circumstance of the circle is: "+calculateCircumstance(radius));
        
    }
    
}
