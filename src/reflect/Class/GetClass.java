package reflect.Class;
/*获取类class对象
* 1、Class.forName("全类名")————最常用
* 2、类名.class———— 一般是当作参数进行传递
* 3、对象.getClass()———— 需要先new对象
* */


import reflect.Student;

public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        //1、Class.forName("全类名")————最常用
        Class<?> aClass = Class.forName("reflect.Student");

        //2、类名.class
        //一般是当作参数进行传递
        Class<Student> studentClass = Student.class;

        //3、对象.getClass()
        Student stu = new Student(15);
        Class<? extends Student> aClass1 = stu.getClass();

        /*  获取类注解：
        Annotation annotation = aClass1.getDeclaredAnnotation(注解名.class);

        判断注解存不存在：
        aClass1.isAnnotationPresent(注解名.class);
        */

    }
}
