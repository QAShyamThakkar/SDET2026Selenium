package Class43;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAmazonEg2 {
    static void main(String[] args) throws InterruptedException {

        // Open Amazon

        WebDriver driver = new ChromeDriver();  //getting driver
        driver.manage().window().maximize();   //Maximize chrome
        driver.get("https://www.amazon.in/");  //get the URL

        Thread.sleep(3000);  //wait for 3 seconds

        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Chanel Bag");

        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();


//        driver.close();  // it will close the current tab
//        driver.quit();   // it will close all the tabs


        //WebDriver → Interface
        //ChromeDriver() → Implementation



    }

}
