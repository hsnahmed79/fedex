package fedex.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FedExBackAndForthElements {

	@FindBy(xpath = "//a[contains(text(),'About FedEx')]")
	public WebElement aboutFedEx;
	
	

	
	//a[contains(text(),'See full history')]
	
	@FindBy(xpath = "//a[contains(text(),'See full history')]")
	public WebElement seefullHistory;

}
