package program50;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class listofwebelements {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("good morning image", Keys.ENTER);
		List<WebElement> findElements = driver.findElements(By.xpath("a"));
		for (WebElement x : findElements) {
			System.out.println(x.getAttribute("href"));
		}
	}
}
