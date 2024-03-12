package IOstream.byteStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//通过字节流————读取数据(创建文件夹，复制文件)
public class ByteStreamTest {
    public static void main(String[] args) throws Exception {
        File dir = new File("D:\\CloudMusic\\VipSongsDownload\\456\\789");
        System.out.println(dir.mkdirs());
        int length;
        FileInputStream is = new FileInputStream("D:\\CloudMusic\\VipSongsDownload\\YOASOBI - アイドル.ncm");
        FileOutputStream os = new FileOutputStream("D:\\CloudMusic\\VipSongsDownload\\456\\789\\YOASOBI - アイドル.ncm",true);      //true表示续写，不加true则为覆盖
        try (is) {
            try (os)
            {
                //一次读取多个字节                                                //length：返回的是 读取到的字节长度；读到的数值储存到了buf数组中,若直接读到结尾，则返回-1
                byte[] buf = new byte[1024*1024*5];                           //一次读取1024*1024*5个字节，即一次5M地读————经验：8k既不会浪费空间，效率也不错
                while ((length = is.read(buf)) != -1) {                       //is.read(buf)方法————从输入流is中读取数据，将数据填充到buf数组中。
                    // 返回值length————从字节流中读取的字节个数
                    System.out.println(new String(buf, 0, length));     //String方法————提取指定范围的字节数据，并将其转换成一个字符串对象。
                    os.write(buf, 0, length);
                }
                os.close();
                is.close();                                                    //先关闭输出流，再关闭输入流——————先关闭后定义的
            }
        }                                                                      //创建字节读取的类， 括号里可以是文件类型，也可以是路径（String[]类型）
        System.out.println(length);
    }
}