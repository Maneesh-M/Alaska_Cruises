package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class alaska_home {

	@FindBy(xpath="//*[@id='textWithUI-262899300']/div/div[2]/a")
	public WebElement whalewhatching;

	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div/div[4]/div/div/div/div[1]/button/figure/img")
	public WebElement button;

	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div/div[6]/div[1]/div[2]/div/div[1]/ul/li/a[1]")
	public WebElement plan;

	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div/div[6]/div[1]/div[2]/div/div[2]/ul/div[1]/li[1]/a")
	public WebElement find;

	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div/div[4]/div/div/div/div[3]/div/nav/div[2]/a")
	public WebElement ships;

	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div[6]/div/section/div/div[16]/a/div/figure/div")
	public WebElement raphsody;

	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div[1]/div/div[1]/div/div[4]/div/div/div/div/div[3]/a")
	public WebElement deck;

	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[1]/div/div/div[2]/section/div[1]/label/select")
	public WebElement dd;

	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[1]/div/div/div[2]/section/section[2]/section[1]/div[2]/section[5]/h4")
	public WebElement royal;

	
	public String ww() 
	{
		String w=whalewhatching.getText();
		return w;
	}
	public void selection() throws InterruptedException
	{
		button.click();
		Thread.sleep(3000);
		
		plan.click();
		Thread.sleep(3000);
		
		find.click();
		Thread.sleep(3000);
		
		ships.click();
		Thread.sleep(5000);
		
		raphsody.click();
		Thread.sleep(5000);
		
		deck.click();
		Thread.sleep(10000);
		
		Select de=new Select(dd);
		de.selectByVisibleText("Deck Eight");
		Thread.sleep(5000);
	}
	
	public String print()
	{
		String r=royal.getText();
		return r;
	}
}
