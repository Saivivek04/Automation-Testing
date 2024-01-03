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
 
        WebElement createacc = driver.findElement(By.xpath("/html/body/header/div/div/div/a[3]/span[2]"));
        createacc.click();
        Thread.sleep(1000);
 
        WebElement firstName = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[1]/div/form/span/section/div/div/div/div[1]/div[1]/div/div[1]/div/div[1]/input"));
        firstName.click();
        firstName.sendKeys("Harshith");
 
        WebElement nextBtn = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[2]/div/div/div/div/button"));
        nextBtn.click();
        Thread.sleep(2000);
 
        WebElement day = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/input"));
        day.sendKeys("18");
        Thread.sleep(500);
 
        Select month = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div[2]/select")));
		month.selectByValue("10");
		Thread.sleep(500);
 
		WebElement year = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[3]/div/div/div[1]/div/div[1]/input"));
		year.click();
        year.sendKeys("2003");
        Thread.sleep(500);
 
        Select gender = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[1]/div/form/span/section/div/div/div[2]/div[1]/div/div[2]/select")));
        gender.selectByValue("1");
        Thread.sleep(500);
        
        WebElement nextBtn1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[2]/div/div/div/div/button"));
        nextBtn1.click();
        Thread.sleep(1000);
 
        WebElement username1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div[1]/div/div[1]/div/div[1]/input"));
        username1.click();
        username1.sendKeys("abweu9ikl");
        
        WebElement nextBtn3 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/button"));
        nextBtn3.click();
        Thread.sleep(1000);
        
        WebElement newPass = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div[1]/div/div/div[1]/div/div[1]/div/div[1]/input"));
        newPass.click();
        newPass.sendKeys("Idontknow@18");
        Thread.sleep(500);
        
        WebElement confPass = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input"));
        confPass.click();
        Thread.sleep(500);
        confPass.sendKeys("Idontknow@18");
        
        WebElement nextBtn4 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/button"));
        nextBtn4.click();
        Thread.sleep(500);
        
        WebElement mobilenumber = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[2]/div/div[2]/div[1]/label/input"));
        mobilenumber.sendKeys("9959123381");
        Thread.sleep(500);
        
        WebElement nextBtn5 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/button"));
        nextBtn5.click();
        Thread.sleep(500);
        
        WebElement otp = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[2]/div/div[2]/div[1]/label/input"));
        otp.sendKeys("0419");
        Thread.sleep(500);
    }
}
