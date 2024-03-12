package collectiondemo.map;

import java.util.Comparator;
import java.util.TreeMap;
//TreeMap————自定义对键进行排序，（默认为升序）

public class TreeMap01 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {          //传入一个比较器进行自定义排序
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;                                   //默认为o1-o2，即升序排；这里重写后为降序
            }
        });
        //简化版   TreeMap<Integer,String> tm = new TreeMap<>((o1, o2) -> o2-o1);
        tm.put(1,"一月");
        tm.put(2,"二月");
        tm.put(3,"三月");
        tm.put(4,"四月");
        tm.put(6,"六月");
        tm.put(7,"七月");
        tm.put(5,"五月");
        System.out.println(tm);
    }
}
