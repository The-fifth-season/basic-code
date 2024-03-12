package File.Delete;
import java.io.File;
//递归删除————删除文件夹或文件
public class DeleteTest {
    public static void main(String[] args) {
        String path = "D:\\Download\\CloudMusic";
        File file = new File(path);
        if (file.isDirectory()){
            delete(path);                                                     //将文件夹中所有文件删除后
            System.out.println(file.delete());                                //再调用方法对 文件夹本身 进行删除,并返回删除的结果
        }
        else System.out.println(file.delete());
    }
    //删除文件夹中的所有文件————不包括文件夹本身————也可以删除文件
    public static void delete(String path){
        File file = new File(path);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File file1 : files) {
                    delete(file1.getAbsolutePath());
                    boolean delete = file1.delete();
                }
            }
        }else {
            boolean delete = file.delete();
        }
    }
}