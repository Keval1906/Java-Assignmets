//Created by 21CE038 KEVAL HADIYAL

import java.util.*;

public class pr4_code3 {
    public static void MultipleCatch()
    {
        int arr []={9,25,38,19,50,75,81,98};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of the array that you want to devide : ");
        int index=sc.nextInt();
        System.out.print("Enter thr number that devide array element : ");
        int num=sc.nextInt();
        try
        {
            int ans=(arr[index]/num);
            System.out.println("Ans : "+ans);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("End of MultipleCatch method...");
        }
    }
    public static void main(String[] args) {
        MultipleCatch();
    }
}
