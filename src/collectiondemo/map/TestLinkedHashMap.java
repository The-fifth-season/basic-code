package collectiondemo.map;
import java.util.LinkedHashMap;
import java.util.function.BiConsumer;

//有序、不重复、无索引；；键相同的话，则覆盖（Set相同则不添加）
public class TestLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,String>  lhm = new LinkedHashMap<>();
        lhm.put("张3","123");
        lhm.put("张4","1234");
        lhm.put("张5","12345");
        lhm.put("张6","123456");
        //用lambda方法遍历map
        lhm.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String k, String v) {
                System.out.println(k+"=="+v);
            }
        });

        //简化为：
        lhm.forEach((k, v) -> System.out.println(k+"=="+v));
    }
}
