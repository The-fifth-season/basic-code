package Regex;

import java.util.regex.*;

public class StartAndEnd {
    public static void main(String[] args) {
         String reg = "\\bcat\\b";
         String input = "cat cat dog cat catdog cat";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(input);
        int count = 0;

        while(m.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start: "+m.start());          //从哪一个字符开始
            System.out.println("end: "+m.end());              //从哪一个字符结束
        }
    }
}
