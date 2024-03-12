package File.Search.test;

//遍历所有文件，统计txt、jpg、doc结尾的文件的个数
public class TestSearch4 {
    public static void main(String[] args) {
        String s="D:/";
        Search search = new Search();
        search.search1(s);
        System.out.println(search.getTxt());
        System.out.println(search.getJpg());
        System.out.println(search.getDoc());
    }
}
/*public static void Search(String path, int txt){
        File file1 = new File(path);
        File[] files = file1.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    Search(file.getAbsolutePath(),txt);
                } else if (file.getName().endsWith("txt")) {
                    txt++;
                }
            }
        }
    }
*/
