package Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"蔡坤坤,24","叶小咸,23","刘不甜,22","吴签,24","谷嘉,30","肖梁梁,27");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"赵小颖,35","杨颖,36","高元元,43","张天天,31","刘诗,35","杨小幂,33");

        Stream<String> stream1 = list1.stream().filter(name -> name.split(",")[0].length() == 3).limit(2);
        Stream<String> stream2 = list2.stream().filter(name -> name.split(",")[0].startsWith("杨")).skip(1);
        Stream<String> stream3 = Stream.concat(stream1, stream2);
        List<Actor> list = stream3.map(s -> {
            Actor act = new Actor();
            act.age = Integer.parseInt(s.split(",")[1]);
            act.name = s.split(",")[0];
            return act;
        }).toList();
        System.out.println(list);
    }
}
