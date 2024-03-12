package object.clone;

public class Student implements Cloneable{
    int age;
    String name;
    Address addr;
    //构造函数
    public Student(int age, String name, Address addr) {
        this.age = age;
        this.name = name;
        this.addr = addr;
    }
    public Student clone(){
        Student s; 
        try {
            s = (Student) super.clone();             //浅层克隆：相当于调用的Object父类中的clone方法
            s.addr = addr.clone();                  //深层克隆：调用clone时，将Student.addr中的内容也同时克隆了
                                                    //s.addr = addr.clone();  是指，将addr中的内容克隆到s.addr地址的内存中去
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e); 
        }
        return s;
    }
}
