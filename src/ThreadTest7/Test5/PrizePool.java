package ThreadTest7.Test5;
import java.util.ArrayList;
import java.util.Collections;

public class PrizePool implements Runnable{
    ArrayList<Integer> list;
    public PrizePool(ArrayList<Integer> list) {
        Collections.shuffle(list);
        this.list = list;
    }
    @Override
    public void run() {
        while (true){
            synchronized (this) {
                if (list.isEmpty()){
                    break;
                }else System.out.println(Thread.currentThread().getName()+"--"+list.remove(0));
            }try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
