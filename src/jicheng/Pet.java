package jicheng;
public class Pet {
    private String name;
    private String sex;
    private int love;

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

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public void show(){
        System.out.println(getName()+"\t"+getSex()+"\t"+getLove());
    }
}
