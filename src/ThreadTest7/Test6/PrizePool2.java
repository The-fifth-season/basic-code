package ThreadTest7.Test6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class PrizePool2 implements Callable<ArrayList<Integer>> {
    final ArrayList<Integer> list;
    public PrizePool2(ArrayList<Integer> list) {
        Collections.shuffle(list);
        this.list = list;
    }
    @Override
    public ArrayList<Integer> call() {
        //线程栈！！每个线程运行到此处，都会在自己的栈空间创建一个集合，所以这个集合每个线程都是独立的，不共用！！
        ArrayList<Integer> list1 = new ArrayList<>();

         while (true){
            synchronized (list) {
                if (list.isEmpty()){
                    System.out.println(Thread.currentThread().getName()+"---"+list1);
                    return list1;
                }else {
                   int num = list.remove(0);
                    //System.out.println(Thread.currentThread().getName()+"+++"+list1);
                    list1.add(num);
                }
            }try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
