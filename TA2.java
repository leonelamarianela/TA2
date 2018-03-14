package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Leonela on 3/12/2018.
 */
public class TA2 {
    public static void main(String arg []){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Leonela/Desktop/Selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://darksky.net");

        driver.findElement(By.xpath("//*[@id='week']/a[1]/span[2]")).click();
        WebElement mintemp = driver.findElement(By.xpath("//*[@id=\"week\"]/a[1]/span[2]/span[1]"));
        String lowest = mintemp.getText();

        WebElement mintemp1 = driver.findElement(By.xpath("//*[@id=\"week\"]/div[2]/div[1]/div[2]/div[1]/span[1]/span[1]"));
        String lowest1 = mintemp1.getText();

        WebElement maxtemp = driver.findElement(By.xpath("//*[@id=\"week\"]/a[1]/span[2]/span[3]"));
        String highest = maxtemp.getText();


        WebElement maxtemp1 = driver.findElement(By.xpath("//*[@id=\"week\"]/div[2]/div[1]/div[2]/div[1]/span[3]/span[1]"));
        String highest1 = maxtemp1.getText();

        boolean low = lowest.equals(lowest1);
        boolean high = highest.equals(highest1);

        if (low == true && high ==true){
            System.out.println("The weather is accurate the min temperature for today is  " + lowest + " and highest " + highest);
        }else {
            System.out.println("Please update your webpage ");
        }

        driver.quit();
    }
}
