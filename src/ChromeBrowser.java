import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println(title);

        System.out.println("Current Url = " + driver.getCurrentUrl());
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
