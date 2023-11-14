package nop_commerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        //Launch the Edge browser
        WebDriver driver = new EdgeDriver();

        //Open the URL into browser
        driver.get(baseUrl);

        //Maximize browser
        driver.manage().window().maximize();

        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page.
        String title = driver.getTitle();
        System.out.println(title);

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
