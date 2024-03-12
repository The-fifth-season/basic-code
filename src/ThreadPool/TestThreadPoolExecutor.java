package ThreadPool;
import java.util.concurrent.*;

public class TestThreadPoolExecutor {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(5, 10, 100, TimeUnit.SECONDS, new ArrayBlockingQueue<>(4),
                new ThreadFactory() {               //线程工场——匿名内部类，可以更改线程名字
                    int i=1;
                    @Override
                    public Thread newThread(Runnable r) {
                        return new Thread(r,"线程"+(i++));
                    }
                },new ThreadPoolExecutor.CallerRunsPolicy());    //拒绝策略——4种
        for (int i=1; i<=17;i++){
            pool.execute(new Task(i));
        }
        pool.shutdown();                                              //关闭线程池：执行完现有的线程任务，后关闭；
//        List<Runnable> list =pool.shutdownNow();                         //立马关闭线程池：将现有的任务，以runnable的list集合类型返回，然后直接关闭线程池
//        System.out.println(list);
    }
}


