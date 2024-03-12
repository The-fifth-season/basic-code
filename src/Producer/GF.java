package Producer;

public class GF implements Runnable{
    final Card card;
    public GF(Card card) {
        this.card = card;
    }
    @Override
    public void run() {
        for (int i=1;i<=1000;i++){
            //不可以在BF存钱的时候，还未打印出余额，GF就同时取钱，所以要锁card这个公共资源，当前线程运行完括号内容后，card才解锁。
            synchronized (card){                        //要将BF和GF锁住，需要拿二者公用的资源card,所以这里不可以用this来锁，，
                System.out.println(Thread.currentThread().getName()+"第"+i+"次取钱");
                card.take();
           }
        }
    }
}