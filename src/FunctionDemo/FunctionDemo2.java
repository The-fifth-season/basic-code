package FunctionDemo;
import java.util.*;
import static java.lang.Integer.parseInt;

//方法引用：   引用静态方法、引用其它类中的方法
/*
    其他类:其他类对象::方法名
    本类: this : :方法名                 注意：本类和父类中，引用不能是静态方法
    父类: super::方法名
 */
public class FunctionDemo2 {
    public static void main(String[] args) {
        String[] str = {"1","2","3","4"};
        //直接在map方法体里面，调用Integer中的parseInt方法         将字符转换为Integer类型
        Arrays.stream(str).map(Integer::parseInt).forEach(System.out::println);

        //引用其它类中的方法：
        TreeSet<String> list = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o2.split("-")[2])-Integer.parseInt(o1.split("-")[2]);
            }
        });
        Collections.addAll(list,"三月-崩-1","镜流-崩-2","希儿-崩-3",
                "托帕-崩-4","姬子-崩-5","青雀-崩-6","符玄-崩-7","芙芙-原-1","胡桃-原-2","优菈-原-3");

        //通过方法引用过滤 崩 的角色     Java的JDK中没有能直接使用的方法，因此需要自己写
        list.stream().filter(new FilterTool()::filter1).forEach(System.out::println);           //new 方法类，然后::引用方法

        TreeSet<String> list2 = new TreeSet<>((o1,o2)-> parseInt(o2.split("-")[2]) - parseInt(o1.split("-")[2]));
    }
}
