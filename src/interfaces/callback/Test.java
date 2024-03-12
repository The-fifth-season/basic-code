package interfaces.callback;

public class Test {
    public static void main(String[] args) {
        ICallback c = new CallBack();               //以后可以通过：反射+注解自动的寻找用户类来完成对子类的实例化
        c.doCall();
    }
}
