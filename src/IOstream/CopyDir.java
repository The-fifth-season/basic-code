package IOstream;

import java.io.*;

//拷贝文件夹————遇到文件夹，则在目标路径下创建新文件夹，然后遍历文件，拷贝的文件
public class CopyDir {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\CloudMusic");
        File file1 = new File("D:\\Download");
        copydir(file, file1);
    }
    public static void copydir(File fc, File fv) throws IOException {
        File dir1 = new File(fv, fc.getName());              //在fv文件的路径下，创建一个fc.getName()文件名的文件
        if (fc.isDirectory()) {                              //如果是文件夹————在目标路径下，创建一个文件夹
            boolean mkdirs = dir1.mkdirs();
            File[] files = fc.listFiles();
            if (files != null) {
                for (File file : files) {                   //然后遍历所需要复制的文件夹中的文件，挨个拷贝
                    copydir(file, dir1);
                }
            }
        } else {
            try (FileInputStream fis = new FileInputStream(fc)) {
                try (FileOutputStream fos = new FileOutputStream(dir1)) {
                    int len;
                    byte[] b = new byte[1024 * 1024 * 5];
                    while ((len = fis.read(b)) != -1) {
                        fos.write(b, 0, len);
                    }
                }
            }
        }
    }
}