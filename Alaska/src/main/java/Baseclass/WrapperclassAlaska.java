package Baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WrapperclassAlaska {
	protected WebDriver dr;
	public void launchapplication(String browser,String url)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\844888\\Alaska\\Alaska\\src\\test\\resources\\driver\\geckodriver.exe");
			dr=new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver","C:\\844888\\Alaska\\Alaska\\src\\test\\resources\\driver\\chromedriver.exe");
			dr=new ChromeDriver();
		}
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get(url);
	}
	public void screenshot(String path)
	{
		TakesScreenshot ts=((TakesScreenshot)dr);
		File source=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source,new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void quit()
	{
		dr.close();
	}
}
