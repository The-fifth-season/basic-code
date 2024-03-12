package ThreadPool.ThreadLocal;

public class ThreadLocalSet {
    private static final ThreadLocal<Integer> threadCounter = ThreadLocal.withInitial(() -> 1);     //设定初始值为1
    public static Integer incrementCounter(int i) {
        threadCounter.set(1000);                        //将创建的线程中的map的值设定为1000，初始值则从1——>1000；
        return  threadCounter.get() + i;                //获取map的值，然后加上i；
    }
}
