package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Abishua");
		driver.findElement(By.id("lastNameField")).sendKeys("A R");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Abi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("A");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Manufacturing Engineering");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Have a good day");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abishuaabi@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select del=new Select(state);
		del.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("nice");
		driver.findElement(By.className("(//input[@class='smallSubmit'])[1]")).click();
		System.out.println(driver.getTitle());
		

		
	}

}
