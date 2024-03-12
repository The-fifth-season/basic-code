package IOstream.ZipStream;
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//压缩文件
public class OutputStreamTest {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\dir\\abc.txt");
        String s = file1.getName().split("\\.")[0];
        //设定压缩文件路径
        File file2 = new File("D:\\dir\\abc3.zip");                    //第一个参数，可以为文件类型，也可以为字符串类型，都表示父级文件路径
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(file2));         //在指定位置创建文件
        //创建一个ZipEntry型文件————压缩包中的文件类型
        ZipEntry entry = new ZipEntry("dir\\abc\\123.txt");

        //将文件放入指定位置的压缩包中
        zos.putNextEntry(entry);

        //将数据传入压缩包中的文件中
        FileInputStream fis = new FileInputStream(file1);
        int len = 0;
        byte[] b = new byte[1024];
        while((len=fis.read(b))!=-1){
            zos.write(b,0,len);         //读取到最新放入的压缩文件中去
        }
        fis.close();
        zos.close();
    }

}
