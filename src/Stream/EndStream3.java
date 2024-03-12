package Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
/*
       collect(Collector  collector)    收集流中的数据，存于集合中（List、Set、Map）
 */
public class EndStream3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"三月-崩-1","镜流-崩-2","希儿-崩-3",
                "托帕-崩-4","姬子-崩-5","青雀-崩-6","符玄-崩-7","芙芙-原-1","胡桃-原-2","优菈-原-3");
        //将崩的角色收集于list集合中
        List<String> collect = list.stream()
                .filter(name -> "崩".equals(name.split("-")[1]))           //过滤
                .collect(Collectors.toList());                          //同理可转换为toSet，toSet可去重
        System.out.println(collect);
    }
}
