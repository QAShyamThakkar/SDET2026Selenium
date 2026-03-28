package Class59_EbayEG_MultipleWindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class EbayEg {
    static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.co.uk");
        driver.manage().window().maximize();    //maximize chrome
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        WebElement advanceBtn = driver.findElement(By.className("gh-search-button__advanced-link"));
        advanceBtn.click();

        WebElement dropDownCat = driver.findElement(By.id("s0-1-20-4[0]-7[3]-_sacat"));
        Select select = new Select(dropDownCat);
        select.selectByVisibleText("Art");

        WebElement searchBtn = driver.findElement(By.xpath("//button[@class=\"btn btn--primary\"]"));
        searchBtn.click();

        WebElement painting = driver.findElement(By.xpath("//span[text()=\"Paintings\"]"));
        painting.click();

        WebElement contemporaryArt = driver.findElement(By.xpath("//span[text()=\"Contemporary art \"]"));
        contemporaryArt.click();

        List<WebElement> listOfAllLinksForPainting = driver.findElements(By.xpath("//h3[@class=\"textual-display bsig__title__text\"]"));

        int count = 0;

        for (WebElement eachLink : listOfAllLinksForPainting) {

            count++;

            if (count > 2) {

                eachLink.click();

                String originalWindowID = driver.getWindowHandle();
                Set<String> listOfWindowIDs = driver.getWindowHandles();
                for (String newWindowID : listOfWindowIDs) {
                    if (!originalWindowID.equals(newWindowID)) {
                        driver.switchTo().window(newWindowID);
                    }
                }

                try {
                    WebElement sellerInfo = driver.findElement(By.xpath("//span[@class=\"ux-textspans ux-textspans--DEFAULT\"]"));
                    sellerInfo.click();

                    WebElement phoneNumber = driver.findElement(By.xpath("//div[@class=\"ux-section__item\"]/span[text()=\"Phone\"]/..//following-sibling::div/span[@class=\"ux-textspans\"]"));
                    System.out.println(phoneNumber.getText());

                }catch (Exception e){

                }
                driver.close();
                driver.switchTo().window(originalWindowID);
            }


        }

    }

}
