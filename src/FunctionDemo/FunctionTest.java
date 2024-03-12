package FunctionDemo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*
        技巧:
        1.现在有没有一个方法符合我当前的需求
        2.如果有这样的方法，这个方法是否满足引用的规则
        静态         类名：:方法名
        成员方法      1、类名::方法名（方法在stream中的数据类型中）           (抽象方法中第二个参数与引用方法的参数同即可)
                     2、对象名::方法名（在其它类中）
                     3、super::方法名     this::方法名
        构造方法      类名:: new
*/

public class FunctionTest {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"蔡坤坤,24","叶小咸,23","刘不甜,22","吴签,24","谷嘉,30","肖梁梁,27");

        Student[] array = list1.stream().map(Student::new).toArray(Student[]::new);          //map已经将流中的数据类型转换为了Student类型，因此直接调用new构造方法就行

        System.out.println(Arrays.toString(array));

        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("蔡坤坤",24));
        list2.add(new Student("叶小咸",23));
        list2.add(new Student("刘不甜",22));

        list2.stream().map(Student::getName).forEach(System.out::println);
    }
}
