package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//测试除法异常

public class TestDivExp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        try {                                                   //这里可以替换为try-with-resources，用完就直接释放，就不需要写finally代码进行释放资源了
            System.out.println("请输入被除数（整数）：");         //try中的代码，中途只要出现异常，那直接跳转到抓取异常的代码；但最后都会执行finally代码
            int num1 = input.nextInt();
            System.out.println("请输入除数（非零整数）：");
            int num2 = input.nextInt();
            System.out.println(num1 / num2);
        } catch (InputMismatchException e) {                    //根据运行的报错抓取异常
            System.out.println("输入的不是整数");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (Exception e) {                                 //抓取所有的异常,Exception是所有的异常的父类，应该放在最后
            System.out.println("其它异常");
        } finally {                                             //最终————无论有无异常都会执行的代码———— 一般用于释放资源
            input.close();                                      //[强制]不能在finally块中使用return，finally块中的return返回后方法结束执行，不
        }                                                       //会再执行try块中的return语句。
        System.out.println("程序继续运行");
    }
}