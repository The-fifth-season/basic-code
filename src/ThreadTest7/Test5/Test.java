package ThreadTest7.Test5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);
        PrizePool pr = new PrizePool(list);
        Thread th1 = new Thread(pr,"抽奖箱1");
        Thread th2 = new Thread(pr,"抽奖箱2");
        th1.start();
        th2.start();


    }
}
