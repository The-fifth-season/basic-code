package collectiondemo.collection.Set;

//LinkedHashSet是有序的，按照你输入的顺序进行输出
//原理：用一个额外的单链表进行了存储，输出的时候，按单链表的顺序进行了输出
import java.util.LinkedHashSet;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> age = new LinkedHashSet<>();
        age.add(54);
        age.add(51);
        age.add(52);
        age.add(66);
        age.add(16);
        age.add(26);
        System.out.println(age);
    }
}
