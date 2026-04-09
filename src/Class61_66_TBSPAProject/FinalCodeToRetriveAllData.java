package Class61_66_TBSPAProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class FinalCodeToRetriveAllData {

    static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://portal.tsbpa.texas.gov/php/fpl/frmlookup.php");
        driver.manage().window().maximize();    //maximize chrome
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        int i = 0;
        List<WebElement> listOFRows = List.of();
        int countOfListOfRow = 0, countOFState = -1;

        String listOfStates[] = {"Alabama", "Alaska", "Arizona", "Arkansas", "ARMED FORCES, AMERICAS (AA)", "ARMED FORCES, EUROPE (AE)", "ARMED FORCES, PACIFIC (AP)", "California", "Colorado", "Connecticut", "Delaware", "District of Columbia", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Puerto Rico", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virgin Islands", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};

        do {
            //WebPage1
//            System.out.println(countOfListOfRow);
//            System.out.println(listOFRows.size());

            if (countOfListOfRow>=listOFRows.size()) {
                countOFState++;
                countOfListOfRow=0;
                WebElement state = driver.findElement(By.id("frmstate"));
                Select select = new Select(state);
                select.selectByVisibleText(listOfStates[countOFState]);  //Changing the State 0 to 1 to 2
            }else {
                WebElement state = driver.findElement(By.id("frmstate"));
                Select select = new Select(state);
                select.selectByVisibleText(listOfStates[countOFState]);
            }

            WebElement submitBtn = driver.findElement(By.name("submit"));
            submitBtn.click();

            //WebPage 2
            Thread.sleep(Duration.ofSeconds(5));
            listOFRows = driver.findElements(By.xpath("//table[@id=\"results\"]/tbody/tr"));
            listOFRows.get(countOfListOfRow).click();  //Changing the Row

            //WebPage 3
            List<WebElement> listOFData = driver.findElements(By.xpath("//table[@align=\"center\"]/tbody/tr/td[@colspan=\"2\"]"));
            for (WebElement data : listOFData) {
                System.out.print(listOfStates[countOFState] +" | "+ data.getText() + " | ");
            }

            System.out.println();


            WebElement backtoSelection = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
            backtoSelection.click();
            countOfListOfRow++;


        } while (true);
    }
}


