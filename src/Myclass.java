import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myclass {

	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
		
		WebDriver driver ;
	
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user\r\n");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		driver.manage().window().maximize();
		
		List<WebElement> the_add_buttons = driver.findElements(By.className("btn_primary"));
		System.out.println(the_add_buttons.size());
		
		for (int i=0; i< the_add_buttons.size();i++) {
			
			the_add_buttons.get(i).click();
			
		}

	}

}
