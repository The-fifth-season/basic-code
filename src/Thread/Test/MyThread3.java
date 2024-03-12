package Thread.Test;
//该方法是通过匿名内部类来完成：

public class MyThread3 implements Runnable{
        public void run(){
        Thread com = new Thread(
                //匿名内部类：
                () -> {
                    for (int i=1;i<=20;i++){
                        System.out.println(Thread.currentThread().getName()+"-"+i);
                        try {
                            Thread.sleep(100);                          //每输出一个休眠100ms
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                },"特殊号");
        com.start();
        for (int i=1;i<=50;i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
            //输出到10时，开始输出com线程
            if (i==10){
                try {
                    com.join();                         //join()接下来输出com
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
