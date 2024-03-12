package Web.TCP.Test3;
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
//客户端从本地读取文件，并发送文件，接收反馈
public class Client {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\CloudMusic\\ZIMA芝麻酱,饭角 - 解惑.flac");
        //创建客户端
        Socket s = new Socket("127.0.0.1",10000);
        OutputStream os = s.getOutputStream();
        byte[] bytes = new byte[1024 * 8];
        int length;
        while((length=fis.read(bytes))!=-1){
            os.write(bytes,0,length);
        }
        //关闭套接字的输出流————告诉服务端发送完毕
        //没有这句，服务器可能会一直等待从客户端接收数据，而客户端在发送完数据后也许会一直等待服务器的响应。
        s.shutdownOutput();

        InputStream is = s.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String str;
        while((str=br.readLine())!=null){
            System.out.println(str);
        }
        s.close();
        fis.close();
    }
}
