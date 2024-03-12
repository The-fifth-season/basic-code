package Web.UDP;
import java.io.IOException;
import java.net.*;
//发送数据
public class Send {
    public static void main(String[] args) throws IOException {
        //创建一个发送端端口
        //绑定端口，空参即随机端口发送数据
        DatagramSocket ds = new DatagramSocket();
        String str = "你好你好";
        byte[] bytes = str.getBytes();
        //获取一个设备对象————可以传入IP地址，也可以传入计算机名称，来获取对象
        InetAddress byAddress = InetAddress.getByName("127.0.0.1");         //127.0.0.1默认是本机的IP
        //获取设备的IP
        String hostAddress = byAddress.getHostAddress();
        /*打包操作：
        传入参数：1、字节数组
                2、需要打包的数组长度
                3、接收的IP
                4、接收的端口号*/
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length,byAddress,10086);
        //发送数据
        ds.send(dp);
        //关流
        ds.close();
    }
}




