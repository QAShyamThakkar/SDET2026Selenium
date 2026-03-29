package Class60_JSExecutore_CaptureSS_FileUploadDow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DatePicker {
    static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/datepicker/");
        driver.manage().window().maximize();    //maximize chrome
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        WebElement iFrame = driver.findElement(By.xpath("//div[@class=\"attention closable\"]/a[@class=\"close_img\"]/../following-sibling::p/iframe[@class=\"demo-frame\"]"));
        driver.switchTo().frame(iFrame);

        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("06/06/2024");

        Thread.sleep(Duration.ofSeconds(3));



    }

}
