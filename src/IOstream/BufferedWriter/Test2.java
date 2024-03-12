package IOstream.BufferedWriter;
import java.io.*;
//恢复文章的顺序————根据句子编号，重新输出文章顺序；
public class Test2 {
    public static void main(String[] args) throws IOException {
        int i=1;
        while (true) {
            //输入输出流，要放在循环内，反复创建，要不然读取完一次数据后，之后读取的就为空；
            //放在循环内，则每次创建后，重新读取文件
            BufferedReader br = new BufferedReader(new FileReader("D:/dir/abc.txt"));
            BufferedWriter wr = new BufferedWriter(new FileWriter("D:/dir/abc2.txt",true));
            String s ;
            while((s= br.readLine())!=null){                    //循环遍历文本句子
                String s2 = s.substring(0, 1);
                if (Integer.parseInt(s2)==i){                   //如果句子第一个数字，与i相同，则写入
                    wr.write(s);
                    wr.newLine();
                    System.out.println(s);
                }
            }                                                   //这里循环完了一遍文本，找出了开头为i的句子写入了
            i++;                                                    //然后i再+1，再次进行写入i开头的句子；
            wr.close();
            br.close();
            if (i>9) break;
        }
    }
}
