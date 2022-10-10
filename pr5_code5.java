import java.util.*;
import java.io.*;
public class pr5_code5{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = null;
        BufferedWriter bw = null;
        FileReader in = null;
        FileWriter out = null;
        String filelocation = "Even.txt";
        File file = new File(filelocation);
        try
        {
            out= new FileWriter("Even.txt");
            bw= new BufferedWriter(out);
            ArrayList<Integer> num = new ArrayList<Integer>(15);
            System.out.println("Enter 15 Numbers : ");
            for(int i=0;i<15;i++)
            {
                Scanner sc= new Scanner(System.in);
                num.add(sc.nextInt());
            }
            for(int i=0;i<15;i++)
            {
                if(((num.get(i))%2==0))
                {
                    bw.write(num.get(i));
                }
            }bw.close();
            int abc;
            in= new FileReader("Even.txt");
            br= new BufferedReader(in);
            System.out.println("");
            System.out.println("Now Printing Even Numbers from Even.txt ...");
            while ((abc=br.read())!=-1)
            {
                System.out.println((abc));
            }
        }
        catch(Exception e)
        {
            System.out.println(" Some exception are founf ! Please entered valid integer!!! ");
        }
        finally
        {
            if (br != null)
            {
                br.close();
            }
        }
    }
}
