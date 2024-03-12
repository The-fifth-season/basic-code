package interclass.jicheng;

//import duotai.Dog;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        Student.Dog dog1 = new Student.Dog();       //new内部类 的格式
        //继承了duotai.Dog类，可以直接调用父类的方法
        dog1.setName("gougou1");                //setName实际上是duotai.Dog的父类的方法
        dog1.eat();                             //执行子类重写的eat（）方法，如果没有重写，则为父类的方法
        System.out.println(dog1.getName());

        duotai.Dog dog = new duotai.Dog();      //声明一个父类
        dog.setName("gougou2");
        dog.eat();

        new Student.Penguin().swim();               //只调用方法的话，可以直接这么new



    }
}
