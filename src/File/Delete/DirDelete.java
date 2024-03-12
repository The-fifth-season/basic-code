package File.Delete;
import File.Search.DirSearch;
import java.io.File;

public class DirDelete {
    public static void main(String[] args) {
        File file = new File("D:\\Download\\CloudMusic");
        //调用方法删除文件
            delete(file);
        //调用工具类，查找文件
        DirSearch.show(file);
    }
    //自定义方法：对文件进行删除
    public static void delete(File file){                 //可以通过绝对路径进行删除，要不然不是文件夹的话就删除不了————delete (String[] path)
        if (file.isFile()){
            boolean delete = file.delete();
        }
        else if (file.isDirectory()){                       //是文件夹，则遍历然后delete(里面所有文件)
            File[] dirs = file.listFiles();
            if (dirs != null) {
                for (File f : dirs){
                    delete(f);                          //如果通过绝对路径——delete(f.getAbsolutePath());
                }
            }
        }
        boolean delete1 = file.delete();                    //然后再删除文件夹本身
    }
}