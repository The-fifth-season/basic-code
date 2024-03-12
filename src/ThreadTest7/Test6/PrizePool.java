package ThreadTest7.Test6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class PrizePool implements Callable<ArrayList<Integer>> {
    final ArrayList<Integer> list;
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    public PrizePool(ArrayList<Integer> list) {
        Collections.shuffle(list);
        this.list = list;
    }
    @Override
    public ArrayList<Integer> call() throws Exception {
         while (true){
            synchronized (list) {
                if (list.isEmpty()){
                    if (Thread.currentThread().getName().equals("抽奖箱1"))
                    return list1;
                    else return list2;
                }else {
                    if (Thread.currentThread().getName().equals("抽奖箱1")){
                        int num1 = list.remove(0);
                        System.out.println(Thread.currentThread().getName() + "--" + num1);
                        list1.add(num1);
                    }
                    else if (Thread.currentThread().getName().equals("抽奖箱2")){
                        int num2 = list.remove(0);
                        System.out.println(Thread.currentThread().getName() + "--" + num2);
                        list2.add(num2);
                    }
                }
            }try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
