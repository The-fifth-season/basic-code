package create.object;

import create.object.Student;

//整个就是对象的创立
public class CreateObject {
    public static void main(String[] args) {
        Student s = new Student("name",24,120);      //构造方法的调用
        s.setName();                                              //方法的调用
        s.setName("name2",321);
        System.out.println(s.name+"\t"+s.score+"\t"+s.age);
        Student s1 = new Student("name3",100,200,"男");
        System.out.println(s1.name+"\t"+s1.score+"\t"+s1.age+"\t"+s1.sex);
    }
}