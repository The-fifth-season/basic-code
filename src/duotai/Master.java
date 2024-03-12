package duotai;
//多态的第二种应用 ：使用父类作为方法返回值实现多态，使方法可以返回不同子类对象。
public class Master {
    public static void main(String[] args) {
        Master m = new Master();
        Pet pet = m.getPet("penguin");
        pet.setName("企鹅");
        pet.eat();
        m.play(pet);
    }
    public Pet getPet(String type){                 //返回值Pet为父类类型，指向的为子类类型
        if (type.equals("dog")){
            return new Dog();                       //返回子类类型(Dog)到父类中去，实现多态
        }
        else return new penguin();
    }
    //向下转型：强制转换后在父类中调用子类的方法
    public void play(Pet pet){
        if (pet instanceof Dog){                     //判断pet是不是Dog型
            Dog dog = (Dog) pet;                     //强制转型，将pet强制转换为子类的dog型，从而引用子类中的方法
            dog.catchDick();
        }else {
            penguin p = (penguin) pet;
            p.swim();
        }
    }
}
