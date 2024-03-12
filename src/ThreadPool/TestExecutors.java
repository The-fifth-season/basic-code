package ThreadPool;
import java.util.concurrent.*;

//自动创建线程池————4种方法；
public class TestExecutors {
    public static void main(String[] args) {
        //ExecutorService pool = Executors.newSingleThreadExecutor();         单线程线程池————核心线程=最大线程=1； 队列无界——Integer.MAX_VALUE

        //ExecutorService pool1 = Executors.newFixedThreadPool(10);       //固定长度线程池：核心线程=最大线程=n; 队列无界

          ExecutorService pool2 = Executors.newCachedThreadPool();        //带缓存的线程池：核心线程=0；队列没有缓存作用； 最大线程——无界
                                                                           //有任务时，最大线程会不断创建————例如：如果有1000个任务，可能线程有可能会创建到300个同时进行任务
                                                                            //如果60s没有线程在进行任务，则销毁全部线程；
        for (int i=1;i<=100;i++){
            pool2.submit(new Task(i));
        }
        pool2.shutdown();

        ScheduledExecutorService pool3 = Executors.newScheduledThreadPool(10, new ThreadFactory() {             //10个核心线程；同时在后台运行，
            int i=1;
            @Override
            public Thread newThread(Runnable r)
            {
                return new Thread(r,"线程"+(i++));
            }
        });
        pool3.scheduleAtFixedRate(new Task(888),2,1,TimeUnit.MILLISECONDS);             //2是初始等待时间，1是输出的间隔时间，后面的是前面两个时间的单位
        //pool3.shutdown();
    }
}
