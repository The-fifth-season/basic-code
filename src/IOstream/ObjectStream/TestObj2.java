package IOstream.ObjectStream;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

//对象流  ————通过数组的方式读取对象  （更优）
public class TestObj2 {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\dir\\student2.txt"));
        Student s1 = new Student("张三",21,"北京");
        Student s2 = new Student("张四",22,"上海");
        Student s3 = new Student("张五",23,"广州");
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list,s1,s2,s3);                              //将对象存于数组中，然后遍历写入
        list.forEach(student -> {
            try {
                oos.writeObject(student);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        ObjectInputStream  ois = new ObjectInputStream(new FileInputStream("D:\\dir\\student2.txt"));
        //System.out.println(ois.readObject());               //一次只读一个对象
        for (int i = 0; i < list.size(); i++) {         //遍历数组进行读取
            System.out.println(ois.readObject());
        }
        ois.close();                                //先关闭后开的
        oos.close();
    }
}
