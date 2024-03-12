package Web.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//服务端————接收数据
public class Server {
    public static void main(String[] args) throws IOException {
        //1、创建ServerSocket对象
        ServerSocket ss = new ServerSocket(10086);
        
        //2、监听客户端的连接
        Socket accept = ss.accept();

        //从连接通道读取数据流
        InputStream is = accept.getInputStream();

        InputStreamReader isr = new InputStreamReader(is);
        int len;
        while((len= isr.read())!=-1){
            System.out.println((char)len);
        }
        ss.close();
    }
}
