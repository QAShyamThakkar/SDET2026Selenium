package Class57_AlertsandIframe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertEg1 {
    static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Alert 1
        WebElement firstBtn = driver.findElement(By.xpath("//button [@onclick=\"jsAlert()\"]"));
        firstBtn.click();

        Thread.sleep(Duration.ofMillis(5000));

        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        WebElement result1 = driver.findElement(By.id("result"));
        System.out.println(result1.getText());

        //Alert 2
        WebElement secondBtn = driver.findElement(By.xpath("//button [@onclick=\"jsConfirm()\"]"));
        secondBtn.click();

        Thread.sleep(Duration.ofMillis(5000));

        Alert alert2 = driver.switchTo().alert();
//        alert2.accept();
        alert2.dismiss();

        WebElement result2 = driver.findElement(By.id("result"));
        System.out.println(result2.getText());   //ok, canceled

        //Alert 3

        WebElement thirdBtn = driver.findElement(By.xpath("//button [@onclick=\"jsPrompt()\"]"));
        thirdBtn.click();

        Thread.sleep(Duration.ofMillis(5000));

        Alert alert3 = driver.switchTo().alert();
        System.out.println(alert3.getText());   //getting the text of alert
        alert3.sendKeys("Hello");
        alert3.accept();
//        alert3.dismiss();

        WebElement result3 = driver.findElement(By.id("result"));
        System.out.println(result3.getText());


    }


}
