package Stream;
//获取Stream流
import java.util.ArrayList;
import java.util.Collections;

//单列集合————list

public class GetStream1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,56,7,8,9,12,34,456,789);

        //list.stream().forEach(a-> System.out.println(a));               //a是自定义的一个变量名，代表list流中的每一个数据
        list.forEach(System.out::println);
    }
}
