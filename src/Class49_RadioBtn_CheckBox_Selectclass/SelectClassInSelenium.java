package Class49_RadioBtn_CheckBox_Selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectClassInSelenium {

    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.manage().window().maximize();    //maximize chrome
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        WebElement dropDown1 = driver.findElement(By.id("dropdowm-menu-1"));
//        WebElement dropDown1 = driver.findElement(By.xpath("//select[@id=\"dropdowm-menu-1\"]/option[text()='Python']"));
//        dropDown1.click();
        Select select1 = new Select(dropDown1);
        select1.selectByIndex(2);

        WebElement dropDown2 = driver.findElement(By.id("dropdowm-menu-2"));
        Select select2 = new Select(dropDown2);
        select2.selectByValue("maven");

        WebElement dropDown3 = driver.findElement(By.id("dropdowm-menu-3"));
        Select select3 = new Select(dropDown3);
        select3.selectByVisibleText("JQuery");

        System.out.println(select1.getFirstSelectedOption().getText());
        System.out.println(select2.getFirstSelectedOption().getText());
        System.out.println(select3.getFirstSelectedOption().getText());



    }
}
