package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser_Herokuapp
{
    public static void main(String[] args)
    {
        //Launch the chrome browser
        WebDriver driver = new ChromeDriver();

        //Open the URL into Browser
        driver.get("http://the-internet.herokuapp.com/login");

        //Maximize the browser
        driver.manage().window().maximize();

        //Give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of page
        System.out.println("Title of the page \t\t : " + driver.getTitle());

        //Get the Current page
        System.out.println("Current page \t\t : " + driver.getCurrentUrl());

        //Get the Page Source
        System.out.println("Page Source \t\t : " + driver.getPageSource());

        //Find email field element
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("123@gmail.com");

        //Find password field element
        driver.findElement(By.id("password")).sendKeys("A123@");

        //Close Browser
        driver.close();
    }
}
