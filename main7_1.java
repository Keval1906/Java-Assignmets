//created by Keval Hadiyal 21ce038
import java.util.Arrays;

public class main7_1 {
    public static void main(String[] args) {
        pr7_class1[] s = new pr7_class1[4];
        s[0] = new pr7_class1("Kevak", 18, 67);
        s[1] = new pr7_class1("Ronak", 18, 94);
        s[2] = new pr7_class1("Darshan", 19, 90);
        s[3] = new pr7_class1("Om", 18, 89);
        System.out.println("------------------------------------ --------------");
        System.out.println("Before sorting:- ");
        System.out.println(Arrays.toString(s));
        System.out.println("------------------------------------ --------------");
        Arrays.sort(s);
        System.out.println("After sorting:- ");
        System.out.println(Arrays.toString(s));
        System.out.println("------------------------------------ --------------");
    }
}
