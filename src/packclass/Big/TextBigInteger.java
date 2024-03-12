package packclass.Big;
import java.math.*;
//大数据类：特点：
//（1）能储存的数据非常大
//（2）BigDecimal:浮点数的计算——不会丢失精度
public class TextBigInteger {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("1234567890");
        BigInteger b1 = new BigInteger("9876543210");

        //通过方法引用进行计算
        System.out.println(b.multiply(b1));
        System.out.println(b.add(b1));
       //BigInteger 能存的数据非常大
        StringBuilder str= new StringBuilder();
        for (int i=0;i<1000;i++){                   //str为0~1000的字符串
            str.append(i);
        }
        BigInteger b3 = new BigInteger(str.toString());
        System.out.println(b3);

        //BigDecimal不会丢失精度
        Double d = 0.09;
        Double d1 = 0.01;
        d=d+d1;
        System.out.println(d);          //输出为0.099999999999，丢失了精度
        BigDecimal bd = new BigDecimal("0.09");
        BigDecimal bd1 = new BigDecimal("0.01");
        System.out.println(bd.add(bd1));        //不会丢失精度


    }
}
