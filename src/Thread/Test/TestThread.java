package Thread.Test;
//要求:医院有普通号和特需号，每天普通号可以挂50个，特需号可以挂30个，普通号看病是每0.5秒看一个，特需号是每1秒看一个，
// 特需号一开始的时候被叫到的概率更大。普通号每天看到第10个的时候需要把特需号先看完再继续看普通号。
public class TestThread {
    public static void main(String[] args) {
        MyThread3 th3 = new MyThread3();
        Thread th1 = new Thread(th3,"普通号");
        th1.start();


    }
}
