package packclass.Integer;

import java.util.Arrays;

public class TestInteger {
    public static void main(String[] args) {
        String str1 = Integer.toString(100, 2);      //强制转换；可以转换成（2~36）其它进制，同时将整数类型转换为字符串类型
        //String str2 = Integer.toHexString(32);              //10——>16进制
        //String str3 = Integer.toBinaryString(100);          //10——>2进制
        System.out.println(str1);                         //输出为11001001，在结尾+1，而不是数值+1，可以看出输出的是字符串
        //System.out.println(str2)
        //System.out.println(str3);
        //字符型可以直接强转为整型——>输出Ascii值
        char str4 = 'a';
        System.out.println((int)str4);
        //字符串不行强转
        //通过以下方法转换成10进制的整型：
        String str5 = "1011";
        int num = Integer.parseInt(str5,2);         //此处的2——说明str5的类型为2进制；
        System.out.println(num);

        //System.out.println(str1.equals(str3));
        int num1;
        num1 = Integer.max(16,15);
        System.out.println(num1);
    }
}
