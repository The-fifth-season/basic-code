package collectiondemo.CollectionOf;
//不可变集合：一旦创建完，在之后的代码中无法修改，只能被查询
/*
        注意：map.of的方法最多可以存10个键值对
        可以使用Map.copyof来转换为不可变集合；
 */
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class MapOf {
    public static void main(String[] args) {
        Map<String,String> map = Map.of("a","b","b3","b4","b5","b6","b7","b8","b9","b10","b11","b12","b13","b14");
//for的加强循环
        for (String key : map.keySet()) {
            System.out.println(key+"-----"+map.get(key));
        }
        System.out.println("=================================="+"\n");
//通过遍历键值对，输出
        Set<Map.Entry<String, String>> entries = map.entrySet();            //entries是所有键值对的集合
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"===="+entry.getValue());
        }
        System.out.println("=================================="+"\n");
//通过迭代器输出
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()){
            String key = it.next();
            System.out.println(key+"----"+map.get(key));
        }
    }
}
