package IOstream.FileWriter;
import java.io.*;
import java.nio.charset.Charset;
public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\dir\\GBK.txt", Charset.forName("GBK"));       //指定编码形式读取
        FileWriter fw = new FileWriter("D:\\dir\\UTF-8(2).txt",Charset.forName("GBK"));   //指定编码形式写入，（默认为UTF-8）
        int len = 0;
        char[] buf = new char[1024*8];
        while((len=fr.read(buf))!=-1){
            System.out.println(new String(buf,0,len));
            fw.write(new String(buf,0,len));
        }
        fr.close();
        fw.close();
    }
}
