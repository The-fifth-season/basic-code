package Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//stream.filter  筛选
//stream.forEach  遍历
public class MyStream1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1月","323月","345月","4567月","56789月","6789月","789月","389月","9月");

        //用stream流进行筛选,并进行输出
        //list.stream().filter(name->name.length()==4).filter(name->name.startsWith("3")).forEach(name-> System.out.println(name));

        //获得筛选后的迭代器
        Iterator<String> it = list.stream().filter(name -> name.length() == 4).filter(name -> name.startsWith("3")).iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
