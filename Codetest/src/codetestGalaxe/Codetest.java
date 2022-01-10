package codetestGalaxe;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Codetest {
	static WebDriver driver;
	
	 @Test (priority = 1)
	void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
	}
	@Test (priority=2)
	void login() {
		System.out.println(driver.getTitle());
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		//driver.
	}
	
	//void sortItems() {
		//driver.findElement(By.xpath("//select[@class='product_sort_container']/option=
				/*WebElement element = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]"));
				Select item = new Select(element);
				item.selectByVisibleText("Name (A to Z)");
				//item.selectByIndex(1);
				WebElement firstele = item.getFirstSelectedOption();
				System.out.println(firstele);
				driver.wait(2000);*/
	
	//}
	
	@Test (priority=3)
	void additemstoCart() throws InterruptedException {
		//add items to cart 
				//System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
				driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
				//driver.wait(1000);
				driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).click();
				
				//assert the no of items 
				var qty= driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));//fixed quantity assertion
		        //System.out.println(qty);	
				Assert.assertEquals(2, qty);

}


}
