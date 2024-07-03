package pages;

import java.time.Duration;
import java.util.Random;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import pageObject.LoginPageElements;
import tests.BaseClass;
import utils.ElementFetch;

public class LoginPageEvent  {

	// Array of common Indian firstname
		private static final String[] firstNames = {
		        "Amit", "Anil", "Arun", "Ajay", "Vijay", "Ravi", "Suman", "Sunil", "Nitin", "Rahul",
		        "Priti", "Reena", "Neha", "Anju", "Meena", "Kiran", "Rajiv", "Suresh", "Manju", "Mohan"
		    };
		
		// Array of common Indian surnames
	    private static final String[] surnames = {
	        "Sharma", "Verma", "Patel", "Singh", "Jain", "Gupta", "Reddy", "Rao", "Das", "Nair",
	        "Kapoor", "Mehta", "Chopra", "Joshi", "Ghosh", "Khan", "Mishra", "Pandey", "Bose", "Chatterjee"
	    };
		
		// Arrays of common prefixes and suffixes for generating meaningful usernames
	    private static final String[] prefixes = {
	        "cool", "smart", "happy", "bright", "fast", "shiny", "brave", "lucky", "quick", "wise"
	    };
	    private static final String[] suffixes = {
	        "star", "bird", "lion", "wolf", "hawk", "fox", "tiger", "dragon", "hero", "knight"
	    };
	
	public void next() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.next).click();
		
	}
	
	public void mobile() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.mobile).sendKeys("8849428483");
		
	}
	
	public void google_select() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.google_select).click();
		
	}
	
	public void continue_button() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.continue_button).click();
		
	}
	
	public void permission_whileuapp() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.permission_whileuapp).click();
		
	}
	
	public void contact_permissionallow() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.contact_permissionallow).click();
		
	}
	
	public void hide_invite_bottomsheet() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.hide_invite_bottomsheet).click();
		
	}
	
	//Random Mobile number generator
	public static String generateMobileNumber() {
        Random random = new Random();
        StringBuilder mobileNumber = new StringBuilder("6");
        // Append 9 random digits to the initial 6
        for (int i = 0; i < 9; i++) {
            int digit = random.nextInt(10); // Generates a digit from 0 to 9
            mobileNumber.append(digit);
        }
        return mobileNumber.toString();
    }
	
	public void ob_mobile() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.ob_mobile).sendKeys(generateMobileNumber());
		
	}
	
	public void ob_profile_pic() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.ob_profile_pic).click();
		
	}
	
	public void ob_mediaaccess() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.ob_mediaaccess).click();
		
	}
	
	public void ob_camera() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.ob_camera).click();
		
	}
	
	/*public void ob_reocordpermision() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.ob_reocordpermision).click();
		
	}*/
	
	public void ob_capture_camerabutton() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.ob_capture_camerabutton).click();
		
	}
	
	public void ob_set_profilepic() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.ob_set_profilepic).click();
		
	}
	
	// Method to generate a meaningful first name from the predefined list
    public static String generateFirstname() {
        Random random = new Random();
        return firstNames[random.nextInt(firstNames.length)];
    }
	
	
	public void ob_firstname() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.ob_firstname).sendKeys(generateFirstname());
		
	}
	
	// Method to generate a meaningful last name from the predefined list
	public static String generateSurname() {
        Random random = new Random();
        return surnames[random.nextInt(surnames.length)];
    }
	
	public void ob_lastname() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.ob_lastname).sendKeys(generateSurname());
		
	}
	
	// Method to generate a meaningful username of a specified length
    public static String generateUsername(int maxLength) {
        Random random = new Random();
        String prefix = prefixes[random.nextInt(prefixes.length)];
        String suffix = suffixes[random.nextInt(suffixes.length)];
        // Ensure the combined length of the prefix and suffix does not exceed the maxLength
        if (prefix.length() + suffix.length() > maxLength) {
            // Adjust by truncating the longer part to fit the maxLength
            if (prefix.length() > suffix.length()) {
                prefix = prefix.substring(0, maxLength - suffix.length());
            } else {
                suffix = suffix.substring(0, maxLength - prefix.length());
            }
        }
        return prefix + suffix;
    }
	
	public void ob_username() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.ob_username).sendKeys(generateUsername(10));
		
	}
	
	public void ob_name_nextbtn() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.ob_name_nextbtn).click();
		
	}
	
	public void ob_gender() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.ob_gender).click();
		
	}
	
	public void ob_dob_nextbtn() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.ob_dob_nextbtn).click();
		
	}
	
	public void ob_invitescreen_nextbtn() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.ob_invitescreen_nextbtn).click();
		
	}
	
	public void ob_followall_btn() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.ob_followall_btn).click();
		
	}
	
	public void milestone_popupcancel() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("XPATH", LoginPageElements.milestone_popupcancel).click();
		
	}
	
	public void check_nt() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.check_nt);
		
	}
	
	public void ob_perm_skip() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", LoginPageElements.ob_perm_skip).click();
	}
	
	public void Scroll() {
		try {
			//MobileElement elementToScroll3 = driver.findElement(By.id("com.currently.android:id/backIcon"));
			int startX2 = +125;
			int startY2 = +260;
			int endX2 = +188; // Horizontal scroll stays the same
			int endY2 = +2043; // Adjust this value to control the scroll distance
			TouchAction touchAction4 = new TouchAction(BaseClass.driver);
			touchAction4.press(PointOption.point(startX2, startY2))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
					.moveTo(PointOption.point(endX2, endY2)).release().perform();
			Thread.sleep(5000);
			}catch (Exception scroll) {
				System.out.println("No scroll needeed"+scroll);
			}
		
	}

	
}
