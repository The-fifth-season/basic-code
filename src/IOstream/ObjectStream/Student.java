package IOstream.ObjectStream;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {              //标志接口，实现这个接口才可以序列化
    @Serial
    private static final long serialVersionUID = 9082652375715668608L;          //版本号,有版本号后才可以更改类中的属性，否则反序列化就会报错
    private String name;
    private int age;
    private transient String address;           //transient 无法写入、无法输出，都为null
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
