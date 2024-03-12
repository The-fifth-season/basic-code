package collectiondemo.map;
import java.util.HashMap;
//统计一个字符串中，每个字符出现的次数
public class TestMapPractice {
    public static void main(String[] args) {
        String str = "ahfuashiwohjxzknjkjwehifdsxzklwirjgnzvlsidogewskgdjdae";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0;i<str.length();i++){
            Character ch = str.charAt(i);                           //将每个字符设为Key，将Key的值value设为出现的次数

            //如果不是第一次记录：
            if(map.containsKey(ch)){
                Integer count = map.get(ch);                        //获取原本的值
                map.put(ch,++count);                                //再该值上+1；
            }

            //如果是第一次输入—————记录该值，次数设为1
            else map.put(ch,1);
        }
        System.out.println(map);                                    //输出
        //遍历
        for (char ch : map.keySet()){
            System.out.println(ch+"---"+map.get(ch));
        }
    }
}
