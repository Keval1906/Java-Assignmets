/*  CREATED BY 21CE038 KEVAL HADIYAL
WAP to show the try - catch block to catch the different types of exception.  */

import java.util.*;

public class pr4_code1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ArithmeticException");
        try {
            int div = 20 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println();
        System.out.println();
        System.out.println("ArrayIndexOutOfBoundsException");
        try {
            int arr[] = { 1, 2, 3, 4, 5 };
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println();
        System.out.println();
        System.out.println("NumberFormatException");
        int number;
        try {
            System.out.print("Enter an integer : ");
            number = Integer.parseInt(sc.next());
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println();
        System.out.println();
        System.out.println("InteruptedExeption");
        Thread t = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(-10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.setName("Test Thread");
        t.start();
    }
}
