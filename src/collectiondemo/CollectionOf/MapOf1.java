package collectiondemo.CollectionOf;
import java.util.HashMap;
import java.util.Map;

public class MapOf1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("a",12);
        map1.put("b",12);
        map1.put("c",12);
        map1.put("d",12);
        map1.put("e",12);
        map1.put("f",12);
        map1.put("g",12);
        map1.put("h",12);
        Map<String, Integer> map = Map.copyOf(map1);        //将map1转换为了不可变集合
        //map.put("三月",12);                          报错；
        System.out.println(map);
    }
}
