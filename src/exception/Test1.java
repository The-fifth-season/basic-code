package exception;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            try {
                System.out.println("输入3~10字姓名：");
                String name = input.nextLine();
                String s = Setname(name);
                System.out.println(s);
                break;
            } catch (RuntimeException e) {
                System.out.println("名字输入有误");
            }
        }
    }
    public static String Setname(String name1) {
            if (name1.length()<=10&&name1.length()>=3){
               return name1;
            }else throw new RuntimeException();
    }
}
