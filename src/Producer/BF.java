package Producer;

public class BF implements Runnable {

    final Card card;

    public BF(Card card) {
        this.card = card;
    }

    @Override
    public void run() {
        for (int i=1;i<=1000;i++){
            synchronized (card){
                System.out.println(Thread.currentThread().getName()+"第"+i+"次存钱");
                card.save();
            }

        }
    }
}
