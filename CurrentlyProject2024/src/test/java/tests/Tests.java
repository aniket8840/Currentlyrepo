package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import pages.CreateMomentEvent;
import pages.LoginPageEvent;

public class Tests extends BaseClass{
	LoginPageEvent login;
	CreateMomentEvent cap_moment;
	
	// New user is singing up
	


	    {
	    	login= new LoginPageEvent();
	    	cap_moment=new CreateMomentEvent();
		}
	    
		@Test
	    public void SignupwithInvitedNewuser() throws Exception{
			// New user is singing up
			System.out.println("Invited New user is going to Signup in Currently");
			
			// 4 Times next button
			login.next();
			Thread.sleep(2000);
			login.next();
			Thread.sleep(2000);
			login.next();
			Thread.sleep(2000);
			login.next();
		    Thread.sleep(3000);
		
			login.ob_mobile();   
			Thread.sleep(15000);
			
			// Complete your profile
			
			login.ob_firstname();
			Thread.sleep(5000);
			login.ob_lastname();
			Thread.sleep(5000);
			login.ob_username();
			Thread.sleep(5000);
			login.ob_profile_pic();
			Thread.sleep(5000);
			login.permission_whileuapp();
			Thread.sleep(5000);
			login.ob_mediaaccess();
			Thread.sleep(5000);
			login.ob_camera();
			Thread.sleep(5000);
			login.permission_whileuapp();
			Thread.sleep(5000);
			login.ob_capture_camerabutton();
			Thread.sleep(5000);
			login.ob_set_profilepic();
			Thread.sleep(5000);
			login.ob_name_nextbtn();
			Thread.sleep(5000);
			login.ob_gender();
			Thread.sleep(5000);
			login.ob_dob_nextbtn();
			Thread.sleep(5000);
			
			// Location Permission
			login.continue_button();
			Thread.sleep(5000);
			login.permission_whileuapp();
			Thread.sleep(5000);
			
			// Notification Permission
			try{
				login.check_nt();
				Thread.sleep(5000);	
				login.continue_button();
				Thread.sleep(11000);
				login.continue_button();
				Thread.sleep(5000);
			}catch(Exception e) {}
			finally {
				try{
					login.continue_button();                    // Contact Permission
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(6000);
				}catch(Exception e) {}
				finally {
					try{
						login.ob_invitescreen_nextbtn();
						Thread.sleep(5000);
						login.ob_followall_btn();
						Thread.sleep(7000);
						login.milestone_popupcancel();
						Thread.sleep(11000);
						login.hide_invite_bottomsheet();
						Thread.sleep(8000);
					}catch(Exception e) {}
					finally {
						
					}
				}
			} 
		
		
		driver.closeApp();
		} 
	 
		@Test
		public void LoginwithExistinguser() throws Exception {
			System.out.println("Existing user is going to login in Currently");
			login= new LoginPageEvent();
			
			// 4 Times next button
			//driver.launchApp();
			login.next();
			Thread.sleep(2000);
			login.next();
			Thread.sleep(2000);
			login.next();
			Thread.sleep(2000);
			login.next();
			Thread.sleep(3000);
		
			
			login.mobile();
			Thread.sleep(15000);
			//login.google_select();   
			//Thread.sleep(15000);
		

			// Location Permissions
			login.continue_button();
			Thread.sleep(5000);
			login.permission_whileuapp();
			Thread.sleep(11000);
			login.contact_permissionallow();
			Thread.sleep(5000);
		//	login.hide_invite_bottomsheet();
			try {
				//MobileElement elementToScroll3 = driver.findElement(By.id("com.currently.android:id/backIcon"));
				int startX2 = +125;
				int startY2 = +260;
				int endX2 = +188; // Horizontal scroll stays the same
				int endY2 = +2043; // Adjust this value to control the scroll distance
				TouchAction touchAction4 = new TouchAction(driver);
				touchAction4.press(PointOption.point(startX2, startY2))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
						.moveTo(PointOption.point(endX2, endY2)).release().perform();
				Thread.sleep(5000);
				}catch (Exception scroll) {
					System.out.println("No scroll needeed"+scroll);
				}
			Thread.sleep(8000);
			
           // System.out.println("Test case 1 passed");

	/*		cap_moment.create_camera();
            Thread.sleep(5000);
			login.contact_permissionallow();
			Thread.sleep(5000);
			login.contact_permissionallow();
			Thread.sleep(5000);
			cap_moment.create_capture();
			Thread.sleep(9000);
			cap_moment.create_selfiecapture();
			Thread.sleep(9000);
			cap_moment.create_selectcategory();
			Thread.sleep(5000);
			cap_moment.create_mentionclick();
			Thread.sleep(5000);
			//cap_moment.create_mentionsearch();
			//Thread.sleep(5000);
		//	cap_moment.create_mentionuser();
			//Thread.sleep(5000);
			cap_moment.create_mentiondone();
			Thread.sleep(5000);
			cap_moment.create_locationclick();
			Thread.sleep(5000);
			cap_moment.create_locationsearch();
			Thread.sleep(5000);
			cap_moment.create_locationselect();
			Thread.sleep(5000);
			cap_moment.create_captionclick();
			Thread.sleep(5000);
			cap_moment.public_momentwithoutselfie_caption();
			Thread.sleep(5000);
			cap_moment.create_captiondone();
			Thread.sleep(5000);
			cap_moment.create_postbutton();
			Thread.sleep(10000);
			cap_moment.create_sharemomentback();
			Thread.sleep(8000);*/
			driver.closeApp();
		}
	
