package ThreadPool.ThreadLocal;

import java.util.concurrent.*;

public class TestDate {
    public static void main(String[] args) {
        //创建线程池：
//        ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 10, 100, TimeUnit.SECONDS, new LinkedBlockingDeque<>(Integer.MAX_VALUE), new ThreadFactory() {
//            int i=1;
//            public Thread newThread(Runnable r) {
//                return new Thread(r,"线程"+(i++));
//            }
//        });
        ExecutorService pool = Executors.newFixedThreadPool(10, new ThreadFactory() {
            int i=0;
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r,"线程"+(i++));
            }
        });
        for (int i=0;i<1000;i++){                           //完成任务
            int finalI = i;                                 //线程中一定要定义一个变量来获取i的值，然后才能在线程中使用，要不然跑程序的过程中i的值可能会被重复使用，从而出现安全问题
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"--"+ DateUtilThreadLocal.DateLocal(finalI));
                    System.out.println(Thread.currentThread().getName()+"--"+ ThreadLocalSet.incrementCounter(finalI));
                }
            };
            pool.execute(r);
        }
           pool.shutdown();
    }
}
