package Ascii;
//打印ASCII表
public class PrintAscii {
    public static void main(String[] args) {
        System.out.println("ASCII表：");
        System.out.println("字符\t整数值");
        for (int i=32;i<127;i++){
            char ch = (char)i;
            System.out.println(ch+"\t"+i);
        }
    }
}