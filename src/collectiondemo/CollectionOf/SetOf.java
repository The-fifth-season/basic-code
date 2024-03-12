package collectiondemo.CollectionOf;
//不可变集合：一旦创建完，在之后的代码中无法修改，只能被查询
/*
        list.of()直接用，没什么好注意的

        Set.of中不可以放入重复的元素
        无序
 */
import java.util.Set;
public class SetOf {
    public static void main(String[] args) {
        Set<String> set = Set.of("a","b","b3","b4","b5","b6","b7","b8","b9","b10","b11","b12","b13","b14");
        System.out.println(set);
    }
}
