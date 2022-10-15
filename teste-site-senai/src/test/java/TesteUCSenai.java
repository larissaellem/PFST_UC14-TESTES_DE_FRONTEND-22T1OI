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
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OI417414\\Documents\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void TesteNavegabilidade () {
		driver.get("https://online.sp.senai.br/");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Curso tecnologia senai");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("Busca1_btnBusca")).click();
		
	}
	
}
