package Class50_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;
import java.time.Duration;

public class KeyBoardKeys {
    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.co.uk/");
        driver.manage().window().maximize();    //maximize chrome
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        Actions actions = new Actions(driver);

        WebElement signIN = driver.findElement(By.linkText("Sign in"));
//        signIN.click();
        actions.keyDown(Keys.CONTROL).click(signIN).keyUp(Keys.CONTROL).build().perform();


    }
}
