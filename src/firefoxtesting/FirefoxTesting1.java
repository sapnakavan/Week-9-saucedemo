package firefoxtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTesting1 {
    public static void main(String[] args) {
      FirefoxTesting1 f = new FirefoxTesting1();
      f.m1();
    }

    public void m1(){
       String baseURL = "https://www.saucedemo.com/";//STORING BASEURL
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();//CREATING OBJECT OF FIREFOX
        driver.get(baseURL);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
