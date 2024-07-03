package pages;

import pageObject.CreateMomentElements;
import pageObject.LoginPageElements;
import utils.ElementFetch;

public class CreateMomentEvent {

	
	
	public void create_camera() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_camera).click();
	}
	
	public void create_capture() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_capture).click();
	}
	
	
	public void create_flipcamera() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_flipcamera).click();
	}
	
	public void create_flashicon() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_flashicon).click();
	}
	
	public void create_carousel() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_carousel).click();
	}
	
	public void create_carouselcapturebtn() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_carouselcapturebtn).click();
	}
	
	public void create_video() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_video).click();
	}
	
	public void create_ongoingbtn() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_ongoingbtn).click();
	}
	
	public void create_ongointime() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("XPATH", CreateMomentElements.create_ongointime).click();
	}
	
	public void create_selfiecapture() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_selfiecapture).click();
	}
	
	public void create_selfieskip() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_selfieskip).click();
	}
	
	public void create_selfiebackbtn() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_selfiebackbtn).click();
	}
	
	public void create_selectcategory() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_selectcategory).click();
	}
	
	public void create_prevongoingvoid() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_prevongoing).click();
	}
	
	public void create_editcategory() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("XPATH", CreateMomentElements.create_editcategory).click();
	}
	
	public void create_retakeicon() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_retakeicon).click();
	}
	
	public void create_retakeback() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_retakeback).click();
	}
	
	public void create_retakeselfie() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_retakeselfie).click();
	}
	
	public void create_prevbackbtn() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_prevbackbtn).click();
	}
	
	public void create_discardbtn() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_discardbtn).click();
	}
	
	public void create_cancelbtn() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_cancelbtn).click();
	}
	
	public void create_downloadprev() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_downloadprev).click();
	}
	
	public void create_mentionclick() throws Exception {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_mentionclick).click();
		Thread.sleep(5000);
		CreateMomentElements.getMentionedUsersList();
	}
	
	/*public void create_mentionsearch() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_mentionsearch).sendKeys("sagar");
	}
	
	public void create_mentionuser() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_mentionuser).click();
	}*/
	
	public void create_mentiondone() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_mentiondone).click();
	}
	
	public void create_locationclick() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_locationclick).click();
	}
	
	public void create_locationsearch() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_locationsearch).sendKeys("Currently");;
	}
	
	public void create_locationselect() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_locationselect).click();
	}
	
	public void create_captionclick() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_captionclick).click();
	}
	
//-----------------------------------------------------------------NORMAL IMAGE MOMENTS----------------------------------------------------------------------------------------------------------

	
	public void public_momentwithselfie_caption() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Public moment with selfie caption.");
	}
	
	public void public_momentwithoutselfie_caption() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Public moment without selfie caption.");
	}
	
	public void private_momentwithselfie_caption() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Private moment with selfie caption.");
	}
	
	public void private_momentwithoutselfie_caption() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Private moment without selfie caption.");
	}
	
	public void closefriend_moment_withselfie_caption() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Close friend moment with selfie caption.");
	}
	
	public void closefriend_moment_withoutselfie_caption() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Close friend moment without selfie caption.");
	}
	
//-----------------------------------------------------------------ONGOING MOMENTS----------------------------------------------------------------------------------------------------------

	
	public void publicongoing_moment_withselfie_caption() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Public Ongoing moment with selfie caption.");
	}
	
	public void publicongoing_moment_withoutselfie_caption() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Public Ongoing moment without selfie caption.");
	}
	
	public void privateongoing_moment_withselfie_caption() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Private Ongoing moment with selfie caption.");
	}
	
	public void privateongoing_moment_withoutselfie_caption() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Private Ongoing moment without selfie caption.");
	}
	
	public void closefriendongoing_moment_withselfie_caption() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Close friend Ongoing moment with selfie caption.");
	}
	
	public void closefriendongoing_moment_withoutselfie_caption() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Close friend Ongoing moment without selfie caption.");
	}
	
