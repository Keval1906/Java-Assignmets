import java.util.*;

class MyException extends Exception {

    public String getMessage() {
        return "Radius can't be negative!";
    }

    public String toString() {

        return "Radius can't be negative!";
    }
}

public class pr4_code2 {
    public static double area(double r) throws MyException {
        if (r < 0) {
            throw new MyException();
        }
        double result = 3.14159 * r * r;
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Enter the radius of circle : ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        try {
            double Ar = area(radius);
            System.out.println("Area = " + Ar);
        } 
        catch (MyException e) {
            System.out.println("Exception...");
            System.out.println(e);
        }
    }
}
