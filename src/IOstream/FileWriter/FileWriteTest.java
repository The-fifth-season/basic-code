package IOstream.FileWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//字符流————char[]————遇到中文则一次读取两个字节，遇到字母则一次只读取一个；
//只用于操作纯文本文件；
//这个方法中，读入和写出中的数据类型方便
public class FileWriteTest {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:/dir/FileWriter.txt",true);
        FileReader fr = new FileReader("D:/dir.abc.txt");
        int len;
        char[] ch =new char[1024];
        while ((len=fr.read(ch))!=-1){
            System.out.println(new String(ch,0,len));
            fw.write(new String(ch,0,len));
        }
        fr.close();
        fw.close();
    }
}
