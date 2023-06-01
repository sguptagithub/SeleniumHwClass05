package class05Hw;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utlis.CommonMethods.driver;

public class Hw01 {
    /*
    http://practice.syntaxtechs.net/javascript-alert-box-demo.php
click on the last alert
send keys and accept it
Note: don't worry if the text u send doesn't appear up in the text box
     */
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url,browser);

        WebElement alert3Btn=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3Btn.click();
        Thread.sleep(2000);

        Alert alert1=driver.switchTo().alert();
        alert1.sendKeys("Sandy");
        alert1.accept();
        Thread.sleep(2000);


    }

    private static void openBrowserAndLaunchApp(String url, String browser) {
    }


}
