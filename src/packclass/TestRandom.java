package packclass;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random r = new Random(100);                      //给定种子的话，生成的是伪随机数
        for (int i=0;i<3;i++){
            System.out.println(r.nextInt(20));
        }
        System.out.println("-----------");

        Random r1 = new Random(100);                    //只要种子和random的范围值不变，则无论怎么循环输出的值都一样
        for (int i=0;i<5;i++){
            System.out.println(r1.nextInt(20));
        }
        System.out.println("-----------");

        Random r2 = new Random();                                   //每次运行输出的值都不一样
        System.out.println(r2.nextInt(20,40));       //20~40之间

    }
}
