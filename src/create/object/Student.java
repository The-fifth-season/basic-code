package create.object;

public class Student {
    String name;//="name200";
    int age;
    double score;
    String sex;

    //方法重构：
    public void setName(){
        System.out.println("学生的名字为：name1");
        System.out.println(this.name);   //this.name 指向Student s 中的 s ，输出的是类里面定义的值，而不是函数中的，也就是输出name200；
    }
    public void setName(String m,int b){
        name = m;
        age = b;
    }
    //构造方法:                      定义了构造方法后，直接Student s = new create.object.Student();会报错，必须在括号中加上参数；
    //1、无返回值，名称与类名完全相同
    //2、创建对象时，触发构造方法的调用（用new调用），不可通过句点手动调用。
    public Student(String name,int age,int score){
        this.name = name;
        this.age = age;
        this.score = score;
        //System.out.println(name+"\t"+age+"\t"+score);
    }
    public Student(String n,int a,int sc,String sex){
        this(n,a,sc);                        //this的第二种用法；必须放在第一行；相当于执行了一次上面的方法
        this.sex=sex;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
