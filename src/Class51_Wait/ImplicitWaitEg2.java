package Class51_Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitEg2 {
    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement example2 = driver.findElement(By.partialLinkText("Example 2"));
        example2.click();

        WebElement startBtn = driver.findElement(By.xpath("//button[text()=\"Start\"]"));
        startBtn.click();

//        Thread.sleep(10000); - Static wait - Dont want to use

        WebElement textOnWebsite = driver.findElement(By.xpath("//div[@id=\"finish\"]/h4"));
        System.out.println(textOnWebsite.getText());




    }

}
