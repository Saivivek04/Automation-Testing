import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week5 {
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver,chrome.driver", "C:\\a1\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver obj =new ChromeDriver();
		Thread.sleep(2000);
		obj.manage().window().maximize();
		obj.get("https://cmritautonomous.org/beeserp/Login.aspx");
		Thread.sleep(2000);
		WebElement un=obj.findElement(By.name("txtUserName"));
		un.sendKeys("21R01A7327P");
		Thread.sleep(2000);
		WebElement bn=obj.findElement(By.name("btnNext"));
		bn.click();
		WebElement ps=obj.findElement(By.name("txtPassword"));
		ps.sendKeys("21R01A7327P");
		Thread.sleep(2000);
		WebElement sb=obj.findElement(By.name("btnSubmit"));
		sb.click();
	}
}