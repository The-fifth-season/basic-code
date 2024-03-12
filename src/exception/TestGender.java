package exception;

import java.util.Scanner;

public class TestGender {
    public static void main(String[] args) {
        try {
            System.out.println(Gender());
        } catch (Exception e) {
            System.out.println(e.getMessage());                     //4、抓取异常，出现异常后执行里面的代码；getMessage是Exception中的方法
        }
    }
    public static String Gender() throws Exception {                //3、抛出异常后这里也要抛
        Scanner input = new Scanner(System.in);
        String sex ;
        System.out.println("输入一个性别：");
        sex= input.next();
        if(sex.equals("男")||sex.equals("女")){                   //1、如果符合条件就执行，返回值
            return sex;
        }else throw new Exception("性别输入错误");                //2、不符合 自定义的条件 则抛出异常————1、2则为自定义异常

    }                                                            //注意：如果不设条件的话，则只要输入的为String类型，则不会出现异常，
}                                                                //所以要自定义异常，故不可以直接抓取异常
