package object.clone;

public class TestClone {
    public static void main(String[] args) {
        Student stu = new Student(20,"WJH",new Address("dongbei"));
        Student stu1 = stu.clone();
        stu.name = "HMQ";
        stu.addr.add = "guangzhou";
        System.out.println(stu1.age+"\n"+stu1.name+"\n"+stu1.addr.add+"\n"+stu1.addr);

        /*浅层克隆：
        只克隆了stu1中的addr的信息(地址),并没有克隆addr中的内容;
        要想进一步的克隆addr中的内容,即stu1.addr.add;
        需要在Address中再声明（重写）一个clone，在stu1的addr中克隆stu中的addr内容；

        深层克隆：
        1、在Address中用同样的方式重写了clone（）；
        2、在所引用（Student）类的clone方法中，写入操作stu.addr = addr.clone()；——————>（addr的克隆操作）
        3、在调用时clone（）时直接执行addr的克隆操作；
         */
    }
}
