package packclass.StringMethod;

public class Student {
    String name ;
    int age ;

    @Override
    public String toString() {                      //对toString的方法进行了重写，使输出内容不再是hashCode的值
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
