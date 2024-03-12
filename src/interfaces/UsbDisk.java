package interfaces;

public class UsbDisk implements IUsb{
    @Override
    public void service() {
        System.out.println("插入了U盘读取资料");
    }
}
 