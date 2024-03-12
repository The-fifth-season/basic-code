package collectiondemo.collection;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList <String>list = new ArrayList<>();
        System.out.println(list);
        //增
        list.add("WJH1");
        list.add("WJH2");
        list.add(2,"WJH3");
        System.out.println(list.size());
        //删
        list.remove(0);
        System.out.println(list.size());
        System.out.println(list);
        //改
        list.set(0,"WJH4");
        //查
        for (String s : list) {
            System.out.println(s);
        }
        for (int a=0 ; a<list.size();){             //每删一个，list.size()会-1
            list.remove(0);
        }

        System.out.println(list);

    }
}
