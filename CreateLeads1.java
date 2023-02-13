package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeads1 {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String text=driver.findElement(By.tagName("h2")).getText();
		
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abishua");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Abi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S R");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Manufacturing Engineering");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Good boy");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abishuarickz352@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select ste=new Select(state);
		ste.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		//System.out.println(driver.getTitle());
		//String title = driver.getTitle();
		//System.out.println(title);
	}
	
	
		
		
		
}


