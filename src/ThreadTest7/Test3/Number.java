package ThreadTest7.Test3;

public class Number implements Runnable{
    static int num = 0;
    @Override
    public void run() {
        while (true){
            synchronized (this) {
                num++;
                if (num>=1000){
                    break;
                }
                else if (num%2==1){
                    System.out.println(Thread.currentThread().getName()+"--"+num);
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}