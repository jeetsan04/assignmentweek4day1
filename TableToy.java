package assignmentweek4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableToy {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");
		
		WebElement elementTable = driver.findElement(By.id("table_id"));
		List<WebElement> rowElement = elementTable.findElements(By.tagName("tr"));
		int rowSize = rowElement.size();
		System.out.println("Row Count: "+rowSize);
		
		List<WebElement> columnCount = elementTable.findElements(By.tagName("th"));
		int columnSize = columnCount.size();
		System.out.println("Column Count: "+columnSize);
		
		WebElement progressValue = driver.findElement(By.xpath("//td[text()='Learn to interact with Elements']/following-sibling::td"));
		String Value = progressValue.getText();
		System.out.println("Progress Value is : "+Value);
		
		driver.findElement(By.xpath("//tr[@id='table_id']/child-td")).click();
		
	}

}
