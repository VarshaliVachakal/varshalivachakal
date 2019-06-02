package varsha;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class varsha {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishalv\\Desktop\\eclipse\\chromedriver.exe");
		WebDriver dd=new ChromeDriver();
		dd.get("https://www.javabykiran.com/javabykiranfiles/");
		WebElement fe = dd.findElement(By.id("login_form_user"));
		Actions aa=new Actions(dd);
		aa.moveToElement(fe).click().keyDown(fe, Keys.SHIFT).sendKeys(fe, "javabykiran").doubleClick(fe).contextClick().build().perform();
		
	}
	
}
