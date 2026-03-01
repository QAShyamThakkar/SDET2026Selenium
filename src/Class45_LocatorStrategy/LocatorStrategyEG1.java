package Class45_LocatorStrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategyEG1 {
    static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.co.uk/");

        Thread.sleep(2000);
//        driver.findElement(By.id("gh-ac")).sendKeys("Laptop");
//        driver.findElement(By.name("_nkw")).sendKeys("Laptop Bag");

//        driver.findElement(By.linkText("Sign in")).click(); //Text should be under <a> "test" </a>
//        driver.findElement(By.partialLinkText("Sign")).click();

//        driver.findElement(By.xpath("//input[@id=\"gh-ac\"]")).sendKeys("laptop bag");

          driver.findElement(By.xpath("//li[@data-currenttabindex=\"1\"]/a/span")).click();


        //*[@id="vl-flyout-nav"]/ul/li[2]/a/span
        //*[@id="gh-ac"]

    }

}
