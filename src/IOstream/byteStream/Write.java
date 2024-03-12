package IOstream.byteStream;
import java.io.*;
//字节流————通过byte[]读写文件
public class Write {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/dir/abc.txt");
        FileOutputStream os = new FileOutputStream(file);
        FileInputStream is = new FileInputStream(file);
        //写
        String s = """
                明月皎夜光

                明月皎夜光，促织鸣东壁。

                玉衡指孟冬，众星何历历。

                白露沾野草，时节忽复易。

                秋蝉鸣树间，玄鸟逝安适。

                昔我同门友，高举振六翮。

                不念携手好，弃我如遗迹。

                南箕北有斗，牵牛不负轭。

                良无盘石固，虚名复何益。""";
        byte[] arr = s.getBytes();                      //通过getBytes()方法进行转换
        os.write(arr);                              //只能放字节数组byte[]类型
        //读
        byte[] arr2 = new byte[1024];
        int read = is.read(arr2, 0, arr2.length);               //read为读取的长度，读取完毕则为-1
        System.out.println(new String(arr2,0,read));
        is.close();
        os.close();
    }
}
