package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFacebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		System.out.println(driver.getTitle());
}
}
