package pl.codreslab.seleniumcoursonlteaw29;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuckDuckGo {
    @Test
    public void qwantSearch() {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.clear();
        searchInput.sendKeys("lalal");
        searchInput.submit();
    }
}