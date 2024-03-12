package File;
import java.io.File;
//文件夹的常用方法：（文件中的方法对文件夹同样适用）

public class TestDir {
    public static void main(String[] args) {
        File dir = new File("d:/dir/aaa/bbb");
        File dir1 = new File("d:/dir/aaa");
        boolean mkdirs = dir.mkdirs();                  //创建文件夹，mkdirs可以一次创建多个；  mkdir只能创建一个子文件夹

        String[] dirs1 = dir1.list();                    //用字符串数组储存指定路径下的所有文件名称；
        if (dirs1 != null) {
            for (String d : dirs1){
                System.out.println(d.toUpperCase());        //可以调用字符串的方法
            }
        }
        //遍历文件，输出其文件名；
        File[] dirs = dir1.listFiles();                  //用File数组储存指定路径下的所有文件；——————可以直接调用文件的方法
        if (dirs != null) {
            for (File d : dirs){
                System.out.println(d.getName());                      //可以直接调用文件的方法；
            }
        }
        System.out.println(dir.delete());          //只能删除空文件夹，要不然会删除失败——————可以调用递归的方法进行删除和查找文件

    }




}
