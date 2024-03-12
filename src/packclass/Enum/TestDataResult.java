package packclass.Enum;

import java.util.Arrays;

public class TestDataResult {
    public static void main(String[] args) {
        DataResult dr = DataResult.ERR2;
        System.out.println(dr.getCode()+"\n"+dr.getMsg());
        System.out.println(dr.ordinal());                               //实际上，枚举中每个实例对应一个数字；获取枚举的数字
        System.out.println(Arrays.toString(DataResult.values()));       //.values()可以获取枚举的一个数组，里面包含了枚举的所有枚举常量
        System.out.println(DataResult.valueOf("SUCCESS"));        //valueOf()方法返回指定字符串值的枚举常量。
    }

}
