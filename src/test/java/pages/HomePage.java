package pages;

import driver.driverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage
{
    driverSetup driversetup = new driverSetup();
    WebDriver driver= driversetup.chromedriver() ;

    private WebElement hotstarLogo()
    {

        return driver.findElement(By.xpath("//*[@class=\"nav-logo\"]//img"));
    }

    public void waitForHomePageToLoad()
    {
        /////driver;
    }
}
