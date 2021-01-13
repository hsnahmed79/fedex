package fedex.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import fedex.elements.FedExgetCouponElements;
import fedex.utilities.SetupDrivers;



public class FedExgetCouponActions {

	FedExgetCouponElements getCoupon;
	
	public FedExgetCouponActions(){
		
		this.getCoupon=new FedExgetCouponElements();
		
		PageFactory.initElements(SetupDrivers.driver, getCoupon);
		
	}
	
	public void fedExHomePage() {
		SetupDrivers.driver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
	}
	
	public boolean verifyHomepage() {
		boolean bool = false;
		System.out.println(SetupDrivers.driver.getTitle());

		if (SetupDrivers.driver.getTitle().contains("FedEx")) {
			bool = true;
		}

		return bool;
	}
	
		public void getDesignAndPrint() {
			
			getCoupon.designPrintMenu.click();
			
		
		
	}
	
		public void getCouponAndDeals() {
			getCoupon.getCouponAndDeals.click();
					

}
		
		public boolean verifyCouponPage() {
			boolean bool = false;
			System.out.println(SetupDrivers.driver.getTitle());
			if (SetupDrivers.driver.getTitle().contains("FedEx coupon")) {
				bool = true;
			}

			return bool;
			}
		
		public void getCouponTwoDollarOff() {
			getCoupon.getCouponTwoDollarOff.click();
					

}
	
	
}
