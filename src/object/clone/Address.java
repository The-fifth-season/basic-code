package object.clone;

public class Address implements Cloneable{              //Cloneable是一个标记接口，接入该接口才可以重写和运用clone
    String add;

    public Address(String add) {
        this.add = add;
    }
    public Address clone(){                        //重写clone，因为Object中的clone不公开，所以不能用，重写成公开的再用
        Address s;
        try {
            s = (Address) super.clone();            //调用父类（Object）的clone并强制转换，使最后可以返回；
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return s;
    }
    /*
    Address s = super.clone();
    return s;
    就这样写，然后用idea改错就能改成上面的样子
     */
}
