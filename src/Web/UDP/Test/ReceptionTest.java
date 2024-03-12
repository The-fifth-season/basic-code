package Web.UDP.Test;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class ReceptionTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\CloudMusic\\VipSongsDownload\\ZIMA芝麻酱,饭角 - 解惑.flac",true);
        DatagramSocket ds = new DatagramSocket(10086);
        int length = 8192;
        while(length==8192){
            int len;
            byte[] bytes = new byte[1024 * 8];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            ds.receive(dp);
            byte[] data = dp.getData();
            length = data.length;
            len = dp.getLength();
            fos.write(data,0,len);
            System.out.println(length+"==="+len);
        }

        ds.close();
        fos.close();
    }
}
