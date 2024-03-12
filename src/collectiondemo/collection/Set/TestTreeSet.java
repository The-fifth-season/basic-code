package collectiondemo.collection.Set;

import java.util.TreeSet;
//TreeSet会自动进行排序————叉树的概念
//Set中的元素不会重复
public class TestTreeSet {
    public static void main(String[] args) {
        //自定义排序--要求类必须实现comparable接口，重写compareTo的方法，在这个方法里面去定义排序的规则
        TreeSet<Student> stu = new TreeSet<>();

        stu.add(new Student("YJL",23));
        stu.add(new Student("YJL",25));
        stu.add(new Student("YJL",23));
        stu.add(new Student("YJL",21));

        //要对toString进行重写，否则输出的是地址
        System.out.println(stu);
    }
}
