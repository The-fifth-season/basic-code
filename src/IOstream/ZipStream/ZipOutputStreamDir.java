package IOstream.ZipStream;
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//压缩文件夹
public class ZipOutputStreamDir {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\dir");
        File dest = new File("D:\\Download\\dir.zip");
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        toZip(f,zos,f.getName());
        zos.close();
    }
    public static void toZip(File f , ZipOutputStream zos,String address) throws IOException {
        File[] files = f.listFiles();
        if (files != null) {
            if (files.length == 0) {
                ZipEntry entry = new ZipEntry(address+"\\");         //如果要在压缩包表内创建空文件夹，直接创建路径，末尾+"\\"
                zos.putNextEntry(entry);
                zos.closeEntry();
            }else {
                for (File file : files){
                    if (file.isFile()){
                        ZipEntry entry = new ZipEntry(address+"\\"+file.getName());         //压缩包中的路径
                        zos.putNextEntry(entry);
                        FileInputStream fis = new FileInputStream(file);
                        int len;
                        byte[] b = new byte[1024];
                        while ((len=fis.read(b))!=-1){
                            zos.write(b,0,len);
                        }
                        fis.close();
                        zos.closeEntry();
                    }
                    else {
                        toZip(file,zos,address+"\\"+file.getName());
                    }
                }
            }
        }

    }
}
