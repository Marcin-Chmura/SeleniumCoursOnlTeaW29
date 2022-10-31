package pl.codreslab.seleniumcoursonlteaw29;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FindByNameOnCodersLabHotelPageTest {
    @Test
    public void findElementsByName() {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocationInput = driver.findElement(By.name("hotel_location"));
        WebElement searchButton = driver.findElement(By.name("search_room_submit"));
        WebElement newsletterInput = driver.findElement(By.name("email"));

        hotelLocationInput.sendKeys("Warsaw");
        newsletterInput.sendKeys("test@test.com");
        searchButton.click();


    }
}
