package packclass.StringMethod;

import java.util.Arrays;

//将字符串中的信息，解析出来，放入数组中并输出；
public class UseStringMethod {
    public static void main(String[] args) {
        String str = "{name=WJH, age=23;name=HMQ, age=22; name=WCM, age=21; name=MYZ, age=22}";
        str = str.replace("{","").replace("}","");
        Student[] stu ={};                                     //定义一个Student类型的数组，用于储存字符串中的学生信息(Student类型）
        String[] student = str.split(";");
        for (String str1 : student) {                          //相当于从头到尾循环，str1依次=student[0]、[1]....[length]
            String[] student1 = str1.split(",");         //在","处再次分割成两个字符串，储存在字符数组student1中
            Student stu1 = new Student();                       //创建一个Student对象，用于储存在字符串中获取的name和age；
            stu1.name = student1[0].split("=")[1];              //再次分割后，直接获取新字符数组的元素
            stu1.age = Integer.parseInt(student1[1].split("=")[1]);
            stu = Arrays.copyOf(stu, stu.length + 1);
            stu[stu.length - 1] = stu1;                             //stu是Student类型的数组，储存的stu1也是Student类型的对象
        }
        System.out.println(Arrays.toString(stu));                 //要想输出想要的内容，要在Student类中重写，否则输出的是地址hashCode值

    }
}
