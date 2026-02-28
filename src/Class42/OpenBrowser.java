package Class42;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    static void main(String[] args) {
        System.out.println("hello");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");


        //WebDriver → Interface
        //ChromeDriver() → Implementation



    }

}
