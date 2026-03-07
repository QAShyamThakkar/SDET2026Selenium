package Class49_RadioBtn_CheckBox_Selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckBox {

    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.manage().window().maximize();    //maximize chrome
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        //Checkbox
        WebElement op1 = driver.findElement(By.xpath("//input[@value=\"option-1\"]"));
        op1.click();

        WebElement op2 = driver.findElement(By.xpath("//input[@value=\"option-2\"]"));

        //input[@value="option-2"]
        op2.click();

        WebElement op3 = driver.findElement(By.xpath("//input[@value=\"option-3\"]"));
        if (op3.isSelected()) {
            op3.click();
        }
    }
}
