package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Baseclass.WrapperclassAlaska;
import pages.alaska_home;

public class alaska_home_testcase extends WrapperclassAlaska{
	static alaska_home ah;
	@BeforeTest
	public void start()
	{
		launchapplication("chrome","https://www.royalcaribbean.com/alaska-cruises");
	}
	@Test
public void login() throws InterruptedException
{
	ah=PageFactory.initElements(dr,alaska_home.class);
	String er1="whale watching tour";
	String er2="Royal Suite - 1 Bedroom";
	String ac1=ah.ww();
	//System.out.println(ac1);
	ah.selection();
	String ac2=ah.print();
	//System.out.println(ac2);
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(er1, ac1);
	sa.assertEquals(er2, ac2);
	sa.assertAll();
}
	@AfterTest
public void close()
{
	screenshot("C:\\844888\\Alaska\\Alaska\\src\\test\\resources\\screenshot\\homepage.png");
	quit();
}
}
