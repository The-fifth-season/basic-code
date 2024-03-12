package ThreadPool;

public class Task implements Runnable{
    int num;
    public Task(int i) {
        this.num = i;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--"+num);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //System.out.println(Thread.currentThread().getName()+"--"+num);
    }
}
