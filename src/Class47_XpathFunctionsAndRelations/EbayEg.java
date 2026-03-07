package Class47_XpathFunctionsAndRelations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class EbayEg {
    static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.co.uk");
        driver.manage().window().maximize();    //maximize chrome
        driver.findElement(By.className("gh-search-button__advanced-link")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class=\"btn btn--primary\"]")).click();
        driver.findElement(By.xpath("//span[text()=\"Paintings\"]")).click();
        driver.findElement(By.xpath("//span[text()=\"Wall art\"]")).click();
        driver.findElement(By.xpath("//img[@alt=\"The Strokes Music Album Poster / A5 A4 A3 Unframed The Full Collection - Image 1 of 4\"]")).click();

        String originalWindowID = driver.getWindowHandle();
        Set<String> listOfWindowIDs = driver.getWindowHandles();
        for (String newWindowID : listOfWindowIDs) {
            if (!originalWindowID.equals(newWindowID)) {
                driver.switchTo().window(newWindowID);
            }
        }

        driver.findElement(By.xpath("//span[@class=\"ux-textspans ux-textspans--DEFAULT\"]")).click();



    }





}
