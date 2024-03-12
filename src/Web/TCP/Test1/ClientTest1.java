package Web.TCP.Test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//多收多发
public class ClientTest1 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",10000);
        OutputStream os = s.getOutputStream();
        Scanner input = new Scanner(System.in);
        String str = null;
        while (true){
            System.out.println("请输入数据：");
            str = input.nextLine();
            if ("886".equals(str)){
                break;
            }
            byte[] bytes = str.getBytes();
            os.write(bytes);
        }
        s.close();
    }
}
