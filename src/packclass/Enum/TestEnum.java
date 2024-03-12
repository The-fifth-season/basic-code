package packclass.Enum;
//枚举跟普通类一样可以用自己的变量、方法和构造函数，构造函数只能使用 private 访问修饰符，所以外部无法调用。
//枚举既可以包含具体方法，也可以包含抽象方法。 如果枚举类具有抽象方法，则枚举类的每个实例都必须实现它
enum Color{
    RED, GREEN, BLUE;
    // 构造函数
    private Color()                 //枚举的构造函数——————只能是私有属性          （重构————这是抽象方法）
    {
        System.out.println("Constructor called for : " + this.toString());
    }
    public void colorInfo() {
        System.out.println("Universal Color");
    }
}
public class TestEnum{
    public static void main(String[] args){
        Color c1 = Color.GREEN;                 //每个枚举实例都需要实现抽象方法
        System.out.println(c1);
        c1.colorInfo();                         //具体方法得手动引用
    }
}
