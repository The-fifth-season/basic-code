package IOstream.ProjuctTest;
import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;

import java.io.File;
import java.util.List;
import java.util.Random;

//随机点名器————第三次运行必定是张三————通过日志的方式
public class CallTest3 {
    public static void main(String[] args) {
        FileReader fr = new FileReader("D:\\dir\\name.txt");
        List<String> list = fr.readLines();
        File file = new File("D:\\dir\\nametime.txt");
        if (file.exists()){
            FileReader fr2 = new FileReader(file);
            String time = fr2.readString();
            int time1 = Integer.parseInt(time);
            time1++;
            FileWriter fw = new FileWriter("D:\\dir\\nametime.txt");
            fw.write(time1+"");                 //将写入的数据转换为字符串
            if (time1>=3){
                System.out.println("张三");
                getdata();
            }else {
                Random r = new Random();
                int i = r.nextInt(0, list.size());
                String string = list.get(i).split("-")[0];
                System.out.println(string);
            }
        }else getdata();
    }
    //调用方法将数据重新归0；
    private static void getdata() {
        FileWriter fw = new FileWriter("D:\\dir\\nametime.txt");
        fw.write("0");
    }
}

