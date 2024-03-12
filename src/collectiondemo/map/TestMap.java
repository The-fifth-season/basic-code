package collectiondemo.map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//HashMap 是无序的，即不会记录插入的顺序。

public class TestMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        //增加
        map.put("CN","中国");
        map.put("US","美国");
        map.put("RU","俄罗斯");
        //删除
        map.remove("RU");
        //改
        map.put("US","漂亮国");
        //遍历所有的键————可以通过 key 去获得 值
        for (String key:map.keySet()){                      //map.keySet()是键（key）的数组，（Set类型）
            System.out.println(key+"--"+map.get(key));      //map.get()，通过key去获取“值”
        }
        //遍历所有的值————但不可以通过 值 去获得 key
        for (String value:map.values()) {
            System.out.println(value);
        }
        //遍历所有的键值对
        for (Map.Entry<String ,String> kv : map.entrySet()){
            System.out.println(kv.getKey()+"--"+kv.getValue ());
        }
        System.out.println("----------");

        //用迭代器的方法：
        Iterator<String> itk = map.keySet().iterator();
        while(itk.hasNext()){
            String key=itk.next();
            System.out.println(key+"----"+map.get(key));            //不能连续放两个itk.next(),要不然指针会移动两格
        }
    }
}
