import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week12 {
	@Test
	public void testOne() throws Exception {
		System.setProperty("webdriver,chrome.driver", "C:\\Users\\student\\Music\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
 
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		Thread.sleep(1000);
		driver.manage().window().maximize();

		WebElement selectPdf = driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span"));
		selectPdf.click();
 
		fileUpload("C:\\Users\\student\\Downloads\\Ex 9.docx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("processTaskTextBtn")).click();
    }
	public int fileUpload(String location) throws AWTException {
		StringSelection strSelection = new StringSelection(location);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
 
		Robot robot = new Robot();
		robot.delay(3000);
 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		return 0;
	}
}