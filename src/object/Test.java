package object;

public class Test {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(23,7,15);
        MyDate myDate2 = new MyDate(23,7,16);
        //重写了hashCode、equals，比较的是类的属性，不重写则比较的是地址
        System.out.println(myDate2.hashCode());
        System.out.println(myDate1.hashCode());
        System.out.println(myDate1.equals(myDate2));
        //重写了toString，输出的是属性，否则为地址
        System.out.println(myDate1.toString());
        System.out.println(myDate2);             //默认输出为toString，所以上一行的.toString是多余的

        myDate2 = myDate1;                          //将myDate1的地址赋给了myDate2
        myDate2.setYear(24);                        //修改myDate2地址中的值；
        System.out.println(myDate2);
        System.out.println(myDate1);                //myDate1的值同样会发生变化
        System.out.println(myDate1.hashCode());
        System.out.println(myDate2.hashCode());     //地址一样，所以两个hashCode值一样
        int a=1,b=2;
        b=a;
        b=6;
        System.out.println(a);                      //常量的赋值直接从堆空间中引用，不用开辟新的内存空间，不存在上述情况
    }
}
