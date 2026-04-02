package Class61_63_TBSPAProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class ArizonaStateData {

    static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://portal.tsbpa.texas.gov/php/fpl/frmlookup.php");
        driver.manage().window().maximize();    //maximize chrome
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        for (int i = 0; i < 25; i++) {

            WebElement state = driver.findElement(By.id("frmstate"));
            Select select = new Select(state);
            select.selectByVisibleText("Arizona");

            WebElement submitBtn = driver.findElement(By.name("submit"));
            submitBtn.click();

            Thread.sleep(Duration.ofSeconds(5));
            List<WebElement> listOFRows = driver.findElements(By.xpath("//table[@id=\"results\"]/tbody/tr"));
//            System.out.println(listOFRows.size());
            listOFRows.get(i).click();

            List<WebElement> listOFData = driver.findElements(By.xpath("//table[@align=\"center\"]/tbody/tr/td[@colspan=\"2\"]"));
            for (WebElement data : listOFData) {
                System.out.print(data.getText() + " | ");
            }

            System.out.println();

            WebElement backtoSelection = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
            backtoSelection.click();
        }
    }

}
