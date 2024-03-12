package Producer;

public class Card {
    private int money=50000;
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    //存钱
    public void save(){
        while(money>3000){
            System.out.println("发现有钱，先不存");
            try {
                this.wait();                                //wait等的是锁，这次的锁，锁的就是card，所以可以直接this调用wait
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        money+=1000;
        System.out.println(Thread.currentThread().getName()+"存入1000元，当前余额为："+money);
        this.notify();                                      //在锁中随机唤醒一个排队队列中的线程,唤醒后从该线程的wait处继续往下执行
    }
    //取钱
    public void take(){
        while (money<1000){
            System.out.println("发现没钱，先不取");
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        money-=1000;
        System.out.println(Thread.currentThread().getName()+"取出1000元，当前余额为："+money);
        this.notify();
    }

}
