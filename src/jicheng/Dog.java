package jicheng;

public class Dog extends Pet{               //继承的概念，Pet是父类，用extends来继承
        private int health;
        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }
        public void show(){
            super.show();                       //调用时优先子类的方法，要调用父类的话，要用super关键字
            System.out.println(getHealth()+"\n");
        }
}


//继承的优点：提高了代码的复用性、可扩展性
//继承就是从父级一级级的往下产生子集