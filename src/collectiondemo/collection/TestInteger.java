package collectiondemo.collection;

import java.util.LinkedList;

public class TestInteger {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.remove(1);         //删除的是下标为1的值
        list.remove((Integer)3);        //强转成Integer类型的3，删除的是元素3
        System.out.println(list);
    }
}
