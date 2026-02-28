package Class43;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleEg1 {
    static void main(String[] args) {
        System.out.println("hello");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");


        //WebDriver → Interface
        //ChromeDriver() → Implementation



    }

}
