package Thread.Test2;
//该方法通过两个类来完成：

public class ComThread implements Runnable{
    //通过构造函数传入一个线程
    Thread spe;
    public ComThread(Thread spe) {
        this.spe = spe;
    }

    public void run(){
        for (int i=1;i<=50;i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
            //当i==10时，运行传入的线程
            if (i==10){
                try {
                    spe.join();                             //要先传入线程
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}