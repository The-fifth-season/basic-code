package ThreadTest7.Test2;

public class Test {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread th = new Thread(ticket,"线程1");
        Thread th2 = new Thread(ticket,"线程2");
        th.start();
        th2.start();
    }

}
