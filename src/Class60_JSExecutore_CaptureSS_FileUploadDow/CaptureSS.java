package Class60_JSExecutore_CaptureSS_FileUploadDow;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CaptureSS {
    static void main(String[] args) throws InterruptedException, IOException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/datepicker/");
        driver.manage().window().maximize();    //maximize chrome
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        WebElement iFrame = driver.findElement(By.xpath("//div[@class=\"attention closable\"]/a[@class=\"close_img\"]/../following-sibling::p/iframe[@class=\"demo-frame\"]"));
        driver.switchTo().frame(iFrame);

        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("06/06/2024");

        Thread.sleep(Duration.ofSeconds(3));

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File screenshotAsFile = screenshot.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(screenshotAsFile, new File("C:\\Users\\shyam\\Downloads\\Wedding Final\\Test\\SS.png") );


    }

}
