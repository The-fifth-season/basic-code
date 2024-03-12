package interclass;

public class Outer {
    int num = 1;
    //局部内部类：
    public  class Inter1{
        int num = 2;
        public void interMethod(){
            int num = 3;
            //成员变量冲突时:    ——————（如果不冲突，直接输入变量名即可）
            System.out.println(num);                  //输出=3
            System.out.println(this.num);             //输出=2
            System.out.println(Outer.this.num++);     //输出=1

            class Inter2{
                //int num = 4;
                public void method(){
                    System.out.println(Inter1.this.num);        //内部类中使用的局部变量会变成常量————原因：变量的生命周期不一样
                }
            }
            num++;
            new Inter2().method();                          //局部内部类只能在本类的方法中使用；
        }
        //new Inter2().method();                    在这使用是错误的
    }
}
