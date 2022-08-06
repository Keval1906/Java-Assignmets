/*Design a class named Circle containing following attributes and behavior.
• One double data field named radius. The default value is 1.
• A no-argument constructor that creates a default circle.
• A Single argument constructor that creates a Circle with the specified radius.
• A method named getArea() that returns area of the Circle.
• A method named getPerimeter() that returns perimeter of it.
Created by ---> 21CE038 - Keval R. Hadiyal  */
// Class file
import java.util.*;

public class code1_assi2 {
    Scanner sc = new Scanner(System.in);
    double radius;

    public code1_assi2() {
        radius = 1;
    }

    code1_assi2(double radius) {
        this.radius = radius;
    }

    public double area(double radius) {
        double area = 3.14 * radius * radius;
        return area;
    }

    public double perameter(double radius) {
        double p = (2 * 3.14 * radius);
        return p;
    }
    public static void main(String[] args) {
        System.out.println("enter radius:");
        Scanner sc=new Scanner(System.in);
        double radius= sc.nextDouble();
        code1_assi2 a= new code1_assi2();
       double area= a.area(radius);
       double perameter=a.perameter(radius);
       System.out.println("AREA OF CIRCLE IS :"+area);
       System.out.println("PERAMETER OF CIRCLE IS :"+perameter);

    }
}
