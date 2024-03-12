package FunctionDemo;
//方法引用：
/*
        1、把已经存在的方法拿过来用，当做函数式接口中抽象方法的方法体
        2、::  是 方法引用符
        注意：1、需要有函数式接口
             2、被引用方法必须已经存在
             3、被引用方法的形参和返回值需要跟抽象方法保持一致
             4、被引用方法的功能要满足当前的需求
 */
import java.util.Arrays;
import java.util.Comparator;

public class FunctionDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {1,5,6,7,2,6,3};
        //逆序输出
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));

        //lambda简化
        Arrays.sort(arr,(o1,o2)->o2-o1);

        //方法引用
        Arrays.sort(arr,FunctionDemo1::compare2);     //引用FunctionDemo1中的compare2方法
    }
    public static Integer compare2(Integer o1,Integer o2){
        return o2-o1;
    }
}
