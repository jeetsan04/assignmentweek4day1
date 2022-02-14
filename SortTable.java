package assignmentweek4.day1;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortTable {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/sorttable.html");

		System.out.println("List1" +"\n"+ "*************");

		WebElement tableElement = driver.findElement(By.id("table_id_wrapper"));
		List<WebElement> list = tableElement.findElements(By.tagName("th"));

		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}


	}
}
