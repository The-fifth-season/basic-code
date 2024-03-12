package ThreadTest7.Test4;

public class Test {
    public static void main(String[] args) {
        RedPick redPick = new RedPick();
        Thread th = new Thread(redPick,"线程1");
        Thread th2 = new Thread(redPick,"线程2");
        Thread th3 = new Thread(redPick,"线程3");
        Thread th4 = new Thread(redPick,"线程4");
        Thread th5 = new Thread(redPick,"线程5");
        th.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }

}
