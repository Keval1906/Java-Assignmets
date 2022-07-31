/*Given an array of strings, return a new array without the strings that are equal to 
the target string. One approach is to count the occurrences of the target string, make 
a new array of the correct length, and then copy over the correct strings.
wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
21CE038- KEVAL R HADIYAL */
import java.util.*;
public class code6_assi{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l;
    System.out.print("Enter length :");
    l=sc.nextInt();
    String[] a=new String[l];
    String[] x=new String[l];
    for(int i=0;i<l;i++)
    {
    a[i]=sc.next();
    }
    String b;
    b=sc.next();
    int n=0;
    for(int j=0;j<l;j++)
    {
    if(!a[j].contains(b))
    {
    x[n]=a[j];
   n++;
    }
    }
    for (int q=0;q<n;q++)
    {
    System.out.print(x[q]);
    }
    }
}
