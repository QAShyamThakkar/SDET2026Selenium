package Class50_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {
    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();    //maximize chrome
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        Actions actions = new Actions(driver);

        WebElement from1 = driver.findElement(By.xpath("//a[text()=\" BANK \"]"));
        WebElement to1 = driver.findElement(By.id("bank"));

        actions.dragAndDrop(from1, to1).build().perform();

        // Try Other Options for Drag and Drop




    }
}
