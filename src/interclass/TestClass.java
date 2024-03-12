package interclass;
import interclass.Outer.Inter1;                   // 导入了Inter类才可以在下面直接定义：Inter inter = ...
public class TestClass {
    public static void main(String[] args) {

        //内部类的声明：
        Outer out = new Outer();                    //声明外部类
        Inter1 inter = out.new Inter1();           //不导入包的话，需要带上外部类来声明
        //Inter inter = out.new Inter();            导包————内部类的声明

        //静态内部类的声明方式：
        //外部类得和静态类绑定
        //Outer.Inter inter = new Outer.Inter();


        inter.interMethod();
        inter.interMethod();
    }
}
