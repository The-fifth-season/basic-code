package File.Search;
import java.io.File;
//遍历所有文件————通过绝对路径遍历
public class TestSearch3 {
    public static void main(String[] args) {
        String s="D:/";
        search(s);
    }
    public static void search(String path){
        File file1 = new File(path);
        File[] files = file1.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()){
                    search(file.getAbsolutePath());
                }else if(file.getName().endsWith("t"))
                {
                    System.out.println(file.getName()+"--"+file.getAbsolutePath());
                }
            }

        }
    }
}