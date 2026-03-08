package Class50_ActionsClass;

//Hover The Mouse
// Scroll Down
// double, right
// How to press keys from keyboard


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseActions {
    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.co.uk/");
        driver.manage().window().maximize();    //maximize chrome
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        //1. Hover Mouse
        Actions actions = new Actions(driver);
        WebElement homeBtn = driver.findElement(By.xpath("//span[text()=\"Home\"]"));
        actions.moveToElement(homeBtn).build().perform();    //hovering the mouse

        WebElement dinningBtn = driver.findElement(By.linkText("Dining room"));
        dinningBtn.click();

        //2. Scroll
        for (int i = 0; i < 10; i++) {
            actions.pause(Duration.ofMillis(4000)).scrollByAmount(300,300).build().perform();
        }

        //3. Double click and Right click
        actions.doubleClick().build().perform();
        actions.contextClick().build().perform();

        driver.quit();


    }

}