		@Test (priority=1, enabled=true)
		public void Everytimelogin() throws Exception {
			System.out.println("Existing user is going to login in Currently");
			login= new LoginPageEvent();
			
			// 4 Times next button
			driver.launchApp();
			login.next();
			Thread.sleep(2000);
			login.next();
			Thread.sleep(2000);
			login.next();
			Thread.sleep(2000);
			login.next();
			Thread.sleep(3000);
		
			
			login.mobile();
			Thread.sleep(15000);
			//login.google_select();   
			//Thread.sleep(15000);
		

			// Location Permissions
			login.continue_button();
			Thread.sleep(5000);
			login.permission_whileuapp();
			Thread.sleep(11000);
			login.contact_permissionallow();
			Thread.sleep(5000);
		//	login.hide_invite_bottomsheet();
			login.Scroll();
			Thread.sleep(8000);
			
           // System.out.println("Test case 1 passed");

		}
		
//-----------------------------------------------------------------NORMAL IMAGE MOMENTS----------------------------------------------------------------------------------------------------------

		
		// public moment with selfie
		@Test 
		public void public_moment_withselfie() throws Exception {
			System.out.println("Existing user is going to post public moment with selfie");
			
			cap_moment.create_camera();
            Thread.sleep(5000);
			login.contact_permissionallow();
			Thread.sleep(5000);
			login.contact_permissionallow();
			Thread.sleep(5000);
			cap_moment.create_capture();
			Thread.sleep(9000);
			cap_moment.create_selfiecapture();
			Thread.sleep(9000);
			cap_moment.create_selectcategory();
			Thread.sleep(5000);
			cap_moment.create_mentionclick();
			Thread.sleep(5000);
			/*cap_moment.create_mentionsearch();
			Thread.sleep(5000);
			cap_moment.create_mentionuser();
			Thread.sleep(5000);*/
			cap_moment.create_mentiondone();
			Thread.sleep(5000);
			cap_moment.create_locationclick();
			Thread.sleep(5000);
			cap_moment.create_locationsearch();
			Thread.sleep(5000);
			cap_moment.create_locationselect();
			Thread.sleep(5000);
			cap_moment.create_captionclick();
			Thread.sleep(5000);
			cap_moment.public_momentwithselfie_caption();
			Thread.sleep(5000);
			cap_moment.create_captiondone();
			Thread.sleep(5000);
			cap_moment.create_postbutton();
			Thread.sleep(10000);
			cap_moment.create_sharemomentback();
			Thread.sleep(8000);
}

		// public moment without selfie
		@Test 
		public void public_moment_withoutselfie() throws Exception {
			System.out.println("Existing user is going to post public moment without selfie");
			
			cap_moment.create_camera();
            Thread.sleep(5000);
			login.contact_permissionallow();
			Thread.sleep(5000);
			login.contact_permissionallow();
			Thread.sleep(5000);
			cap_moment.create_capture();
			Thread.sleep(9000);
			cap_moment.create_selfieskip();
			Thread.sleep(9000);
			cap_moment.create_selectcategory();
			Thread.sleep(5000);
			cap_moment.create_mentionclick();
			Thread.sleep(5000);
			/*cap_moment.create_mentionsearch();
			Thread.sleep(5000);
			cap_moment.create_mentionuser();
			Thread.sleep(5000);*/
			cap_moment.create_mentiondone();
			Thread.sleep(5000);
			cap_moment.create_locationclick();
			Thread.sleep(5000);
			cap_moment.create_locationsearch();
			Thread.sleep(5000);
			cap_moment.create_locationselect();
			Thread.sleep(5000);
			cap_moment.create_captionclick();
			Thread.sleep(5000);
			cap_moment.public_momentwithoutselfie_caption();
			Thread.sleep(5000);
			cap_moment.create_captiondone();
			Thread.sleep(5000);
			cap_moment.create_postbutton();
			Thread.sleep(10000);
			cap_moment.create_sharemomentback();
			Thread.sleep(8000);
			driver.closeApp();
}
		
