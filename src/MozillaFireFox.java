import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MozillaFireFox {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver-v0.30.0-win64/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        String title = driver.getTitle();
        System.out.println(title);

        System.out.println("Current URL = " + driver.getCurrentUrl());
        String loginUrl = "https://courses.ultimateqa.com/users/sign_in";
        driver.navigate().to(loginUrl);
        System.out.println("Current URL = " + driver.getCurrentUrl());

        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("arrow123@gmail.com");

        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("y2k01007");
        driver.close();
    }
}
