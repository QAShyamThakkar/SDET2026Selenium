package Class58_iframeAndMultipleWindowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class MultipleWindowHandle {

    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/in/?ir=1");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement startFreeTrial = driver.findElement(By.xpath("//p[@class=\"notification__text\"]"));
        startFreeTrial.click();

        String originalWindowID = driver.getWindowHandle();
        Set<String> listOfWindowIDs = driver.getWindowHandles();
        for (String newWindowID : listOfWindowIDs) {
            if (!originalWindowID.equals(newWindowID)) {
                driver.switchTo().window(newWindowID);
                break; // For one time - whenever switching windows, always break the loop after switching.
            }
        }

        WebElement firstName = driver.findElement(By.xpath("//input[contains(@id, 'UserFirstName')]"));
        firstName.sendKeys("Shyam");


    }
}
