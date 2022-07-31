
/*Given 2 strings, a and b, return the number of the positions where they contain the 
same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", 
and "az" substrings appear in the same place in both strings.
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
21CE038- KEVAL R HADIYAL*/
import java.util.*;

public class code5_assi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String str1;
        String str2;
        System.out.println("Enter Two strings : ");
        str1 = sc.next();
        str2 = sc.next();

        for (int i = 0; (i <= str1.length() - 2) && (i <= str2.length() - 2); i++) {
            String sub1 = str1.substring(i, i + 2);
            String sub2 = str2.substring(i, i + 2);
            if (sub1.equals(sub2)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
