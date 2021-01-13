package fedex.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import fedex.elements.FedExBackAndForthElements;
import fedex.utilities.SetupDrivers;

public class FedExBackAndForthActions {
	
	

	
	FedExBackAndForthElements backAndForth;
	
	public FedExBackAndForthActions(){
		
		this.backAndForth=new FedExBackAndForthElements();
		
		PageFactory.initElements(SetupDrivers.driver, backAndForth);
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
	
	
		public void aboutFedEx() {
			
			backAndForth.aboutFedEx.click();		
		
	}
		
		public boolean verifyAboutFedExpage() {
			boolean bool = false;
			System.out.println(SetupDrivers.driver.getTitle());
			if (SetupDrivers.driver.getTitle().contains("About us")) {
				bool = true;
			}

			return bool;
			}
		
	
		public void fedExfullHistorye() {
					
			backAndForth.seefullHistory.click();
}
		
		public boolean verifyFedExHistorypage() {
			boolean bool = false;
			System.out.println(SetupDrivers.driver.getTitle());
			if (SetupDrivers.driver.getTitle().contains("FedEx History")) {
				bool = true;
			}

			return bool;
			}	
	

	

}
