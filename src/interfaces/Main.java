package interfaces;

public class Main{

    public IUsb iusb = new IUsb() {             //通过接口创建实现方法
        @Override
        public void service() {

        }
    };

    public static void main(String[] args) {
        Computer c = new Computer();
        c.usb = new UsbDisk();              //通过接口创建实现类————UsbDisk有IUsb接口，相当于子类，c.usb为IUsb类型，相当于父类，此处为多态
        c.usb.service();                    //调用了IUsb中的方法，执行的是子类的方法，即UsbDisk的方法；
        //另一种写法而已，和上面差不多
        UsbFan fan = new UsbFan();
        c.usb = fan ;
        c.usb.service();

        //这里为匿名内部类，实际上是创建了一个IUsb的子类，但隐藏起来了
        c.usb = new IUsb() {
            @Override
            public void service() {
                System.out.println("匿名内部类使用了Usb接口");
            }
        };
        c.usb.service();
    }

}
