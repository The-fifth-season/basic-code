package collectiondemo.collection;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();
        //增
        list.add("I");
        list.add(1,"Want a wonderful");
        list.add(1,"Want a wonderful2");
        list.addLast("work");
        //迭代元素————(1)
        for (int size = list.size(), i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }
        //迭代元素————(2)
        for(String str : list){
            System.out.println(str);
        }
        System.out.println(list);
        //删
        list.remove();          //默认删第一个
        list.remove("Want a wonderful");        //删除指定元素
        System.out.println(list);
        for (int size = list.size(),i=0;i<size;i++ ){
            list.remove(0);
        }
        System.out.println(list);
    }
}
