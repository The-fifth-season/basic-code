package collectiondemo.collection.Set;

public class Student implements Comparable<Student>{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //不重写的话，输出的值为地址
    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
         //当前对象 与 比较对象 对比， 大、相等、小，分别return 正数、0、负数
        //如果只判断return this.age-o.age;，则如果age相等，则对比为同一对象，会直接把第二个丢掉
        if (this.age!=o.age){
            return this.age-o.age;
        }
        return this.hashCode()-o.hashCode();

    }
}
