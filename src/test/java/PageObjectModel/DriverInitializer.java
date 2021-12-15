package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;

public class DriverInitializer {

//    private static Properties properties = null;
//    static {
//        try {
//            properties = new Properties();
//            properties.load(DriverInitializer.class.getClassLoader()
//                    .getResourceAsStream("application.properties"));
//            System.setProperty("webdriver.chrome.driver", properties.getProperty("chrome.path"));
//           // System.setProperty("webdriver.gecko.driver", properties.getProperty("gecko.path"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//      org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 97
    public static WebDriver getDriver() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver");
         String url="https://testwise.testingforschools.com/tests/player-demo-iseb";
                driver = new ChromeDriver();
                driver.get(url);
                driver.navigate().to(url);
            System.out.println("URL  :"+url);
        return driver;
    }


//    public static String getProperty(String key) {
//
//        return properties == null ? null : properties.getProperty(key, "");
//    }
}
