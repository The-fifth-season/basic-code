package collectiondemo.collection.generic;
//泛型类的类型参数声明部分也包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，
//是用于指定一个泛型类型名称的标识符。因为他们接受一个或多个参数，这些类被称为参数化的类或参数化的类型。
public class GenericClass<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        GenericClass<Integer> integerBox = new GenericClass<>();
        GenericClass<String> stringBox = new GenericClass<>();
        integerBox.add(10);
        stringBox.add("菜鸟教程");
        System.out.println("整型值为:"+ integerBox.get()+"\n");
        System.out.println("字符串为 :"+ stringBox.get());
    }
}