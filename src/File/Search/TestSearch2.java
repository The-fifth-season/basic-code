package File.Search;
import java.io.File;

//通过创建方法，对文件夹进行递归查找

public class TestSearch2 {
    public static void main(String[] args) {
        File dir = new File("D:/");
            DirSearch.show(dir);

    }

}



