import java.io.*;
public class pr5_code4_1 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new
                    FileReader("D:\\STUDY\\JAVA practical\\Practice set 5 - File Handling & Streams\\1.txt");
            int fChar;
            while ((fChar = reader.read()) != -1) //read char by char

            System.out.println((char)fChar); //write char char
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
