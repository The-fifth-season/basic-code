package ThreadTest7.Test3;

public class Test {
    public static void main(String[] args) {
        Number number = new Number();
        Thread th = new Thread(number,"线程1");
        Thread th2 = new Thread(number,"线程2");
        th2.setPriority(10);
        th.start();
        th2.start();
    }

}
