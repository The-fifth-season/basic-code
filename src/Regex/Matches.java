package Regex;
import java.util.regex.*;

public class Matches {
    public static void main(String[] args) {
        String content = "I am noob from run.com.";
        String pattern = ".*run.*";                           //.表示其它字符，*表示｛0，｝，.*表示0~n个其它字符
        //判断是否包含子串————方法一
        boolean isMatch = Pattern.matches(pattern,content );                    //正则表达式放前面
        System.out.println("字符串中是否包含了 'run' 子字符串? " + isMatch);
        //判断是否包含子串————方法二
        System.out.println(content.matches(pattern));                   //括号里面放正则表达式

    }
}
