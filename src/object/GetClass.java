package object;
import duotai.Dog;
//Object类中的内部方法：getClass()，可以获得类名的相关信息
public class GetClass {
    public static void main(String[] args) {
        //Object obj = new Object();
        Dog dog = new Dog();
        System.out.println(dog.getClass());  
        System.out.println(dog.getClass().getName());
        System.out.println(dog.getClass().getSimpleName());
    }
}
