import java.io.*;
public class pr5_code2_2 {
    public static void main(String[] args) throws IOException
    {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
        try
        {
            sourceStream = new FileInputStream("D:\\STUDY\\JAVA practical\\Practice set 5 - File Handling & Streams\\1.txt");
            targetStream = new FileOutputStream("D:\\STUDY\\JAVA practical\\Practice set 5 - File Handling & Streams\\2.txt");
            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte)temp);
        }
        finally
        {
            if (sourceStream != null)
                sourceStream.close();
            if (targetStream != null)
                targetStream.close();
        }
    }
}
