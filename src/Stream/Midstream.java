package Stream;
import java.util.ArrayList;
import java.util.function.Predicate;
//stream流的中间方法————filter过滤
public class Midstream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1月");
        list.add("323月");
        list.add("345月");
        list.add("4567月");
        list.add("56789月");
        list.add("6789月");
        list.add("789月");
        list.add("389月");
        list.add("9月");
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //过滤：返回值为true，则表示当前值留下
                //否则当前数值舍弃不要
                return s.startsWith("3")&&s.length()==4;
            }
        }).forEach(System.out::println);
        //简化后:
        list.stream().filter(s -> s.startsWith("3")&&s.length()==4).forEach(System.out::println);
    }
}
