package singleton;
//单例模式——饿汉式————类生成时就已经创建好了对象
public class Singleton {
    //构造方法私有化，这样就不能通过new来创建对象
    private Singleton(){}
    //私有类型的类变量————因为采用的是静态类型，所以创建的时候只能创建单个实例对象
    private static Singleton single = new Singleton();
    //共有类型的类变量，通过这个去创建对象；
    public static Singleton getInstance(){
        return single;
    }

    /*
    使用时：
        Singleton s = Singleton.getInstance();
     */
}
