package collectiondemo.collection.generic;

import java.util.ArrayList;
import java.util.List;

//类型通配符一般是使用 ? 代替具体的类型参数。
// 例如 List<?> 在逻辑上是 List<String>,List<Integer> 等所有 List<具体类型实参> 的父类。
public class GenericTest {
    public static void main(String[] args) {
        List<Integer> age = new ArrayList<>();
        List<String> name = new ArrayList<>();
        List<Number> number = new ArrayList<>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);

        //getUperNumber(name);      会报错
        getUperNumber(age);
        getUperNumber(number);
    }
    public static void getData(List<?> data){               //类型通配符
        System.out.println("data : "+ data.get(0));         //data也是List类型，可以直接使用get方法
    }
    // 因为 getData() 方法的参数是 List<?> 类型的，
    // 所以 name，age，number 都可以作为这个方法的实参，这就是通配符的作用。
    public static void getUperNumber(List<? extends Number> data) {     //限定了参数泛型上限为Number
        System.out.println("data :" + data.get(0));
    }
    //类型通配符下限通过形如 List<? super Number> 来定义，
    // 表示类型只能接受 Number 及其上层父类类型，如 Object 类型的实例。
    //<? extends T>表示该通配符所代表的类型是T类型的子类。
    //<? super T>表示该通配符所代表的类型是T类型的父类。
}
