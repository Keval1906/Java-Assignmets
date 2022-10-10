import java.io.*;
public class pr5_code4_2{
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\STUDY\\JAVA practical\\Practice set 5 - File Handling & Streams\\1.txt");
            fos = new FileOutputStream("D:\\STUDY\\JAVA practical\\Practice set 5 - File Handling & Streams\\2.txt");
            int temp;
            while ((temp = fis.read()) != -1) //read byte by byte
                fos.write((byte)temp); //write byte by byte
            if (fis != null)
                fis.close();
            if (fos != null)
                fos.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
