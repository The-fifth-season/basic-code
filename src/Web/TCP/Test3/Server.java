package Web.TCP.Test3;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;

//接收文件，并写入到本地
public class Server {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\CloudMusic\\VipSongsDownload\\ZIMA芝麻酱,饭角 - 解惑.flac",true);
        //接收客户端的绑定
        ServerSocket s = new ServerSocket(10000);
        Socket accept = s.accept();
        InputStream is = accept.getInputStream();
        byte[] bytes1 = new byte[1024 * 8];
        int len;
        while((len=is.read(bytes1))!=-1){
            System.out.println(new String(bytes1,0,len));
            fos.write(bytes1,0,len);
        }
        //回写数据
        OutputStream os = accept.getOutputStream();
        os.write("输出完毕".getBytes());
        //关闭输出流，告诉对面输出完毕
        accept.shutdownOutput();
        s.close();
        fos.close();
    }
}
