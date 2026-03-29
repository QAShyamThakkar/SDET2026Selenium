package Class60_JSExecutore_CaptureSS_FileUploadDow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUpload {
    static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();    //maximize chrome
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        WebElement fileUploadBtn = driver.findElement(By.id("file-upload"));
        fileUploadBtn.sendKeys("C:\\Users\\shyam\\Downloads\\Wedding Final\\Test\\GP_06383.JPG");

        Thread.sleep(Duration.ofSeconds(3));

        WebElement submit = driver.findElement(By.id("file-submit"));
        submit.click();


    }

}
