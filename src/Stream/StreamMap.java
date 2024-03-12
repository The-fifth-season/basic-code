package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

//map 流里面的数据类型转换
public class StreamMap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"三月-3","四月-4","五月-5","六月-6","七月-7","八月-8","九月-9");
        list.stream().map(new Function<String, Integer>() {              //String 表示流中原本的类型，Integer表示需要转换的数据类型
            @Override
            public Integer apply(String s) {
                String[] s1 = s.split("-");                     // 调用split的方法进行切割
                return Integer.parseInt(s1[1]);
            }
        }).forEach(System.out::println);

        //lambda 表达式简化
        list.stream().map(s -> {
            String[] s1 = s.split("-");
            return Integer.parseInt(s1[1]);
        }).forEach(System.out::println);

    }
}
