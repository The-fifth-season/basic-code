package Web.TCP.Test2;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//接收并反馈————服务端
public class ServerTest2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();
        //缓存流的话，会在停止传输后，再输出数据
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line;
        //readLine()方法阻塞，所以断开连接后，才输出
        while ((line = br.readLine()) != null) {
            System.out.print(line);
        }
        //回写数据————已经连接过了，直接通过socket中的流回写就行
        OutputStream os = accept.getOutputStream();
        os.write("接收完毕".getBytes());
        //缓存流输出完毕要及时刷新
        os.flush();
        accept.shutdownOutput();
        accept.close();
        ss.close();
    }
}








