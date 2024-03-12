package static1;

public class Main {
    public static void main(String[] args) {
        StaticClass a;
        a = new StaticClass();
        a.age = 20 ;
        StaticClass.name = "YJL";
        StaticClass.isEmpty(StaticClass.name);
        System.out.println(StaticClass.isEmpty(StaticClass.name));   //会先执行一遍代码，然后返回值
    }
}
