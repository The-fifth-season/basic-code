package properties;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) {
        Properties pro = new Properties();
        InputStream is = TestProperties.class.getClassLoader().getResourceAsStream("abd.properties");
        try {
            pro.load(is);
            System.out.println(pro.getProperty("username"));
            System.out.println(pro.getProperty("password"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}