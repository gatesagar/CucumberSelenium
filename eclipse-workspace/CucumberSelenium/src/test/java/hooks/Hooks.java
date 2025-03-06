package hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.Before;
import stepDefinitions.Base;

public class Hooks extends Base{
	
	@Before
	public void Setup() throws IOException
	
	{
	Properties prop=new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\CucumberSelenium\\src\\test\\resources\\config.properties");
	prop.load(fis);
	
	String brw=prop.getProperty("browser");
	
	//System.out.println(brw);
	if (brw.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver",prop.getProperty("firefoxpath"));
		driver = new FirefoxDriver();
	}
	else if(brw.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(brw.equals("ie"))
	{
		System.setProperty("webdriver.ie.driver",prop.getProperty("iepath"));
		driver = new InternetExplorerDriver();
	}
}
}