		//private moment with selfie
		@Test 
		public void private_moment_withselfie() throws Exception {
			System.out.println("Existing user is going to post private moment with selfie");
			
			cap_moment.create_camera();
            Thread.sleep(5000);
			login.contact_permissionallow();
			Thread.sleep(5000);
			login.contact_permissionallow();
			Thread.sleep(5000);
			cap_moment.create_capture();
			Thread.sleep(9000);
			cap_moment.create_selfiecapture();
			Thread.sleep(9000);
			cap_moment.create_selectcategory();
			Thread.sleep(5000);
			cap_moment.create_mentionclick();
			Thread.sleep(5000);
			/*cap_moment.create_mentionsearch();
			Thread.sleep(5000);
			cap_moment.create_mentionuser();
			Thread.sleep(5000);*/
			cap_moment.create_mentiondone();
			Thread.sleep(5000);
			cap_moment.create_locationclick();
			Thread.sleep(5000);
			cap_moment.create_locationsearch();
			Thread.sleep(5000);
			cap_moment.create_locationselect();
			Thread.sleep(5000);
			cap_moment.create_captionclick();
			Thread.sleep(5000);
			cap_moment.private_momentwithselfie_caption();
			Thread.sleep(5000);
			cap_moment.create_captiondone();
			Thread.sleep(5000);
			cap_moment.create_momenttypebtn();
			Thread.sleep(5000);
			cap_moment.create_privatemoment();
			Thread.sleep(5000);
			login.Scroll();
			Thread.sleep(5000);
			cap_moment.create_postbutton();
			Thread.sleep(10000);
			cap_moment.create_sharemomentback();
			Thread.sleep(8000);
			driver.closeApp();
}
		
		//private moment without selfie
		@Test 
		public void private_moment_withoutselfie() throws Exception {
			System.out.println("Existing user is going to post private moment without selfie");
			
			cap_moment.create_camera();
            Thread.sleep(5000);
			login.contact_permissionallow();
			Thread.sleep(5000);
			login.contact_permissionallow();
			Thread.sleep(5000);
			cap_moment.create_capture();
			Thread.sleep(9000);
			cap_moment.create_selfieskip();
			Thread.sleep(9000);
			cap_moment.create_selectcategory();
			Thread.sleep(5000);
			cap_moment.create_mentionclick();
			Thread.sleep(5000);
			/*cap_moment.create_mentionsearch();
			Thread.sleep(5000);
			cap_moment.create_mentionuser();
			Thread.sleep(5000);*/
			cap_moment.create_mentiondone();
			Thread.sleep(5000);
			cap_moment.create_locationclick();
			Thread.sleep(5000);
			cap_moment.create_locationsearch();
			Thread.sleep(5000);
			cap_moment.create_locationselect();
			Thread.sleep(5000);
			cap_moment.create_captionclick();
			Thread.sleep(5000);
			cap_moment.private_momentwithoutselfie_caption();
			Thread.sleep(5000);
			cap_moment.create_captiondone();
			Thread.sleep(5000);
			cap_moment.create_momenttypebtn();
			Thread.sleep(5000);
			cap_moment.create_privatemoment();
			Thread.sleep(5000);
			login.Scroll();
			Thread.sleep(5000);
			cap_moment.create_postbutton();
			Thread.sleep(10000);
			cap_moment.create_sharemomentback();
			Thread.sleep(8000);
			driver.closeApp();
}
		
		// close friend moment with selfie
		@Test 
		public void closefriend_moment_withselfie() throws Exception {
			System.out.println("Existing user is going to post closefriend moment with selfie");
			
			cap_moment.create_camera();
            Thread.sleep(5000);
			login.contact_permissionallow();
			Thread.sleep(5000);
			login.contact_permissionallow();
			Thread.sleep(5000);
			cap_moment.create_capture();
			Thread.sleep(9000);
			cap_moment.create_selfiecapture();
			Thread.sleep(9000);
			cap_moment.create_selectcategory();
			Thread.sleep(5000);
			cap_moment.create_mentionclick();
			Thread.sleep(5000);
			/*cap_moment.create_mentionsearch();
			Thread.sleep(5000);
			cap_moment.create_mentionuser();
			Thread.sleep(5000);*/
			cap_moment.create_mentiondone();
			Thread.sleep(5000);
			cap_moment.create_locationclick();
			Thread.sleep(5000);
			cap_moment.create_locationsearch();
			Thread.sleep(5000);
			cap_moment.create_locationselect();
			Thread.sleep(5000);
			cap_moment.create_captionclick();
			Thread.sleep(5000);
			cap_moment.closefriend_moment_withselfie_caption();
			Thread.sleep(5000);
			cap_moment.create_captiondone();
			Thread.sleep(5000);
			cap_moment.create_momenttypebtn();
			Thread.sleep(5000);
			cap_moment.create_closefriendmoment();
			Thread.sleep(5000);
			login.Scroll();
			Thread.sleep(5000);
			cap_moment.create_postbutton();
			Thread.sleep(10000);
			cap_moment.create_sharemomentback();
			Thread.sleep(8000);
			driver.closeApp();
}
		
