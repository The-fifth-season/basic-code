package Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
/*
       collect(Collector  collector)    收集流中的数据，存于集合中（List、Set、Map）
       注意：
       流中数据存于map中，键不能重复，否则会报错————不会像操作map集合时，键相同会覆盖
 */
public class EndStream4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"三月-崩-1","镜流-崩-2","希儿-崩-3",
                "托帕-崩-4","姬子-崩-5","青雀-崩-6","符玄-崩-7","芙芙-原-1","胡桃-原-2","优菈-原-3");
        //将崩的角色收集于list集合中
        Map<String, Integer> map1 = list.stream()
                .filter(name -> "原".equals(name.split("-")[1]))           //过滤
                .collect(Collectors.toMap(new Function<String, String>() {                  //泛型一：流中的数据类型；泛型二：自定义的键的数据类型
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];                                       //返回值：键       形参：stream中的数据
                    }
                }, new Function<String, Integer>() {                                        //泛型一：流中的数据类型；泛型二：自定义的值的数据类型
                    @Override
                    public Integer apply(String s) {                                        //返回值：值        形参：stream中的数据
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));
        System.out.println(map1);
        Map<String, Integer> map2 = list.stream()
                .filter(name -> "崩".equals(name.split("-")[1]))
                .collect(Collectors.toMap(name -> name.split("-")[0],
                                          name -> Integer.parseInt(name.split("-")[2])));
        System.out.println(map2);
    }
}
