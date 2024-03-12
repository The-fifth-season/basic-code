package reflect.Constructor;
import reflect.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
public class TestConstructor {
    public static void main(String[] args) throws Exception {
        //获取类对象
        Class<?> aClass = Class.forName("reflect.Student");

        //无视权限获取所有的构造方法
        Constructor<?>[] cons = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : cons) {
            int count = constructor.getParameterCount();            //获取参数的个数
            System.out.println(constructor+"----"+count);
        }

        //获取指定的单个构造方法
        Constructor<?> con = aClass.getDeclaredConstructor(String.class,int.class,String.class);   //形参顺序不能错！！！
        System.out.println(con);

        //获取构造方法对象后，能实现的功能：
        //1、获取构造方法访问权限————以数字的形式返回
        int modifiers = con.getModifiers();
        System.out.println(modifiers);

        //2、获取参数的个数
        int count = con.getParameterCount();
        System.out.println(count);

        //3、获取构造方法所有的参数
        Parameter[] parameters = con.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        //重点——暴力反射：4、临时取消权限校验————取消后，才可以无视权限创建对象，要不然私有的不能创建
        con.setAccessible(true);

        //5、通过反射创建对象
        Student stu = (Student) con.newInstance("张三", 20, "男");
        System.out.println(stu);

    }
}
