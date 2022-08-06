//Main file
import java.util.*;

public class main5 {
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
