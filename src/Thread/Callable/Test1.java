package Thread.Callable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map<Thread,SumTask> thMap = new HashMap<>();                //HashMap存在线程不安全
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
            SumTask st = new SumTask(num1);                         //SumTask用于计算数组的总和
            Thread th = new Thread(st,"线程"+(i));
            thMap.put(th,st);
            th.start();
        }
        //每个线程都堵塞一下，确保全部运行完再输出值
        for (Thread thread: thMap.keySet()){
            try {
                thread.join();                      //线程加入，等线程运行完再往下运行
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int sum=0;
        for (Thread thread: thMap.keySet()){
            sum+=thMap.get(thread).sum;
        }
        System.out.println(sum);            //没有join的话，线程中还没运算完，就输出值了，所以得不到想要的结果
/*
        SumTask st = new SumTask(num);
        Thread th = new Thread(st);
        th.start();
        try {
            th.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(st.sum);
*/
    }
}
