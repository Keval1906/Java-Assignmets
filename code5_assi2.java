/* Develop a Program that illustrate method overloading concept.
Created by ---> 21CE038 - Keval R. Hadiyal  */
//class file
import java.util.Scanner;
public class code5_assi2 {
    
    static double area(int r) {
        double t = 3.14 * r * r;
        return t;
    }
    static float area(int a, int b) {
        float t = a * b;
        return t;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        int cr = sc.nextInt();
        code5_assi2 a = new code5_assi2();
        double j = a.area(cr);
        System.out.println("area of circle : "+j);
        System.out.println("Enter length of rectanlgle : ");
        int rs = sc.nextInt();
        System.out.println("Enter breadth of rectangle : ");
        int rs2 = sc.nextInt();
        float k = a.area(rs, rs2);
        System.out.println("Area of rectangle : " +k);

    }
}
