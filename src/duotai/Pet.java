package duotai;

public abstract class Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(getName()+"吃东西");
    }
}
