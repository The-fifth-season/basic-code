package IOstream.ObjectStream;
import java.io.*;
//对象流  ————通过抓取异常的方式跳出循环
public class TestObj {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\dir\\student.txt"));      //对象流传入的参数类型为————流
        ObjectInputStream  ois = new ObjectInputStream(new FileInputStream("D:\\dir\\student2.txt"));
        Student s1 = new Student("张三",20,"123");
        Student s2 = new Student("张四",21,"456");
        Student s3 = new Student("张五",22,"789");
        oos.writeObject(s1);                                            //通过输出流，将对象写入指定位置;
        oos.writeObject(s2);
        oos.writeObject(s3);
        Student s;
        System.out.println(s2);
        while (true){                                           // 一直读取文件，直到发现异常，则抓取异常跳出循环；
            try {
                s = (Student) ois.readObject();
                System.out.println(s+"\t"+s.getAge()+"\t"+s.getName());
            } catch (Exception e) {                         //读取到文件结尾会报异常，抓取这个异常，然后跳出循环
                break;
            }
        }
        ois.close();                                //先关闭后开的
        oos.close();
    }
}
