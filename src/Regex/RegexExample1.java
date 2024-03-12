package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//写一个邮箱的正则表达式
public class RegexExample1 {
    public static void main(String[] args) {
        String reg = "^\\w+@\\w+(\\.[a-z]{2,4}){1,2}$";             //.前面要转义，要不然表示任意字符
        String email = "2986749648@qq.com.cn";
        System.out.println(email.matches(reg));                     //括号里面是正则表达式

        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);                        //获取正则表达式

        // 现在创建 matcher 对象——————用里面的方法，来检测字符串与正则表达是否匹配
        Matcher m = r.matcher(line);                                //Pattern.matcher(pattern,line);    r是Pattern类型，所以可以用matcher方法
        if (m.find( )) {                                            //判断是否符合正则表达式，符合为true 不符合为false
            System.out.println("Found value: " + m.group());        //输出所有的符合条件的部分
            System.out.println("Found value: " + m.group(1) );      //符合第一个括号判断的部分
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }
    }
}
