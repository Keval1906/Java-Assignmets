//Main file
import java.util.Scanner;

public class main1 {
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
