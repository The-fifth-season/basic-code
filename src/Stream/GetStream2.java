package Stream;
//获取Stream流
import java.util.HashMap;

//双列集合————map
public class GetStream2 {
    public static void main(String[] args) {

        HashMap<String,Integer>  map = new HashMap<>();
        map.put("3月",3);
        map.put("4月",4);
        map.put("5月",5);
        map.put("6月",6);
        map.put("7月",7);
        map.put("8月",8);
        map.put("9月",9);
        //键流
        map.keySet().stream().forEach(s -> System.out.println(s));

        System.out.println("----------------------------");
        //键值对流
        map.entrySet().stream().forEach(s -> System.out.println(s));

    }
}
