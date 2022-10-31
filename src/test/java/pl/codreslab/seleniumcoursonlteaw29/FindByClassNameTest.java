package pl.codreslab.seleniumcoursonlteaw29;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByClassNameTest {

    @Test
    public void findElementsByName() {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement singInButton = driver.findElement(By.className("hide_xs"));
        singInButton.click();
        WebElement emailInput = driver.findElement(By.className("account_input"));
        emailInput.sendKeys("tes11t@test.pl");
        WebElement createAccountButton = driver.findElement(By.name("SubmitCreate"));
        createAccountButton.click();

    }
}
