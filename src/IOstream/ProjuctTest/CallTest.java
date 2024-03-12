package IOstream.ProjuctTest;
import cn.hutool.core.io.file.FileReader;
import java.util.List;
import java.util.Random;

//随机点名器————只点名
public class CallTest {
    public static void main(String[] args) {
        FileReader fr = new FileReader("D:\\dir\\name.txt");
        List<String> list = fr.readLines();
        Random r = new Random();
        int i = r.nextInt(0, list.size());
        String string = list.get(i).split("-")[0];
        System.out.println(string);
    }
}
