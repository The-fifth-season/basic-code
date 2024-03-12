package Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;
/*
        void  forEach       遍历
        long  count         统计stream中的元素个数
        toArray             收集流中的数据，存于数组中
        collect             收集流中的数据，存于集合中
 */

//toArray 方法        转换为数组
public class EndStream2 {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        Collections.addAll(list,"1月","323月","345月","4567月","56789月","6789月","789月","389月","9月");
        /*
        IntFunction<String[]> 中的泛型： 具体类型的数组
        apply的形参value： 流中数据的个数，要跟数组的长度一致
        apply的返回值：  具体类型的数组
         方法体：就是创建stream中数据个数大小的数组————new String[value];
         */
        String[] array = list.toArray(new IntFunction<String[]>() {      //toArray方法的参数的作用：负责创建一个指定类型的数组
            public String[] apply(int value) {                                    //toArray方法的底层：依次遍历流中的每一个数据，存于数组中
                return new String[value];                                         //toArray方法的返回值：装有数据的数组
            }
        });
        System.out.println(Arrays.toString(array));             //用Arrays中的方法,将数组转换为字符串输出

        //lambda简化后
        String[] array1 = list.toArray(value -> new String[value]);              //value表示数据个数，创建一个value长的新数组
        String[] array2 = list.toArray(String[]::new);
        System.out.println(Arrays.toString(array2));
    }
}
