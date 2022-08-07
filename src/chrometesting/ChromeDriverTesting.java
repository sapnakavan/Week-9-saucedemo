package chrometesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTesting {
    public static void main(String[] args) {
        ChromeDriverTesting c =new ChromeDriverTesting();
        c.m();
    }

    public void m(){

        String baseURL ="https://www.saucedemo.com/";//storing baseurl
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");//setting webdriver
        WebDriver driver = new ChromeDriver();//creating object of chrome driver
        driver.get(baseURL);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }



    }

