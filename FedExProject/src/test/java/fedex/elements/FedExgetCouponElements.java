package fedex.elements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FedExgetCouponElements {

	//a[contains(text(),'Design & Print')]
		// need to make customize xpath
		
	@FindBy(xpath = "//span[contains(text(),'Design & Print')]")
	public WebElement designPrintMenu;;
		
		
		
		@FindBy(xpath = "//a[contains(text(),'Get Coupons & Deals')]")
		public WebElement getCouponAndDeals;
		
		
		
		@FindBy(linkText = "Get Coupon") 
		public WebElement getCouponTwoDollarOff;
		

		
	
}
