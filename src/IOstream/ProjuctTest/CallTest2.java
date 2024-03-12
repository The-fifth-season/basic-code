package IOstream.ProjuctTest;
import cn.hutool.core.io.file.FileReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//随机点名器————70%男、30%女,随机点名100万次，统计点到的男生和女生个数
public class CallTest2 {
    public static void main(String[] args) {
        FileReader fr = new FileReader("D:\\dir\\name.txt");
        List<String> list = fr.readLines();
        ArrayList<String> girl = new ArrayList<>();
        ArrayList<String> boy = new ArrayList<>();
        ArrayList<String> girl2 = new ArrayList<>();
        ArrayList<String> boy2 = new ArrayList<>();
        for (String name : list) {
            if (name.split("-")[1].equals("女")){
                girl.add(name);
            }else boy.add(name);
        }
        for (long i = 0; i < 10000000; i++) {
            Random r = new Random();
            if (r.nextInt(1,11)<=7){
                Random r2 = new Random();
                boy2.add(boy.get(r2.nextInt(0,boy.size())));
            }else {
                Random r2 = new Random();
                girl2.add(girl.get(r2.nextInt(0,boy.size())));
            }
        }
        System.out.println(boy2);
        System.out.println(girl2);
        System.out.println(boy2.size()+"---"+girl2.size());
    }
}
