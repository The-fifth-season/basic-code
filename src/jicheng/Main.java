package jicheng;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setHealth(400);
        dog.setName("wang wang");
        dog.setLove(520);
        dog.setSex("母");
        dog.show();
        //System.out.println(dog.getName()+'\n'+dog.getHealth());
    }
}
