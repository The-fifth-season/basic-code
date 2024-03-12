package Thread.Creation;
//通过接口的方式创建线程：
public class MyThread implements Runnable{

    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}
