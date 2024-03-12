package FunctionDemo;

public class FilterTool {
    public boolean filter1(String s){
        String s1 = s.split("-")[1];
        return "崩".equals(s1);
    }
}
