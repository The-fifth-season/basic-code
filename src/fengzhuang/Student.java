package fengzhuang;

//快捷键：ALT+Insert 生成；可以一键封装，构造函数
public class Student {
    String name;
    private int age;
    String sex;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
