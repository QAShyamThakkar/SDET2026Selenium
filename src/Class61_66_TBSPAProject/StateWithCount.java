package Class61_66_TBSPAProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class StateWithCount {

    static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://portal.tsbpa.texas.gov/php/fpl/frmlookup.php");
        driver.manage().window().maximize();    //maximize chrome
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        String listOfStates[] = {"Alabama", "Alaska", "Arizona", "Arkansas", "ARMED FORCES, AMERICAS (AA)", "ARMED FORCES, EUROPE (AE)", "ARMED FORCES, PACIFIC (AP)", "California", "Colorado", "Connecticut", "Delaware", "District of Columbia", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Puerto Rico", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virgin Islands", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};

        List<WebElement> listOFRows;

        for (int i = 0; i < listOfStates.length; i++) {
            try {
                WebElement state = driver.findElement(By.id("frmstate"));
                Select select = new Select(state);
                select.selectByVisibleText(listOfStates[i]);

                WebElement submitBtn = driver.findElement(By.name("submit"));
                submitBtn.click();

                Thread.sleep(Duration.ofSeconds(5));
                listOFRows = driver.findElements(By.xpath("//table[@id=\"results\"]/tbody/tr"));
                System.out.println(listOfStates[i] + " :" + listOFRows.size());

                WebElement backToSelection = driver.findElement(By.name("bsubmit"));
                backToSelection.click();

            } catch (Exception e) {

            }

        }

//        List<WebElement> listOFStates = select.getOptions();
//        select.getFirstSelectedOption();
//
//        for (WebElement eachState : listOFStates) {
//            System.out.println(eachState.getText());
//        }

    }

}

// Arizona - 16 firms
// Alaska - 1
//