		// close friend moment without selfie
		@Test 
		public void closefriend_moment_withoutselfie() throws Exception {
			System.out.println("Existing user is going to post closefriend moment without selfie");
			
			cap_moment.create_camera();
            Thread.sleep(5000);
			login.contact_permissionallow();
			Thread.sleep(5000);
			login.contact_permissionallow();
			Thread.sleep(5000);
			cap_moment.create_capture();
			Thread.sleep(9000);
			cap_moment.create_selfieskip();
			Thread.sleep(9000);
			cap_moment.create_selectcategory();
			Thread.sleep(5000);
			cap_moment.create_mentionclick();
			Thread.sleep(5000);
			/*cap_moment.create_mentionsearch();
			Thread.sleep(5000);
			cap_moment.create_mentionuser();
			Thread.sleep(5000);*/
			cap_moment.create_mentiondone();
			Thread.sleep(5000);
			cap_moment.create_locationclick();
			Thread.sleep(5000);
			cap_moment.create_locationsearch();
			Thread.sleep(5000);
			cap_moment.create_locationselect();
			Thread.sleep(5000);
			cap_moment.create_captionclick();
			Thread.sleep(5000);
			cap_moment.closefriend_moment_withoutselfie_caption();
			Thread.sleep(5000);
			cap_moment.create_captiondone();
			Thread.sleep(5000);
			cap_moment.create_momenttypebtn();
			Thread.sleep(5000);
			cap_moment.create_closefriendmoment();
			Thread.sleep(5000);
			login.Scroll();
			Thread.sleep(5000);
			cap_moment.create_postbutton();
			Thread.sleep(10000);
			cap_moment.create_sharemomentback();
			Thread.sleep(8000);
			driver.closeApp();
}
		
//-----------------------------------------------------------------ONGOING MOMENT----------------------------------------------------------------------------------------------------------

		
		// Public Ongoing Image with selfie
		@Test 
		public void publicongoing_moment_withselfie() throws Exception {
			System.out.println("Existing user is going to post public Ongoing moment with selfie");
			
			cap_moment.create_camera();
            Thread.sleep(5000);
			login.contact_permissionallow();
			Thread.sleep(5000);
			login.contact_permissionallow();
			Thread.sleep(5000);
			cap_moment.create_ongoingbtn();
			Thread.sleep(5000);
			cap_moment.create_ongointime();
			Thread.sleep(5000);
			cap_moment.create_capture();
			Thread.sleep(9000);
			cap_moment.create_selfiecapture();
			Thread.sleep(9000);
			cap_moment.create_selectcategory();
			Thread.sleep(5000);
			cap_moment.create_mentionclick();
			Thread.sleep(5000);
			/*cap_moment.create_mentionsearch();
			Thread.sleep(5000);
			cap_moment.create_mentionuser();
			Thread.sleep(5000);*/
			cap_moment.create_mentiondone();
			Thread.sleep(5000);
			cap_moment.create_locationclick();
			Thread.sleep(5000);
			cap_moment.create_locationsearch();
			Thread.sleep(5000);
			cap_moment.create_locationselect();
			Thread.sleep(5000);
			cap_moment.create_captionclick();
			Thread.sleep(5000);
			cap_moment.publicongoing_moment_withselfie_caption();
			Thread.sleep(5000);
			cap_moment.create_captiondone();
			Thread.sleep(5000);
			cap_moment.create_postbutton();
			Thread.sleep(10000);
			cap_moment.create_sharemomentback();
			Thread.sleep(8000);
			driver.closeApp();
}

		// Public Ongoing Image without selfie
		@Test 
		public void publicongoing_moment_withoutselfie() throws Exception {
			System.out.println("Existing user is going to post public Ongoing moment without selfie");
			
			cap_moment.create_camera();
            Thread.sleep(5000);
			login.contact_permissionallow();
			Thread.sleep(5000);
			login.contact_permissionallow();
			Thread.sleep(5000);
			cap_moment.create_ongoingbtn();
			Thread.sleep(5000);
			cap_moment.create_ongointime();
			Thread.sleep(5000);
			cap_moment.create_capture();
			Thread.sleep(9000);
			cap_moment.create_selfieskip();
			Thread.sleep(9000);
			cap_moment.create_selectcategory();
			Thread.sleep(5000);
			cap_moment.create_mentionclick();
			Thread.sleep(5000);
			/*cap_moment.create_mentionsearch();
			Thread.sleep(5000);
			cap_moment.create_mentionuser();
			Thread.sleep(5000);*/
			cap_moment.create_mentiondone();
			Thread.sleep(5000);
			cap_moment.create_locationclick();
			Thread.sleep(5000);
			cap_moment.create_locationsearch();
			Thread.sleep(5000);
			cap_moment.create_locationselect();
			Thread.sleep(5000);
			cap_moment.create_captionclick();
			Thread.sleep(5000);
			cap_moment.public_momentwithoutselfie_caption();
			Thread.sleep(5000);
			cap_moment.create_captiondone();
			Thread.sleep(5000);
			cap_moment.create_postbutton();
			Thread.sleep(10000);
			cap_moment.create_sharemomentback();
			Thread.sleep(8000);
			driver.closeApp();
}
		
