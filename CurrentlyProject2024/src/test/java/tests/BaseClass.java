

package tests;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	public static AppiumDriver<MobileElement> driver;
	Tests t;
	
	

	
	@BeforeTest
	public void setup() {
		
		try {
			DesiredCapabilities caps=new DesiredCapabilities();
		
		//caps.setCapability("platformName", "ANDROID");
		//caps.setCapability(CapabilityType.PLATFORM_NAME,"ANDROID");
		//caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy S9");
		caps.setCapability(MobileCapabilityType.UDID,"23139ea21e027ece");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,120000);
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		caps.setCapability("appPackage", "com.currently.android");
		caps.setCapability("appActivity", "com.currently.android.ui.activities.onBoarding.OnBoardingSplashActivity");

		//caps.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/applications/"+"currently_08-07.apk");
		//caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");

		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		driver=new AppiumDriver<MobileElement> (url,caps); 
		//driver=new AndroidDriver<MobileElement> (url,caps);
		//driver=new IOSDriver<MobileElement> (url,caps);
		
		}catch (Exception exp) {
			System.out.println("Cause is :"+exp.getCause());
			System.out.println("Message is"+exp.getMessage());
			exp.printStackTrace();
		}
	}
	
	
	@Test (priority=1, enabled=true)
	public void Existinguser() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t= new Tests();
		t.LoginwithExistinguser();
	}
	
	/*@Test 
	public void newuser() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		//Tests t= new Tests(driver);
		driver.launchApp();
		t.SignupwithInvitedNewuser();
	}*/
	
	//-----------------------------------------------------------------NORMAL IMAGE MOMENTS----------------------------------------------------------------------------------------------------------

	
	@Test (priority=2, enabled= false)
	public void public_moment_withselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.public_moment_withselfie();
	}
	
	@Test (priority=3, enabled= false)
	public void public_moment_withoutselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.public_moment_withoutselfie();
	}
	
	@Test (priority=4, enabled= false)
	public void private_moment_withselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.private_moment_withselfie();
	}
	
	@Test (priority=5, enabled= false)
	public void private_moment_withoutselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.private_moment_withoutselfie();
	}
	
	@Test (priority=6, enabled= false)
	public void closefriend_moment_withselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.closefriend_moment_withselfie();
	}
	
	@Test (priority=7, enabled= false)
	public void closefriend_moment_withoutselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.closefriend_moment_withoutselfie();
	}
	
	//-----------------------------------------------------------------Ongoing MOMENTS----------------------------------------------------------------------------------------------------------

	
	@Test (priority=8, enabled= false)
	public void publicongoing_moment_withselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.publicongoing_moment_withselfie();
	}
	
	@Test (priority=9, enabled= false)
	public void publicongoing_moment_withoutselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.publicongoing_moment_withoutselfie();
	}
	
	@Test (priority=10, enabled= false)
	public void privateongoing_moment_withselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.privateongoing_moment_withselfie();
	}
	
	@Test (priority=11, enabled= false)
	public void privateongoing_moment_withoutselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.privateongoing_moment_withoutselfie();
	}
	
	@Test (priority=12, enabled= false)
	public void closefriendongoing_moment_withselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.closefriendongoing_moment_withselfie();
	}
	
	@Test (priority=13, enabled= false)
	public void closefriendongoing_moment_withoutselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.closefriendongoing_moment_withoutselfie();
	}
	
	//-----------------------------------------------------------------CAROUSEL MOMENTS----------------------------------------------------------------------------------------------------------

	
	@Test (priority=14, enabled= false)
	public void PublicCarousel_with_selfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.PublicCarousel_with_selfie();
	}
	
	@Test (priority=15, enabled= false)
	public void PublicCarousel_without_selfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.PublicCarousel_without_selfie();
	}
	

	@Test (priority=16, enabled= false)
	public void PrivateCarousel_with_selfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.PrivateCarousel_with_selfie();
	}
	
	@Test (priority=17, enabled= false)
	public void PrivateCarousel_without_selfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.PrivateCarousel_without_selfie();
	}
	
	@Test (priority=18, enabled= false)
	public void ClosefriendCarousel_with_selfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.ClosefriendCarousel_with_selfie();
	}
	
	@Test (priority=19, enabled= false)
	public void ClosefriendCarousel_without_selfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.ClosefriendCarousel_without_selfie();
	}
	
//-----------------------------------------------------------------ONGOING CAROUSEL MOMENT----------------------------------------------------------------------------------------------------------

	
	@Test (priority=20, enabled= false)
	public void PublicOngoingCarousel_with_selfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.PublicOngoingCarousel_with_selfie();
	}
	
	@Test (priority=21, enabled= false)
	public void PublicOngoingCarousel_without_selfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.PublicOngoingCarousel_without_selfie();
	}
	
	@Test (priority=22, enabled= false)
	public void PrivateOngoingCarousel_with_selfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.PrivateOngoingCarousel_with_selfie();
	}
	
	@Test (priority=23, enabled= false)
	public void PrivateOngoingCarousel_without_selfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.PrivateOngoingCarousel_without_selfie();
	}
	
	@Test (priority=24, enabled= false)
	public void ClosefriendOngoingCarousel_with_selfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.ClosefriendOngoingCarousel_with_selfie();
	}
	
	@Test (priority=25, enabled= false)
	public void ClosefriendOngoingCarousel_without_selfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.ClosefriendOngoingCarousel_without_selfie();
	}
	
	public void teardown() {
		
	}
	
//-----------------------------------------------------------------NORMAL VIDEO MOMENTS----------------------------------------------------------------------------------------------------------

	@Test (priority=26, enabled= false)
	public void public_video_withselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.public_video_withselfie();
	}
	
	@Test (priority=27, enabled= false)
	public void public_video_withoutselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.public_video_withoutselfie();
	}
	
	@Test (priority=28, enabled= true)
	public void private_video_withselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.private_video_withselfie();
	}
	
	@Test (priority=29, enabled= true)
	public void private_video_withoutselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.private_video_withoutselfie();
	}
	

	@Test (priority=30, enabled= true)
	public void closefriend_video_withselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.closefriend_video_withselfie();
	}
	
	@Test (priority=31, enabled= true)
	public void closefriend_video_withoutselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.closefriend_video_withoutselfie();
	}
	
//-----------------------------------------------------------------ONGOING VIDEO MOMENTS--------------------------------------------------------------------------------------------------------
	
	@Test (priority=32, enabled= true)
	public void publicOngoing_video_withselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.publicOngoing_video_withselfie();
	}
	
	@Test (priority=33, enabled= true)
	public void publicOngoing_video_withoutselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.publicOngoing_video_withoutselfie();
	}
	
	@Test (priority=34, enabled= true)
	public void privateOngoing_video_withselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.privateOngoing_video_withselfie();
	}
	
	@Test (priority=35, enabled= true)
	public void privateOngoing_video_withoutselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.privateOngoing_video_withoutselfie();
	}
	
	@Test (priority=36, enabled= true)
	public void closefriendOngoing_video_withselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.closefriendOngoing_video_withselfie();
	}
	
	@Test (priority=37, enabled= true)
	public void closefriendOngoing_video_withoutselfie() throws Exception {
		System.out.println("Currently Test Begins Now.....");
		t.Everytimelogin();
		t.closefriendOngoing_video_withoutselfie();
	}
}
