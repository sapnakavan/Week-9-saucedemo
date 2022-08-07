package edgetesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverTesting {
    public static void main(String[] args) {
        EdgeDriverTesting e = new EdgeDriverTesting();
        e.m();
    }
    public void m(){
        String baseURL = "https://www.saucedemo.com/";//storing baseURL
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();//CREATING OBJECT FOR EDGE DRIVER
        driver.get(baseURL);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
