package Web.UDP.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\CloudMusic\\ZIMA芝麻酱,饭角 - 解惑.flac");
        DatagramSocket ds = new DatagramSocket();
        InetAddress name = InetAddress.getByName("127.0.0.1");
        byte[] bytes = new byte[1024 * 8];
        int length;
        while((length=fis.read(bytes))!=-1){
            DatagramPacket dp = new DatagramPacket(bytes,length,name,10086);
            ds.send(dp);
        }
        ds.close();
        fis.close();
    }
}
