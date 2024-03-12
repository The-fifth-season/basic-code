package Web.TCP.Test1;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
//多收多发
public class ServerTest1 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();                   //如果用缓存流包装，则会在断开连接后再输出数据；
        InputStreamReader isr = new InputStreamReader(is);          //BufferedReader br = new BufferedReader(isr);
        int len;                                                    //String str;
        while ((len=isr.read())!=-1){                               //while ((str=br.readLine())!=null)
            System.out.print((char)len);                            //{
        }                                                           //     System.out.print(str);
        ss.close();                                                 //}
    }
}
