package File.Search;
import java.io.File;
//查找文件是否存在，遍历文件夹————通过File类型遍历
public class DirSearch {
    //构造函数，传入需要查找的文件夹
    File dir;
    public DirSearch(File dir) {
        this.dir = dir;
    }
    //创建方法进行递归查找，传入需要查找的文件夹
    public static void show(File dir){
        if (!dir.exists()){
            System.out.println("文件不存在");
        }
        if(dir.isFile()){
            System.out.println(dir.getName());
        }
        else if (dir.isDirectory()){
            File[] files = dir.listFiles();
            if (files != null) {
                for (File f : files){
                    if (f.isDirectory()){
                        System.out.println(f.getName());
                        show(f);
                    }
                    else System.out.println(f.getName());
                }
            }
        }
    }
}