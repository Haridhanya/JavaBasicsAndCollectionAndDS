package pagefiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class FacebookRegObjects {

	WebDriver driver;
	By firstname=By.name("firstname");
	By lastname=By.name("lastname");
	By email=By.name("reg_email__");
	By password=By.name("reg_passwd__");
	By bdate=By.name("birthday_day");
	By gender=By.xpath("//label[text()='Female']");
	By submit=By.name("websubmit");
	
	//going to write methods
	
	public FacebookRegObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	public void EnterUsername()
	{
		driver.findElement(firstname).sendKeys("hari");
		driver.findElement(lastname).sendKeys("Dhanya");
		
	}
	public void EnterEmail()
	{
		driver.findElement(email).sendKeys("aa@gmail.com");
	}
	public void EnterPassword()
	{
		driver.findElement(password).sendKeys("******");
		
	}
	public void Selectbdate()
	{
		Select s=new Select(driver.findElement(bdate));
		s.selectByValue("16");
		
	}
	public void SelectGender()
	{
		driver.findElement(gender).click();
	}
	public void Submit()
	{
		driver.findElement(submit).click();
	}
}
