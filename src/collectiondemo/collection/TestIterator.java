package collectiondemo.collection;
//删除集合中的元素，可以使用迭代器
import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(8);
        list.add(2);
        list.add(23);
        list.add(13);

        //Collection的一些方法
        Collections.sort(list);         //排序
        Collections.reverse(list);      //反转
        Collections.shuffle(list);      //洗牌：随机打乱顺序

        //迭代器：
        Iterator<Integer> it = list.iterator();           //iterator是Collection的父类方法，而ArrayList是collection的子类，所以重写过了，可以直接用
        while(it.hasNext()) {                             //如果下一个还有元素，则继续循环
            int i = it.next();                            //获取下一个元素         注意：如果一个循环中写了两个it.next则指针移动两位，可能会出现错误
            if(i < 10) {                                  //                           如果要用两个it.next()，可以令int it1=it.next(),然后输出两次it1
                it.remove();  // 删除小于 10 的元素
            }
        }
        System.out.println(list);

        //集合——>数组:
        Object[] array = list.toArray();

        //数组——>集合:
        List<Object> list1 = Arrays.asList(array);
        System.out.println(list1);
    }
}
