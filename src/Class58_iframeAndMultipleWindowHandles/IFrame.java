package Class58_iframeAndMultipleWindowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IFrame {
    static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_iframe.asp");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       //Switching to iFrame
        WebElement iframe = driver.findElement(By.xpath("//iframe[@title=\"W3Schools HTML Tutorial\"]"));
        driver.switchTo().frame(iframe); //switching to iFrame

        WebElement iframeJava = driver.findElement(By.xpath("//div[@id=\"menubtn_container\"]/following-sibling::a[@title=\"Java Tutorial\"]"));
        iframeJava.click();

        Thread.sleep(Duration.ofSeconds(7));

        driver.switchTo().defaultContent();  //coming back from iFrame

        WebElement javaBtnonMainPg = driver.findElement(By.xpath("//div[@id=\"menubtn_container\"]/following-sibling::a[@title=\"Java Tutorial\"]"));
        javaBtnonMainPg.click();

    }

}
