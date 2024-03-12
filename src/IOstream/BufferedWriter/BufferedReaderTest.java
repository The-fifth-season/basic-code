package IOstream.BufferedWriter;
import java.io.*;
//缓冲流的作用：提高效率

//字符缓冲流：BufferedReader    BufferedWriter
//          BufferedReader 特有的方法：       readLine()方法：一次读取一行，读到结尾返回null
//          BufferedWriter 特有的方法：       newLine()方法： 跨平台换行；（在什么操作系统中都可以换行）
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\dir\\abc.txt"));     //里面不可以用字节流，因此只能读取纯文本文件
        String s;
        while ((s=br.readLine())!=null){
            System.out.println(s);
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\dir\\abc.txt",true));
        String s2 = "123";
        bw.newLine();
        bw.write(s2);
        bw.close();

        //InputStreamReader：字符转换流————将字节流转换为字符流；
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\dir\\abc.txt"));
        //转换为字符流，才可以调用BufferedReader高级流
        BufferedReader br2 = new BufferedReader(isr);
    }
}
