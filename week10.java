import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class week10 {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver,chrome.driver", "C:\\Users\\student\\Music\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));    
        searchBox.sendKeys("GMAIL");
        searchBox.submit();
 
        WebElement link = driver.findElement(By.className("DKV0Md"));
        link.click();
        Thread.sleep(3000);
 
        WebElement createacc = driver.findElement(By.className("laptop-desktop-only"));
        createacc.click();
        Thread.sleep(1000);
 
        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.click();
        firstName.sendKeys("Vivek");
 
        WebElement nextBtn = driver.findElement(By.className("VfPpkd-vQzf8d"));
        nextBtn.click();
        Thread.sleep(2000);
 
        WebElement day = driver.findElement(By.id("day"));
        day.click();
        day.sendKeys("17");
        Thread.sleep(500);
 
        Select DM = new Select(driver.findElement(By.id("month")));
		DM.selectByValue("3");
		Thread.sleep(500);
 
		WebElement year = driver.findElement(By.id("year"));
		year.click();
        year.sendKeys("1999");
        Thread.sleep(500);
 
        Select gender = new Select(driver.findElement(By.id("gender")));
        gender.selectByValue("2");
        Thread.sleep(500);
        WebElement nextBtn1 = driver.findElement(By.className("VfPpkd-vQzf8d"));
        nextBtn1.click();
        Thread.sleep(1000);
 
        WebElement username1 = driver.findElement(By.name("Username"));
        username1.click();
        username1.sendKeys("higjhkgbghlow672");
        WebElement nextBtn3 = driver.findElement(By.className("VfPpkd-vQzf8d"));
        nextBtn3.click();
        Thread.sleep(1000);
        WebElement newPass = driver.findElement(By.name("Passwd"));
        newPass.click();
        newPass.sendKeys("Shizuka63921@");
        Thread.sleep(500);
        WebElement confPass = driver.findElement(By.name("PasswdAgain"));
        confPass.click();
        confPass.sendKeys("Shizuka63921@");
        WebElement nextBtn4 = driver.findElement(By.className("VfPpkd-vQzf8d"));
        nextBtn4.click();
 
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}