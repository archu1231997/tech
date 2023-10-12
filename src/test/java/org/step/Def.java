package org.step;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Def {

	public WebDriver driver;

	@Given("user should be in loginpage")
	public void tc01() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fishpond.com.au/");
		System.out.println("browser sucessful launched");
		driver.findElement(By.xpath("(//input[@class='menu__item-content'])")).click();
		driver.findElement(By.xpath("(//input[@class='sigin-option active'])")).click();
	}
	
	@When("user should enter the username and password")
	public void user_should_enter_the_username_and_password()
	{
		
		
		
		WebElement fullname=driver.findElement(By.id("(//input[@type='fullname'])"));
		fullname.sendKeys("archana dhanabal");
		WebElement email_address=driver.findElement(By.id("(//input[@type='email_address'])"));
		fullname.sendKeys("archanadhanabal97@gmailcom");
		WebElement password=driver.findElement(By.id("(//input[@type='password'])"));
		password.sendKeys("Arch@n@24");
        
		
		driver.findElement(By.id("email_address")).sendKeys("archanadhanabal97@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Arch@n@24");
	}}
	
	
	

	

