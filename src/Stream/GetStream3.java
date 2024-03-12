package Stream;
//获取Stream流
import java.util.Arrays;
import java.util.stream.Stream;

//     数组   和   零散数据

public class GetStream3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};                    //基本数据类型
        String[] arr2 = {"a","b","c"};                      //引用数据类型

        Arrays.stream(arr).forEach(value -> System.out.print(value+" "));
        System.out.println("\n"+"-------------");
        Arrays.stream(arr2).forEach(value -> System.out.print(value+" "));

        //零散数据
        Stream.of("a","b","c").forEach(System.out::println);
    }
}
