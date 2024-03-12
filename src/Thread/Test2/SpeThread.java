package Thread.Test2;
//通过接口的方式创建线程：
public class SpeThread implements Runnable{

    public void run(){
        for (int i=1;i<=30;i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
