package nop_commerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowsingTest {
    static String browser = "Chrome";
    static String baseURL = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chorme")) {
            System.out.println("WebDriver.Chrome.driver");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            System.out.println("WebDriver.FireFox.Driver");
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            System.out.println("WebDriver.Edge.Driver");
            driver = new EdgeDriver();

        } else {
            System.out.println("Not valid browser");
        }
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //or

        //Get Current Url
        System.out.println("The current Url : " + driver.getCurrentUrl());

        //Find Login link element and click on it.
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();

        //Find Email field Element ant Type the Email
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Ram99@gmail.com");

        //Find Password field Element ant Type the Email
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("Ram123");

        //Closing browser
        driver.quit();
    }
}
