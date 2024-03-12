package interclass.addoperater;

//利用内部类进行一个封装

public class Add {
    //相当于一个封装的思想，内部类的内容私有后，调不到了
    private static class AddOp{
        public int add(int a,int b){
            return a+b;
        }
    }
        //在本类的方法中可以调用内部类，相当于一个接口
        public int add(int a, int b){
            return new AddOp().add(a,b);
        }
}
