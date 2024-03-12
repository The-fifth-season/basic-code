package interclass.jicheng;
//import duotai.*;
public class Student {
    public static class Dog extends duotai.Dog {
        public void eat() {                               //在子类中没有重写父类的方法的话，调用的就直接是父类方法；
            System.out.println("狗狗吃骨头");               //重写了则调用的是子类的方法
            //super.eat();                                //在子类中调用父类的方法
        }
    }
    public static class Penguin extends duotai.penguin {
        }
}
