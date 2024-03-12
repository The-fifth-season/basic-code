package Thread.Callable;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<FutureTask<Integer>> f =new ArrayList<>();         //用于存放FutureTask中的值

        int[] num =new int[10000];
        int count = 4;
        for (int i = 0; i< num.length; i++){
            num[i]=i+1;
        }
        for (int i=0;i<count;i++){                  //几个线程就循环几次，声明几个新数组
            int[] num1 = new int[num.length/count];
            //从num中的指定位置开始，，按顺序，复制进num1中的开始和结束位置。
            System.arraycopy(num, i * num.length / count, num1, 0, num1.length);
            System.out.println(Arrays.toString(num1));
            CallTask callTask = new CallTask(num1);
            FutureTask<Integer> ft = new FutureTask<>(callTask);    //包装callTask的同时，还要返回callTask的返回值；
            ft.run();
            /*Thread th = new Thread(ft);                             //如果不包装，Thread（）中无法放CallTask类型
            th.start();*/
            f.add(ft);
        }
        //不要将堵塞放入循环中，要不然不能4个线程一起启动，多线程就没有意义了            （不堵塞的话，线程没运行完就往下执行，则得不到真确的结果）
        int sum=0;
        for(FutureTask<Integer> ft1 :f){
            try {
                sum+= ft1.get();                                               //ft.get()自动堵塞，get()方法完全执行完得到值，才继续运行；
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(sum);
    }
}
