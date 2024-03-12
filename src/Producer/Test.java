package Producer;

public class Test {
    public static void main(String[] args) {
        Card card = new Card();
        new Thread(new BF(card),"男朋友").start();
        new Thread(new GF(card),"女朋友").start();
        new Thread(new BF(card),"男朋友2").start();
        new Thread(new GF(card),"女朋友2").start();
    }
}