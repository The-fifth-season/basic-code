package static1;

public class StaticClass {
    static String name;
    int age;
    public static boolean isEmpty(String name){
        boolean flag;
        if ( name==null || name.isEmpty())  {       //name==null必须放前面（不过为什么呢？）
            System.out.println("是空字符串");
            return flag=false;
        } else {
            System.out.println("不是空字符串");
            return flag=true;
        }

    }
}

