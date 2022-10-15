import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.Test;

public class TesteUCSenai {
	private WebDriver driver;
	
	@Before
	public void ConfigurarTeste () {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:4200");
	}
	
	@Test
	public void TesteLogin () {		
		try {
			driver.findElement(By.className("login")).click();
			driver.findElement(By.id("email")).sendKeys("teste01@teste.com");
			driver.findElement(By.id("senha")).sendKeys("teste").sendKeys(Keys.ENTER);
			driver.findElement(By.cssSelector("button[type='submit']")).click();
			System.out.println("Login realizado via click");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@After
	public void Fechar() throws Exception {
		driver.quit();
	}
	
}
