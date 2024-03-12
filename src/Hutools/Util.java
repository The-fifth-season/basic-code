package Hutools;
import cn.hutool.core.io.file.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//从网上爬取姓氏和名字，随机生成2000个名字，并写入文件中
public class Util {
    public static void main(String[] args) throws IOException {
        String familyName = "https://zhuanlan.zhihu.com/p/25056561";
        String firstName = "https://baijiahao.baidu.com/s?id=1688033594862384923";

        String familystr = webCrawler(familyName);
        String firststr = webCrawler(firstName);

        //名字集合
        ArrayList<String> firstlist = getDate1(firststr,"([\u4E00-\u9FA5]{2})(、)",1);
        System.out.println(firstlist);
        //姓氏集合
        ArrayList<String> familylist = getDate1(familystr, "([\u4E00-\u9FA5] ){7}.",0);
        System.out.println(familylist);
        //复姓集合
        ArrayList<String> familylist1 = getDate1(familystr, "([\u4E00-\u9FA5]{2} ){3}..",0);
        System.out.println(familylist1);

        //获取随机姓名
        ArrayList<String> getname1 = getname(firstlist, familylist, familylist1, 200);
        System.out.println(getname1);
        FileWriter fw = new FileWriter("D:\\dir\\name.txt");
        fw.writeLines(getname1);           //true即续写,该方法可以直接写入一个数组，非常非常非常的方便
    }
    //将姓和名的集合传入，进行随机组合，生成指定数量的名字。
    private static ArrayList<String> getname(ArrayList<String> firstlist, ArrayList<String> familylist, ArrayList<String> familylist1, int num) {
        ArrayList<String> famstr = new ArrayList<>();
        for (String s : familylist) {
            for (int i = 0; i < s.length(); i++) {
                String string = s.substring(i,i+1);
                famstr.add(string);
            }
        }
        for (String s : familylist1) {
            for (int i = 0; i < s.length(); i+=2) {
                String string = s.substring(i,i+2);
                famstr.add(string);
            }
        }
        System.out.println(famstr);
        ArrayList<String> name = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Random r = new Random();
            Random r2 = new Random();
            int i1 = r.nextInt(0, 2);
            int i2 = r2.nextInt(10, 30);
            Collections.shuffle(firstlist);                 //打乱集合中元素的顺序 ，再选取第一个，相当于随机
            Collections.shuffle(famstr);
            String sb;
            if (i1==1){
                sb = famstr.get(0) +
                        firstlist.get(0) + "-" + "男" + "-" + i2;
            }else {
                sb = famstr.get(0) +
                        firstlist.get(0) + "-" + "女" + "-" + i2;
            }
            name.add(sb);
        }
        return name;
    }
    //通过正则，查找想要的数据，存于数组中返回
    private static ArrayList<String> getDate1(String str, String regex , int i) {
        ArrayList<String> list = new ArrayList<>();
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(str);
        while(matcher.find()){
            String group = matcher.group(i);
            String replace = group.replace(" ", "");
            if (!list.contains(replace)){
                list.add(replace);
            }
        }
        return list;
    }
    //通过URL从网上爬取数据，并通过流读取数据，再拼接返回字符串
    public static String webCrawler(String net) throws IOException {
        //连接网站
        URL url = new URL(net);
        URLConnection conn = url.openConnection();
        //创建字节流，用于读取数据
        InputStream inputStream = conn.getInputStream();
        //转换为字符流，用于读取中文字符
        InputStreamReader isr = new InputStreamReader(inputStream);
        //通过StringBuilder来拼接字符，将得到的内容作为字符串返回
        StringBuilder sb = new StringBuilder();             //线程不安全，但性能更高
        //StringBuffer  sb = new StringBuffer();            线程安全，但性能较低
        int len;
        char[] ch = new char[1024];
        while ((len= isr.read(ch))!=-1){
            sb.append(ch,0,len);
        }
        isr.close();
        //System.out.println(sb.toString());
        return sb.toString();
    }
}