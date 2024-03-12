package Web.UDP;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
//接收
public class Reception {
    public static void main(String[] args) throws IOException {
        //绑定端口，需要与发送端，指定发到的端口相同
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bytes = new byte[1024];
        //打包数据————传入一个字节数组进行接收，已经数组接收的长度
        //相比发送端，IP和端口号不需要传了
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        //接收数据
        ds.receive(dp);

        //解析数据包
        InetAddress address = dp.getAddress();          //获取发送端的设备IP对象
        byte[] data = dp.getData();                     //获取资源包
        int length = dp.getLength();                    //获取资源包长度
        System.out.println(length);
        int port = dp.getPort();                        //获取发送端的端口号

        System.out.println("发送的设备："+address+"======"+"发送的内容："+new String(data,0,length));
        System.out.println("发送端的端口号:"+port);
        //关流
        ds.close();
    }
}
