package ThreadTest7.Test6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);
        PrizePool2 pr = new PrizePool2(list);
        //通过FutureTask<>来管理Callable的运行
        FutureTask<ArrayList<Integer>> ft = new FutureTask<>(pr);
        FutureTask<ArrayList<Integer>> ft2 =new FutureTask<>(pr);
        FutureTask<ArrayList<Integer>> ft3 =new FutureTask<>(pr);

        Thread thread = new Thread(ft,"抽奖箱1");
        Thread thread2 = new Thread(ft2,"抽奖箱2");
        Thread thread3 = new Thread(ft3,"抽奖箱3");

        thread.start();
        thread2.start();
        thread3.start();

        ArrayList<Integer> list1 = ft.get();
        ArrayList<Integer> list2 = ft2.get();
        ArrayList<Integer> list3 = ft3.get();

        Integer max1 = Collections.max(list1);
        Integer max2 = Collections.max(list2);
        Integer max3 = Collections.max(list3);
        System.out.println("抽奖箱1最大："+max1+"抽奖箱2最大："+max2+"抽奖箱3最大："+max3);
    }
}
