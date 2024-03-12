package Thread.Creation;

public class TestThread {
    public static void main(String[] args) {
        //通过接口的方法创建线程，要先创建一个继承了Runnable的线程对象
        MyThread th = new MyThread();

        Thread th1 = new Thread(th,"线程1");               //线程1
        th1.start();

        Thread th2 = new Thread(th);                             //线程2
        th2.setName("线程2");
        th2.start();

        //通过继承的方法创建线程                                     线程3
        Thread th3 = new MyThread1();
        th3.setName("线程3");
        th3.start();
    }
}
 /*
    总结:继承Thread类和实现Runnable接口，我们更希望用第二种方案。
    1、继承是单根性，如果一个类已经有父类，那么这个类就不能再继承Thread这类
    2、实现接口能方便各个线程对象共享数据
 */