		// Private Ongoing Image with selfie
				@Test 
				public void privateongoing_moment_withselfie() throws Exception {
					System.out.println("Existing user is going to post private Ongoing moment with selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_ongoingbtn();
					Thread.sleep(5000);
					cap_moment.create_ongointime();
					Thread.sleep(5000);
					cap_moment.create_capture();
					Thread.sleep(9000);
					cap_moment.create_selfiecapture();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.privateongoing_moment_withselfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_momenttypebtn();
					Thread.sleep(5000);
					cap_moment.create_privatemoment();
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(10000);
					cap_moment.create_sharemomentback();
					Thread.sleep(8000);
					driver.closeApp();
		}

				// Private Ongoing Image without selfie
				@Test 
				public void privateongoing_moment_withoutselfie() throws Exception {
					System.out.println("Existing user is going to post private Ongoing moment without selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_ongoingbtn();
					Thread.sleep(5000);
					cap_moment.create_ongointime();
					Thread.sleep(5000);
					cap_moment.create_capture();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.privateongoing_moment_withoutselfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_momenttypebtn();
					Thread.sleep(5000);
					cap_moment.create_privatemoment();
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(10000);
					cap_moment.create_sharemomentback();
					Thread.sleep(8000);
					driver.closeApp();
}
				
				// Close friend Ongoing Image with selfie
				@Test 
				public void closefriendongoing_moment_withselfie() throws Exception {
					System.out.println("Existing user is going to post close friend Ongoing moment with selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_ongoingbtn();
					Thread.sleep(5000);
					cap_moment.create_ongointime();
					Thread.sleep(5000);
					cap_moment.create_capture();
					Thread.sleep(9000);
					cap_moment.create_selfiecapture();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.closefriendongoing_moment_withselfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_momenttypebtn();
					Thread.sleep(5000);
					cap_moment.create_closefriendmoment();
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(10000);
					cap_moment.create_sharemomentback();
					Thread.sleep(8000);
					driver.closeApp();
		}

				// Close friend Ongoing Image without selfie
				@Test 
				public void closefriendongoing_moment_withoutselfie() throws Exception {
					System.out.println("Existing user is going to post closefriend Ongoing moment without selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_ongoingbtn();
					Thread.sleep(5000);
					cap_moment.create_ongointime();
					Thread.sleep(5000);
					cap_moment.create_capture();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.closefriendongoing_moment_withoutselfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_momenttypebtn();
					Thread.sleep(5000);
					cap_moment.create_closefriendmoment();
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(10000);
					cap_moment.create_sharemomentback();
					Thread.sleep(8000);
					driver.closeApp();
}
				
//-----------------------------------------------------------------CAROUSEL MOMENT----------------------------------------------------------------------------------------------------------
				
				// Public Carousel with selfie
				@Test 
				public void PublicCarousel_with_selfie() throws Exception {
					System.out.println("Existing user is going to post Public Carousel moment with selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_carousel();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.PublicCarousel_with_selfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(10000);
					cap_moment.create_sharemomentback();
					Thread.sleep(8000);
					driver.closeApp();
}
				
				// Public Carousel without selfie
				@Test 
				public void PublicCarousel_without_selfie() throws Exception {
					System.out.println("Existing user is going to post Public Carousel moment without selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_carousel();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.PublicCarousel_without_selfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(10000);
					cap_moment.create_sharemomentback();
					Thread.sleep(8000);
					driver.closeApp();
}
				
				// Private Carousel with selfie
				@Test 
				public void PrivateCarousel_with_selfie() throws Exception {
					System.out.println("Existing user is going to post Private Carousel moment with selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_carousel();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.PrivateCarousel_with_selfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_momenttypebtn();
					Thread.sleep(5000);
					cap_moment.create_privatemoment();
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(10000);
					cap_moment.create_sharemomentback();
					Thread.sleep(8000);
}
				
				// Private Carousel without selfie
				@Test 
				public void PrivateCarousel_without_selfie() throws Exception {
					System.out.println("Existing user is going to post Private Carousel moment without selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_carousel();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.PrivateCarousel_without_selfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_momenttypebtn();
					Thread.sleep(5000);
					cap_moment.create_privatemoment();
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(10000);
					cap_moment.create_sharemomentback();
					Thread.sleep(8000);
}
				
				// Closed Friend Carousel with selfie
				@Test 
				public void ClosefriendCarousel_with_selfie() throws Exception {
					System.out.println("Existing user is going to post Closed Friend Carousel moment with selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_carousel();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.ClosefriendCarousel_with_selfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_momenttypebtn();
					Thread.sleep(5000);
					cap_moment.create_closefriendmoment();;
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(10000);
					cap_moment.create_sharemomentback();
					Thread.sleep(8000);
}
				
				// Closed Friend Carousel without selfie
				@Test 
				public void ClosefriendCarousel_without_selfie() throws Exception {
					System.out.println("Existing user is going to post Close friend Carousel moment without selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_carousel();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.ClosefriendCarousel_without_selfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_closefriendmoment();
					Thread.sleep(5000);
					cap_moment.create_privatemoment();
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(10000);
					cap_moment.create_sharemomentback();
					Thread.sleep(8000);
}
				
//-----------------------------------------------------------------ONGOING CAROUSEL MOMENT----------------------------------------------------------------------------------------------------------

				// Public Ongoing Carousel with selfie
				@Test 
				public void PublicOngoingCarousel_with_selfie() throws Exception {
					System.out.println("Existing user is going to post Public Ongoing Carousel moment with selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_ongoingbtn();
					Thread.sleep(5000);
					cap_moment.create_ongointime();
					Thread.sleep(5000);
					cap_moment.create_carousel();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.PublicOngoingCarousel_with_selfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(10000);
					cap_moment.create_sharemomentback();
					Thread.sleep(8000);
}
				
				// Public Ongoing Carousel without selfie
				@Test 
				public void PublicOngoingCarousel_without_selfie() throws Exception {
					System.out.println("Existing user is going to post Public Ongoing Carousel moment without selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_ongoingbtn();
					Thread.sleep(5000);
					cap_moment.create_ongointime();
					Thread.sleep(5000);
					cap_moment.create_carousel();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.PublicOngoingCarousel_without_selfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(10000);
					cap_moment.create_sharemomentback();
					Thread.sleep(8000);
					driver.closeApp();
}
				
				// Private Ongoing Carousel with selfie
				@Test 
				public void PrivateOngoingCarousel_with_selfie() throws Exception {
					System.out.println("Existing user is going to post Private Ongoing Carousel with selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_ongoingbtn();
					Thread.sleep(5000);
					cap_moment.create_ongointime();
					Thread.sleep(5000);
					cap_moment.create_carousel();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.PrivateOngoingCarousel_with_selfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_momenttypebtn();
					Thread.sleep(5000);
					cap_moment.create_privatemoment();
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(10000);
					cap_moment.create_sharemomentback();
					Thread.sleep(8000);
}
				
				// Private Ongoing Carousel without selfie
				@Test 
				public void PrivateOngoingCarousel_without_selfie() throws Exception {
					System.out.println("Existing user is going to post Private Ongoing Carousel without selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_ongoingbtn();
					Thread.sleep(5000);
					cap_moment.create_ongointime();
					Thread.sleep(5000);
					cap_moment.create_carousel();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.PrivateOngoingCarousel_without_selfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_momenttypebtn();
					Thread.sleep(5000);
					cap_moment.create_privatemoment();
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(10000);
					cap_moment.create_sharemomentback();
					Thread.sleep(8000);
}
				
				// Closed Friend Ongoing Carousel with selfie
				@Test 
				public void ClosefriendOngoingCarousel_with_selfie() throws Exception {
					System.out.println("Existing user is going to post Closed Friend Ongoing Carousel with selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_ongoingbtn();
					Thread.sleep(5000);
					cap_moment.create_ongointime();
					Thread.sleep(5000);
					cap_moment.create_carousel();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.ClosefriendOngoingCarousel_with_selfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_momenttypebtn();
					Thread.sleep(5000);
					cap_moment.create_closefriendmoment();;
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(10000);
					cap_moment.create_sharemomentback();
					Thread.sleep(8000);
}
				
				// Closed Friend Ongoing Carousel without selfie
				@Test 
				public void ClosefriendOngoingCarousel_without_selfie() throws Exception {
					System.out.println("Existing user is going to post Closed Friend Ongoing Carousel without selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_ongoingbtn();
					Thread.sleep(5000);
					cap_moment.create_ongointime();
					Thread.sleep(5000);
					cap_moment.create_carousel();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(5000);
					cap_moment.create_carouselcapturebtn();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.ClosefriendOngoingCarousel_without_selfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_momenttypebtn();
					Thread.sleep(5000);
					cap_moment.create_closefriendmoment();
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(10000);
					cap_moment.create_sharemomentback();
					Thread.sleep(8000);
}
				
//-----------------------------------------------------------------NORMAL VIDEO MOMENTS----------------------------------------------------------------------------------------------------------

				// Public video with selfie
				@Test 
				public void public_video_withselfie() throws Exception {
					System.out.println("Existing user is going to post public video with selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_video();
					Thread.sleep(5000);
					cap_moment.create_capture();
					Thread.sleep(15000);
					cap_moment.create_capture();
					Thread.sleep(15000);
					cap_moment.create_selfiecapture();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.public_video_withselfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(85000);
					cap_moment.create_sharemomentback();
					Thread.sleep(7000);
					driver.closeApp();
		}

				// Public Video without selfie
				@Test 
				public void public_video_withoutselfie() throws Exception {
					System.out.println("Existing user is going to post public Video without selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_video();
					Thread.sleep(5000);
					cap_moment.create_capture();
					Thread.sleep(15000);
					cap_moment.create_capture();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.public_video_withoutselfie();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(85000);
					cap_moment.create_sharemomentback();
					Thread.sleep(7000);
					driver.closeApp();
}
			
				// Private Video with selfie
				@Test 
				public void private_video_withselfie() throws Exception {
					System.out.println("Existing user is going to post Private Video with selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_video();
					Thread.sleep(5000);
					cap_moment.create_capture();
					Thread.sleep(15000);
					cap_moment.create_capture();
					Thread.sleep(15000);
					cap_moment.create_selfiecapture();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.private_video_withselfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_momenttypebtn();
					Thread.sleep(5000);
					cap_moment.create_privatemoment();
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(85000);
					cap_moment.create_sharemomentback();
					Thread.sleep(7000);
					driver.closeApp();
		}

				// Private Video without selfie
				@Test 
				public void private_video_withoutselfie() throws Exception {
					System.out.println("Existing user is going to post Private Video without selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_video();
					Thread.sleep(5000);
					cap_moment.create_capture();
					Thread.sleep(15000);
					cap_moment.create_capture();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.private_video_without_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_momenttypebtn();
					Thread.sleep(5000);
					cap_moment.create_privatemoment();
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(85000);
					cap_moment.create_sharemomentback();
					Thread.sleep(7000);
					driver.closeApp();
}
				
				// Closed Friend Video with selfie
				@Test 
				public void closefriend_video_withselfie() throws Exception {
					System.out.println("Existing user is going to post Closed Friend Video with selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_video();
					Thread.sleep(5000);
					cap_moment.create_capture();
					Thread.sleep(15000);
					cap_moment.create_capture();
					Thread.sleep(15000);
					cap_moment.create_selfiecapture();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.closefriend_video_withselfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_momenttypebtn();
					Thread.sleep(5000);
					cap_moment.create_closefriendmoment();
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(85000);
					cap_moment.create_sharemomentback();
					Thread.sleep(7000);
					driver.closeApp();
		}

				// Closed Friend Video without selfie
				@Test 
				public void closefriend_video_withoutselfie() throws Exception {
					System.out.println("Existing user is going to post Closed Friend Video without selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_video();
					Thread.sleep(5000);
					cap_moment.create_capture();
					Thread.sleep(15000);
					cap_moment.create_capture();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.closefriend_video_withoutselfie();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_momenttypebtn();
					Thread.sleep(5000);
					cap_moment.create_closefriendmoment();
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(85000);
					cap_moment.create_sharemomentback();
					Thread.sleep(7000);
					driver.closeApp();
}
				
//-----------------------------------------------------------------ONGOING VIDEO MOMENTS--------------------------------------------------------------------------------------------------------

				// Public Ongoing Video with selfie
				@Test 
				public void publicOngoing_video_withselfie() throws Exception {
					System.out.println("Existing user is going to post Public Ongoing Video with selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_ongoingbtn();
					Thread.sleep(5000);
					cap_moment.create_ongointime();
					Thread.sleep(5000);
					cap_moment.create_video();
					Thread.sleep(5000);
					cap_moment.create_capture();
					Thread.sleep(15000);
					cap_moment.create_capture();
					Thread.sleep(15000);
					cap_moment.create_selfiecapture();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.publicOngoing_video_withselfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(85000);
					cap_moment.create_sharemomentback();
					Thread.sleep(7000);
					driver.closeApp();
		}

				// Public Ongoing Video without selfie
				@Test 
				public void publicOngoing_video_withoutselfie() throws Exception {
					System.out.println("Existing user is going to post Public Ongoing Video without selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_ongoingbtn();
					Thread.sleep(5000);
					cap_moment.create_ongointime();
					Thread.sleep(5000);
					cap_moment.create_video();
					Thread.sleep(5000);
					cap_moment.create_capture();
					Thread.sleep(15000);
					cap_moment.create_capture();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.publicOngoing_video_withoutselfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(85000);
					cap_moment.create_sharemomentback();
					Thread.sleep(7000);
					driver.closeApp();
}
				
				// Private Ongoing Video with selfie
				@Test 
				public void privateOngoing_video_withselfie() throws Exception {
					System.out.println("Existing user is going to post Private Ongoing Video with selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_ongoingbtn();
					Thread.sleep(5000);
					cap_moment.create_ongointime();
					Thread.sleep(5000);
					cap_moment.create_video();
					Thread.sleep(5000);
					cap_moment.create_capture();
					Thread.sleep(15000);
					cap_moment.create_capture();
					Thread.sleep(15000);
					cap_moment.create_selfiecapture();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.privateOngoing_video_withselfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_momenttypebtn();
					Thread.sleep(5000);
					cap_moment.create_privatemoment();
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(85000);
					cap_moment.create_sharemomentback();
					Thread.sleep(7000);
					driver.closeApp();
		}

				// Private Ongoing Video with selfie
				@Test 
				public void privateOngoing_video_withoutselfie() throws Exception {
					System.out.println("Existing user is going to post Private Ongoing Video with selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_ongoingbtn();
					Thread.sleep(5000);
					cap_moment.create_ongointime();
					Thread.sleep(5000);
					cap_moment.create_video();
					Thread.sleep(5000);
					cap_moment.create_capture();
					Thread.sleep(15000);
					cap_moment.create_capture();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.privateOngoing_video_withoutselfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_momenttypebtn();
					Thread.sleep(5000);
					cap_moment.create_privatemoment();
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(85000);
					cap_moment.create_sharemomentback();
					Thread.sleep(15000);
					driver.closeApp();
}
				
				// Closed Friend Ongoing Video with selfie
				@Test 
				public void closefriendOngoing_video_withselfie() throws Exception {
					System.out.println("Existing user is going to post Closed Friend Ongoing Video with selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_ongoingbtn();
					Thread.sleep(5000);
					cap_moment.create_ongointime();
					Thread.sleep(5000);
					cap_moment.create_video();
					Thread.sleep(5000);
					cap_moment.create_capture();
					Thread.sleep(15000);
					cap_moment.create_capture();
					Thread.sleep(15000);
					cap_moment.create_selfiecapture();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.closefriendOngoing_video_withselfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_momenttypebtn();
					Thread.sleep(5000);
					cap_moment.create_closefriendmoment();
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(85000);
					cap_moment.create_sharemomentback();
					Thread.sleep(15000);
					driver.closeApp();
		}

				// Closed Friend Ongoing Video without selfie
				@Test 
				public void closefriendOngoing_video_withoutselfie() throws Exception {
					System.out.println("Existing user is going to post Closed Friend Ongoing Video without selfie");
					
					cap_moment.create_camera();
		            Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					login.contact_permissionallow();
					Thread.sleep(5000);
					cap_moment.create_ongoingbtn();
					Thread.sleep(5000);
					cap_moment.create_ongointime();
					Thread.sleep(5000);
					cap_moment.create_video();
					Thread.sleep(5000);
					cap_moment.create_capture();
					Thread.sleep(15000);
					cap_moment.create_capture();
					Thread.sleep(9000);
					cap_moment.create_selfieskip();
					Thread.sleep(9000);
					cap_moment.create_selectcategory();
					Thread.sleep(5000);
					cap_moment.create_mentionclick();
					Thread.sleep(5000);
					/*cap_moment.create_mentionsearch();
					Thread.sleep(5000);
					cap_moment.create_mentionuser();
					Thread.sleep(5000);*/
					cap_moment.create_mentiondone();
					Thread.sleep(5000);
					cap_moment.create_locationclick();
					Thread.sleep(5000);
					cap_moment.create_locationsearch();
					Thread.sleep(5000);
					cap_moment.create_locationselect();
					Thread.sleep(5000);
					cap_moment.create_captionclick();
					Thread.sleep(5000);
					cap_moment.closefriendOngoing_video_withoutselfie_caption();
					Thread.sleep(5000);
					cap_moment.create_captiondone();
					Thread.sleep(5000);
					cap_moment.create_momenttypebtn();
					Thread.sleep(5000);
					cap_moment.create_closefriendmoment();
					Thread.sleep(5000);
					login.Scroll();
					Thread.sleep(5000);
					cap_moment.create_postbutton();
					Thread.sleep(85000);
					cap_moment.create_sharemomentback();
					Thread.sleep(15000);
					driver.closeApp();
}
}



