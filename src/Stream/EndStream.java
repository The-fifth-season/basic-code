package Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
/*
        void  forEach       遍历
        long  count         统计stream中的元素个数
        toArray             收集流中的数据，存于数组中
        collect             收集流中的数据，存于集合中
 */

public class EndStream {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        Collections.addAll(list,"1月","323月","345月","4567月","56789月","6789月","789月","389月","9月");
        //forEach
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //count  统计流中的元素个数
        long count = list.stream().count();
        System.out.println(count);
    }
}
