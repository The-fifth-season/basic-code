package ThreadPool.ThreadLocal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilThreadLocal {
    //用ThreadLocal，将静态局部变量SimpleDateFormat定义，作为返回值
    static ThreadLocal<SimpleDateFormat> tl= ThreadLocal.withInitial(() ->
                 new SimpleDateFormat("yyyy-MM-dd HH-mm-ss")                 //以这个格式的一个初始时间（1970-01-01 08-00-00），实际上就是一个常量
            );
    //如果直接定义静态变量static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
    //则全部线程共用一个变量，可能一个线程任务进行到一半，另外一个线程又实用了sdf的值，则会导致安全问题
    public static String DateLocal(int i){
        tl.set(new SimpleDateFormat("yyyy-MM-dd HH-mm-ss SSS"));
        SimpleDateFormat sdf = tl.get();                                        //通过ThreadLocal的方法，获取返回值，之后的每个核心线程的 静态变量 sdf 就独立开来

        String smf;                                                             //核心线程中本来就是执 行完一个任务再进行下一个任务，因此不会出现线程不安全的问题
        smf = sdf.format(new Date(i*1000L));                                    //在sdf这个常量中，加上的时间（毫秒）
        return smf;
    }
}
//优点，在线程安全的情况下，尽可能的提高了效率；