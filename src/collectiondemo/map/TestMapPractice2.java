package collectiondemo.map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
//用一个集合：记录电话和电话信息；
public class TestMapPractice2 {
    public static void main(String[] args) {
        HashMap<String, List<String>> records = new HashMap<>();          //用一个List集合来储存需要记录的信息
        Scanner input = new Scanner(System.in);
        while(true) {                                   //死循环，触发循环条件才退出循环
            System.out.println("输入电话号码:");
            String ele = input.nextLine();
            System.out.println("输入需要记录的信息：");
            String r = input.nextLine();
            //如果不是第一次输出————获取Key的值，直接add添加新信息
            if (records.containsKey(ele)) {
                records.get(ele).add(r);                       //在Key处新添加信息
            }
            //如果是第一次输出————要new ArrayList用来储存输入的信息r,并添加信息到Map集合中;
            else {
                List<String> rs = new ArrayList<>();           //第一次输出需要创建new ArrayList
                rs.add(r);                                     //将信息r存入List中
                records.put(ele, rs);
            }
            System.out.println("是否再次输入？（y/n）");
            if (input.nextLine().charAt(0) == 'n'){
                break;
            }
        }
        System.out.println(records);
    }
}
