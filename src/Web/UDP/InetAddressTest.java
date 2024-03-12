package Web.UDP;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        //InetAddress  ————IP的对象（计算机对象）
        InetAddress address = InetAddress.getByName("DESKTOP-JUT3FMC");
        System.out.println(address);            //主机名/IP： DESKTOP-JUT3FMC/192.168.3.88

        //获取IP
        String hostAddress = address.getHostAddress();
        //获取主机名
        String hostName = address.getHostName();
        System.out.println(hostAddress+"----"+hostName);
    }
}
