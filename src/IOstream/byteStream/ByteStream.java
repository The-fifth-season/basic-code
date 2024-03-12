package IOstream.byteStream;
import java.io.FileInputStream;
//通过字节流————读取数据
public class ByteStream {
    public static void main(String[] args) throws Exception {
//      int data;
        FileInputStream is = new FileInputStream("D:\\dir\\aaa.txt");       //创建字节读取的类， 括号里可以是文件类型，也可以是路径（String[]类型）

        try (is) {
            //一次读取多个字节                                                      //data：返回的是读取到的数值；  length：返回的是读取到的字节长度；读到的数值储存到了buf数组中
            byte[] buf = new byte[1024*8];                                           //一次读取1024*8个字节，即一次8k地读————经验：8k既不会浪费空间，效率也不错
            int length;
            while ((length=is.read(buf))!=-1){                                  //is.read(buf)方法————从输入流is中读取数据，将数据填充到buf数组中。若直接读到结尾，则返回-1
                                                                                    // 返回值length————从字节流中读取的字节个数
                System.out.println(new String(buf,0,length));                    //String方法————提取指定范围的字节数据，并将其转换成一个字符串对象。
                System.out.println(length);
            }
            System.out.println(length);
        }
    }
}
//            //字节流：一次只能读一个字节,每读一次，自动读下一个字节
//            while((data=is.read())!=-1){                //读完后，返回的字节为-1      is.read()方法读取的值，必须返回给data，才能输出data，
//                System.out.print((char)data);
//            }
//            //读完后，接着读的话，后面的返回值都为-1
//            System.out.println(is.read());
//            System.out.println(is.read());j