package Class48_Ebay_XpathFunctionsAndRelations;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class EbayEg {
    static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.co.uk");
        driver.manage().window().maximize();    //maximize chrome
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        WebElement advanceBtn = driver.findElement(By.className("gh-search-button__advanced-link"));
        advanceBtn.click();
        Thread.sleep(5000);

        WebElement searchBtn = driver.findElement(By.xpath("//button[@class=\"btn btn--primary\"]"));
        searchBtn.click();

        WebElement painting = driver.findElement(By.xpath("//span[text()=\"Paintings\"]"));
        painting.click();

        WebElement wallArt = driver.findElement(By.xpath("//span[text()=\"Wall art\"]"));
        wallArt.click();

        WebElement firstProductLink = driver.findElement(By.xpath("//h3[text()='Canvas Print Personalised Wall Art 12x16\" A3 Your Pictures Photo Framed on 18mm']"));
        firstProductLink.click();

//        String originalWindowID = driver.getWindowHandle();
//        Set<String> listOfWindowIDs = driver.getWindowHandles();
//        for (String newWindowID : listOfWindowIDs) {
//            if (!originalWindowID.equals(newWindowID)) {
//                driver.switchTo().window(newWindowID);
//            }
//        }

        WebElement sellerInfo = driver.findElement(By.xpath("//span[@class=\"ux-textspans ux-textspans--DEFAULT\"]"));
        sellerInfo.click();

        WebElement phoneNumber = driver.findElement(By.xpath("//div[@class=\"ux-section__item\"]/span[text()=\"Phone\"]/..//following-sibling::div/span[@class=\"ux-textspans\"]"));
        System.out.println(phoneNumber.getText());

    }

}
