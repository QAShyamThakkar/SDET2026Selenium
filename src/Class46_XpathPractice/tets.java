package Class46_XpathPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tets {
    static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.co.uk/sch/i.html?_nkw=painting&_sacat=0");

        Thread.sleep(2000);
//        driver.findElement(By.id("gh-ac")).sendKeys("Laptop");
//        driver.findElement(By.name("_nkw")).sendKeys("Laptop Bag");

//        driver.findElement(By.linkText("Sign in")).click(); //Text should be under <a> "test" </a>
//        driver.findElement(By.partialLinkText("Sign")).click();

//        driver.findElement(By.xpath("//input[@id=\"gh-ac\"]")).sendKeys("laptop bag");

        String txt = driver.findElement(By.xpath("//img[@class=\"s-card__image\"]")).getText();
        System.out.println(txt);

        //*[@id="vl-flyout-nav"]/ul/li[2]/a/span
        //*[@id="gh-ac"]

    }

}
