package interfaces;
//除非实现接口的类是抽象类，否则该类要定义接口中的所有方法。
public class Computer {
    IUsb usb;           //定义了IUsb的成员变量,有IUsb接口的东西都可以插到Computer这来用
}
