package Thread.Test2;

public class TestThread {
    public static void main(String[] args) {
        SpeThread s = new SpeThread();
        Thread spe = new Thread(s,"特殊号");
        ComThread c = new ComThread(spe);
        Thread com = new Thread(c,"普通号");
        spe.setPriority(10);            //设置优先度(1~10)
        com.setPriority(1);
        spe.start();
        com.start();
            }
}
