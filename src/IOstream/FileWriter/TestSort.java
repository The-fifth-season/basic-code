package IOstream.FileWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
/*
* 文本文件中有以下的数据:  2-1-9-4-7-8
* 将文件中的数据进行排序，变成以下的数据:  1-2-4-7-8-9
*/

public class TestSort {
    public static void main(String[] args) throws IOException {
        try (FileWriter fw = new FileWriter("D:/dir/xiugai.txt")) {
            fw.write("2-1-9-4-7-8");
        }
        try (FileReader fr = new FileReader("D:/dir/xiugai.txt")) {
            StringBuilder sb = new StringBuilder();
            int len;

            //char[] ch = new char[1024];
            while((len=fr.read())!=-1){
                System.out.println(sb.append((char)len));
            }

            //难点：通过流——将字符串转换为Integer类型，才能调用方法进行排序，，再将排好序的数字存储到数组中。
            Integer[] arr = Arrays.stream(sb.toString().split("-"))
                    .map(Integer::parseInt)
                    .sorted()
                    .toArray(Integer[]::new);
            System.out.println(Arrays.toString(arr));

            //再将数组转换回字符串类型（才能后面的写入）
            String s = Arrays.toString(arr);

            //            修改字符串
            String s2 = s.replace(", ", "-");
            FileWriter fw2 = new FileWriter("D:/dir/xiugai2.txt");
            fw2.write(s2,1,s2.length()-2);
            fw2.close();
        }

    }
}
