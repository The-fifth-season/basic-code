package ThreadTest7.Test2;

public class Ticket implements Runnable{
    int num = 100;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (num>10){
                    System.out.println(Thread.currentThread().getName()+"剩余票数"+(--num));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else break;
            }
        }
    }
}
