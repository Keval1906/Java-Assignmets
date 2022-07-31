import java.util.*;
/*Given a string, return a string made of the first 2 chars (if present), however include 
first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" 
yields "oz".
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
21CE038-KEVAL R HADIYAL*/
public class code2_assi {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter your string : ");
        s = sc.next();
        char a = s.charAt(0);
        char b = s.charAt(1);
        if (s.charAt(0) == 'o' || s.charAt(0) == 'O') 
        {
            if (s.charAt(1) == 'z' || s.charAt(1) == 'Z') {
                System.out.println(a + "" + b);
            }
             else {
                System.out.println(a);
            }
        } 
        else 
        {
            if (s.charAt(1) == 'z' || s.charAt(1) == 'Z')
            {
                System.out.println(b);
            }
        }
    }
}