//-----------------------------------------------------------------CAROUSEL MOMENT----------------------------------------------------------------------------------------------------------

		public void PublicCarousel_with_selfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Public Carousel with selfie caption.");
		}
		
		public void PublicCarousel_without_selfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Public Carousel without selfie caption.");
		}
		
		public void PrivateCarousel_with_selfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Private Carousel with selfie caption.");
		}
		
		public void PrivateCarousel_without_selfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Private Carousel without selfie caption.");
		}
		
		public void ClosefriendCarousel_with_selfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Close friend Carousel with selfie caption.");
		}
		
		public void ClosefriendCarousel_without_selfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Close friend Carousel without selfie caption.");
		}
		
//-----------------------------------------------------------------ONGOING CAROUSEL MOMENT----------------------------------------------------------------------------------------------------------

		public void PublicOngoingCarousel_with_selfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Public Ongoing Carousel with selfie caption.");
		}
		
		public void PublicOngoingCarousel_without_selfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Public Ongoing Carousel without selfie caption.");
		}
		
		public void PrivateOngoingCarousel_with_selfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Private Ongoing Carousel with selfie caption.");
		}
		
		public void PrivateOngoingCarousel_without_selfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Private Ongoing Carousel without selfie caption.");
		}
		
		public void ClosefriendOngoingCarousel_with_selfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Close friend Ongoing Carousel with selfie caption.");
		}
		
		public void ClosefriendOngoingCarousel_without_selfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Close friend Ongoing Carousel without selfie caption.");
		}
		
//-----------------------------------------------------------------NORMAL VIDEO MOMENTS----------------------------------------------------------------------------------------------------------

		public void public_video_withselfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Public Video with selfie caption.");
		}
		
		public void public_video_withoutselfie() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Public Video without selfie caption.");
		}
		
		public void private_video_withselfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Private Video with selfie caption.");
		}
		
		public void private_video_without_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Private Video without selfie caption.");
		}
		
		public void closefriend_video_withselfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Close Friend Video with selfie caption.");
		}
		
		public void closefriend_video_withoutselfie() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Close Friend Video without selfie caption.");
		}
		
//-----------------------------------------------------------------ONGOING VIDEO MOMENTS--------------------------------------------------------------------------------------------------------
	
		public void publicOngoing_video_withselfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Public Ongoing Video with selfie caption.");
		}
		
		public void publicOngoing_video_withoutselfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Public Ongoing Video without selfie caption.");
		}
		
		public void privateOngoing_video_withselfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Private Ongoing Video with selfie caption.");
		}
		
		public void privateOngoing_video_withoutselfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Private Ongoing Video without selfie caption.");
		}
		
		public void closefriendOngoing_video_withselfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Close Friend Ongoing Video with selfie caption.");
		}
		
		public void closefriendOngoing_video_withoutselfie_caption() {
			ElementFetch elementFetch=new ElementFetch();
			elementFetch.getWebElement("ID", CreateMomentElements.create_captionwrite).sendKeys("#automation Close Friend Ongoing Video without selfie caption.");
		}
	
			   
//-------------------------------------------------------------- OTHER METHODS ------------------------------------------------------------------------------------------------------------------
		
		
	public void create_captiondone() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_captiondone).click();
	}
	
	public void create_momenttypebtn() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_momenttypebtn).click();
	}
	
	public void create_publicmoment() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("XPATH", CreateMomentElements.create_publicmoment).click();
	}
	
	public void create_privatemoment() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("XPATH", CreateMomentElements.create_privatemoment).click();
	}
	
	public void create_closefriendmoment() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("XPATH", CreateMomentElements.create_closefriendmoment).click();
	}
	
	public void create_editclosefriend() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("XPATH", CreateMomentElements.create_editclosefriend).click();
	}
	
	public void create_closebottomsheet() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_closebottomsheet).click();
	}
	
	public void create_postbutton() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_postbutton).click();
	}
	
	public void create_sharemomentback() {
		ElementFetch elementFetch=new ElementFetch();
		elementFetch.getWebElement("ID", CreateMomentElements.create_sharemomentback).click();
	
}
	
	
}
