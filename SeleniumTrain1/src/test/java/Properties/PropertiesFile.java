package Properties;

import java.io.*;
import java.util.Properties;

public class PropertiesFile {
    static String path = System.getProperty("user.dir");
    static Properties prop = new Properties();

    public static void main(String[] args) {
        getProperties();
        setProperties();
        getProperties();
    }

    public static void getProperties() {
        try {
            InputStream input = new FileInputStream(path + "/src/test/java/Properties/config.properties");
            prop.load(input);
            String browser_property = prop.getProperty("browser");
            System.out.println("Browser from properties" + browser_property);
        } catch (Exception e) {
            System.out.println("Exception caught" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void setProperties() {
        try {
            OutputStream output = new FileOutputStream(path + "/src/test/java/Properties/config.properties");
            prop.setProperty("browser", "firefox");
            System.out.println("New property set");
        } catch (Exception e) {
            System.out.println("Exception caught" + e.getMessage());
            e.printStackTrace();
        }
    }
}
