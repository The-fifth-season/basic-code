package packclass.StringMethod;

public class TestStringMethod {
    public static void main(String[] args) {
        String str = "abc;abc";
        String str1 = "abb";
        System.out.println(str.charAt(2));                                   //获取字符串第几位的字符
        System.out.println(str.hashCode());                                  //获取hash值
        System.out.println(str.length());                                    //获取字符串长度
        str = str.concat("def");                                         //在字符串末尾拼接
        System.out.println(str);
        str=str.replace("a","bc");                         //字符替换，replace成""，可起到删除效果
        System.out.println(str);
        System.out.println(str.contains("def"));                             //判断字符串是否包含某些字符
        System.out.println(str.endsWith("cdef"));                            //判断字符串的结尾
        System.out.println(str.indexOf("bc",3));               //判断字符串：字符是否存在，并输出(第3次)出现的位置（下标），不输入——>则查的是第一次出现位置的下标
        System.out.println(str.lastIndexOf("bc"));                       //判断字符串：字符是否存在，并输出最后一次出现的位置（下标）
        System.out.println(str.toUpperCase());                               //将字符转换为大写
        System.out.println(str.split(";")[1]);                         //分割成多个字符数组，这里输出的是新数组arr[1]。
        System.out.println(str.compareTo(str1));                             //比较数值大小，前面>后面=1;前面<后面=-1;字符串完全相等=0
    }
}
