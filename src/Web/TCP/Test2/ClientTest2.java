package Web.TCP.Test2;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

//发送数据，并接收反馈————客户端
public class ClientTest2 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",10086);
        Scanner input = new Scanner(System.in);
        //BufferedInputStream 是 Java 中 InputStream 类的装饰器类之一
        //它提供了缓冲功能，可以提高从输入流中读取数据的效率。
        BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
        while (true){
            System.out.println("请输入数据：");
            String str = input.nextLine();
            if ("886".equals(str)){
                break;
            }
            byte[] bytes = str.getBytes();
            bos.write(bytes);
            //flush() 方法的作用是将缓冲区中的数据立即写入到输出流中，而不是等待缓冲区满了或者流关闭时才写入。
            bos.flush();
        }
        //结束标记————表示输出结束，服务端停止接收
        s.shutdownOutput();
        //接收客户端回写的数据
        InputStream is = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        System.out.println(br.readLine());
        s.close();
    }
}


