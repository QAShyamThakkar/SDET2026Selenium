package Class60_JSExecutore_CaptureSS_FileUploadDow;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JSExecutor {

    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.co.uk");
        driver.manage().window().maximize();    //maximize chrome
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));


        WebElement input = driver.findElement(By.id("gh-ac"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].style.border='3px solid yellow'", input); //To highlight the element

//        js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); //To go down to Bottom of the page
//
//        js.executeScript("document.body.style.zoom = \"50%\";"); //To zoom out/zoom in


        WebElement declineCookies = driver.findElement(By.id("gdpr-banner-decline"));
        declineCookies.click();


    }

}
