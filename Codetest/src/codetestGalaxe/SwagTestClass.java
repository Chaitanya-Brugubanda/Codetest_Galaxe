package codetestGalaxe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagTestClass {
	
	@Test
	void Codetest() {
		
		//Open Browser 
				System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.saucedemo.com");
				driver.manage().window().maximize();
				
				//Login
				System.out.println(driver.getTitle());
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				driver.findElement(By.id("login-button")).click();
				
				// Sort
				//driver.findElement(By.xpath("//select[@class='product_sort_container']/option=
				/*WebElement element = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]"));
				Select item = new Select(element);
				item.selectByVisibleText("Name (Z to A)");
				//item.selectByIndex(2);
				WebElement firstele = item.getFirstSelectedOption();
				System.out.println(firstele);
				driver.wait(2000);*/
				
				//add items to cart 
				//System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
				driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
				//driver.wait(1000);
				driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).click();
				
				// Remove an Item from Cart
				driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
				
				//Continue Shopping 
				driver.findElement(By.id("continue-shopping")).click();
				//Add t shirt to cart
				driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
				
				//find the number of elements in cart 
				String items = driver.findElement(By.xpath("//span[contains(text(),'2')]")).getText();
				
				Assert.assertEquals(items, "2");
				
				driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).click();
				driver.findElement(By.id("checkout")).click();
				driver.findElement(By.id("first-name")).sendKeys("Chaitanya");
				driver.findElement(By.id("last-name")).sendKeys("Brugubanda");
				driver.findElement(By.id("postal-code")).sendKeys("08691");
				driver.findElement(By.id("continue")).click();
				
				// verify the item names in the cart 
				String item1 = driver.findElement(By.xpath("//a[@id='item_4_title_link']")).getText();
				Assert.assertEquals(item1, "Sauce Labs Backpack", "Pass");
				
				String item2 = driver.findElement(By.xpath("//a[@id='item_1_title_link']")).getText();
				Assert.assertEquals(item2, "Sauce Labs Bolt T-Shirt");
				
				//Complete the transaction
				driver.findElement(By.id("finish")).click();
				
		
	}

}
