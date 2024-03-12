package ThreadTest7.Test1;

public class Test {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread th = new Thread(ticket,"线程1");
        Thread th2 = new Thread(ticket,"线程2");
        Thread th3 = new Thread(ticket,"线程3");
        th.start();
        th2.start();
        th3.start();
    }

}
