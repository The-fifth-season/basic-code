package packclass;

public class TestRuntime {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();              //饿汉式的单例模式，通过调用函数来创建对象，只能创建一个对象
        System.out.println(rt.availableProcessors());       //可用的处理器个数
        System.out.println(rt.freeMemory());       //空闲内存--暂时没有用的空间
        System.out.println(rt.maxMemory());         //最大内存----从操作系统最多能拿到的空间
        System.out.println(rt.totalMemory());       //总内存----目前已经从操作系统获取到的空间
    }
}
