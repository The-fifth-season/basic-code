package File;
import java.io.File;
import java.io.IOException;
//文件的一些常用方法

public class TestFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/dir/aaa");                 //这里仅仅是定义了一个文件对象，并没有进行任何操作
        System.out.println(file);                                     //将定义的文件对象路径进行输出，与文件创不创建、存不存在无关

        boolean newFile = file.createNewFile();                       //创建文件——————返回的是布尔值，判断是否创建成功————也可以不用返回值
        System.out.println(file.exists());                            //检测文件是否存在
        System.out.println(file.delete());                            //删除文件——————如果需要删除的文件不存在，不会报错————文件路径错误时才会报错
        System.out.println(file.getAbsolutePath());                   //获取文件的完整路径
        System.out.println(file.length()/1024/1024);                  //获取文件大小：单位为字节byte，/1024/1024则转化为单位 M

        String name = file.getName();
        System.out.println(name.substring(name.lastIndexOf(".")+1));       //获取文件夹后缀——————lastIndexOf————获取字符串中最后一个出现指定字符的位置
        System.out.println(name);                                       //获取文件名

        System.out.println(file.getParentFile());                       //获取上一级文件
        System.out.println(file.exists());                              //判断文件是否存在
        System.out.println(file.isFile());                              //判断对象是否是文件
        System.out.println(file.isDirectory());                         //判断对象是否是文件夹；


    }
}