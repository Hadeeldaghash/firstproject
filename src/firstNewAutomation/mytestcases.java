package firstNewAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mytestcases {
	
	WebDriver driver = new EdgeDriver();
	
	
@BeforeTest 	
public void setUp() throws InterruptedException {
	driver.get("http://127.0.0.1:5500/index.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("opennn")).click();
	Thread.sleep(3000);
	driver.get("http://127.0.0.1:5500/index.html");
	Thread.sleep(3000);
	
}



@Test()
public void myFirstTest() throws InterruptedException {
	driver.findElement(By.name("inputforthecolor")).sendKeys("purple");
	driver.findElement(By.name("inputforthemonth")).sendKeys("febuary");
	driver.findElement(By.name("inputforthebd")).sendKeys("02/24/1985");

	

	
	
}



@AfterTest
public void postTestin () {}



}
