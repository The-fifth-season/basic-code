package Stream;
import java.util.ArrayList;
import java.util.stream.Stream;

/*stream流的中间方法————limit(n) 只遍历n个元素
                       skip(n)  跳过n个元素
                       distinct()  去重————底层代码为HashSet
                       concat()拼接
*/
public class Midstream2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();                 ArrayList<String> list2 = new ArrayList<>();
        list.add("1月");        list.add("323月");        list.add("345月");        list.add("4567月");        list.add("56789月");
        list.add("6789月");        list.add("789月");        list2.add("389月");        list2.add("9月");       list.add("1月");    list.add("323月");
        list.forEach(System.out::println);
        System.out.println("-----------");
        //limit————遍历多少个元素
        list.stream().limit(3).forEach(System.out::println);        System.out.println("-----------");
        //skip————跳过前几个元素
        list.stream().skip(3).forEach(System.out::println);                 System.out.println("-----------");
        //limit和skip
        list.stream().skip(3).limit(4).forEach(System.out::println);            //跳过前3个元素后，再遍历4个元素
        System.out.println("-----------");
        //distinct————去重
        list.stream().distinct().forEach(System.out::println);                              //流里面的操作，不会改变  原集合中的数据
        //concat  流进行拼接
        Stream.concat(list.stream(),list2.stream()).forEach(System.out::println);               //将两个流进行拼接
    }
}
