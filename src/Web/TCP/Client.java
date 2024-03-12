package Web.TCP;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

//客户端，发送数据————TCP协议
@MyTest1(value = "你好你好",aaa = 200 ,bbb = {"我很好","你好吗"})
public class Client {
    public static void main(String[] args) throws IOException {
        //1、创建Socket
        //细节：创建对象的时候连接服务端，连接不上则会报错
        Socket s = new Socket("127.0.0.1",10086);

        OutputStream os = s.getOutputStream();

        os.write("你好你好".getBytes());


        os.close();
        s.close();
    }
}
