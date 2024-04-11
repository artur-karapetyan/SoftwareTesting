package Homework3_1.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.zoomerang.app/ai-gallery");

        driver.manage().window().maximize();

        WebElement searchInput = driver.findElement(By.id("search art"));
        searchInput.sendKeys("harry potter" + Keys.ENTER);

        WebElement image = driver.findElement(By.cssSelector("img[src='https://filesw.zoomerang.info/AiArtResults/AItti/zoomerang_tti_5OJKAOSEQC_1537444_0_thumb.webp']"));

        String altText = image.getAttribute("alt");

        String expectedMessage = "(Harry Potter movie poster, movie poster style, key art:1.2), Margot Robbie as a Barbie in Harry Potter movie, wearing pink wizard dress, Harry Potter text logo, Hogwarts background";
        if (altText.equals(expectedMessage)) {
            System.out.println("Assertion passed: Expected message displayed");
        } else {
            System.out.println("Assertion failed: Expected message not displayed");
        }

        driver.quit();
    }
}
