package pl.codreslab.seleniumcoursonlteaw29;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FindByXpathTest {

    @Test
    public void findElementsByXpath()  {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement singInButton = driver.findElement(By.className("hide_xs"));
        singInButton.click();
        WebElement emailInput = driver.findElement(By.className("account_input"));
        emailInput.sendKeys("tes11t@test.pl");
        WebElement createAccountButton = driver.findElement(By.name("SubmitCreate"));
        createAccountButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement firstNameInput = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        firstNameInput.sendKeys("Sinior");
        WebElement lastNameInput = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        lastNameInput.sendKeys("Siarra");
        WebElement emailRegistrationInput = driver.findElement(By.xpath("//input[@id='email']"));
        emailRegistrationInput.clear();
        emailRegistrationInput.sendKeys("siaaarra@siarzewski.pl");
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='passwd']"));
        passwordInput.sendKeys("kiler");
        WebElement registerButton = driver.findElement(By.xpath("//button[@id='submitAccount']"));
        registerButton.click();

    }
}