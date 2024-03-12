package IOstream.ReadAndWrite;
import java.io.*;

public class Write {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("D:\\dir\\write\\test.txt");
        boolean mkdirs = new File("D:\\dir\\write").mkdirs();           //先创建文件夹
        boolean newFile = file.createNewFile();                                   //再在该文件夹创建文件
        String str = "abcdefgh国家";

        try (FileOutputStream os = new FileOutputStream("D:\\dir\\write\\test.txt")) {
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(str);
            oos.writeObject("123456");
        }
        int length;
        FileInputStream is = new FileInputStream("D:\\dir\\write\\test.txt");
        ObjectInputStream ois = new ObjectInputStream(is);
        byte[] bytes = new byte[1024*8];
        System.out.println(ois.readObject());
        while ((length = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,length));
        }
    }
}
