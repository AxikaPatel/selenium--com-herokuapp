package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultipleBrowser_Herokuapp
{
    static  String browser = "FireFox";
    static WebDriver driver;

    public static void main(String[] args)
    {
        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("FireFox"))
        {
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();
        }
        else
        {
            System.out.println("Wronge Browser");
        }

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
        driver.findElement(By.id("username")).sendKeys("123@gmail.com");

        //Find password field element
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("A123@");

        //Close Browser
        driver.close();
    }
}
