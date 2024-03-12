package File.Search.test;

import java.io.File;

public class Search {
    int txt = 0;
    int doc = 0;
    int jpg = 0;

    public void search1(String path){
        File file1 = new File(path);
        File[] files = file1.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    search1(file.getAbsolutePath());
                } else if (file.getName().endsWith("txt")) {
                    this.txt++;
                }else if (file.getName().endsWith("doc")) {
                    this.doc++;
                }else if (file.getName().endsWith("jpg")) {
                    this.jpg++;                                 //通过this修改值；
                }
            }
        }
    }
    public int getTxt() {
        return txt;
    }

    public int getDoc() {
        return doc;
    }

    public int getJpg() {
        return jpg;
    }
}
