package singleton;
//单例模式——懒汉式
//最开始，对象是null，直到有第一个人调用我，才new—个对象，之后所有调用我的都用这个对象——————程序中只能有一个对象
public class Single {
    private Single(){}                              //函数重构，使私有化，无法new新对象
    private static Single single = null;
    public static Single getInstance(){             //提供一个公有的方法，在方法中创建对象，并返回Single类型
        if (single==null){
            single = new Single();
        }
        return single;
    }
}
