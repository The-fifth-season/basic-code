package ThreadTest7.Test4;
import java.util.Random;

//run方法里面不写循环的话，则每个线程执行一次，就退出了
public class RedPick implements Runnable{
    int money = 100;
    int num;
    int i = 0;
    @Override
    public void run() {
            synchronized (this){
                if (i<2){
                    Random r =new Random();
                    num = r.nextInt(1,money);
                    money = money-num;
                    System.out.println(Thread.currentThread().getName()+"---"+num);
                }else if (i==2){
                    System.out.println(Thread.currentThread().getName()+"---"+money);
                }else {
                    System.out.println(Thread.currentThread().getName() + "没抢到");
                }
                i++;
            }
    }
}
