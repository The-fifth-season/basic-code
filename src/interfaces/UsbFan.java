package interfaces;

public class UsbFan implements IUsb{
    @Override
    public void service() {
        System.out.println("插入了电风扇吹风");
    }
}
