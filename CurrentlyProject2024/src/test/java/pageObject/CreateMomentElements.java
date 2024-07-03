package pageObject;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import tests.BaseClass;
import utils.ElementFetch;

public interface CreateMomentElements {

	//create moment
    
	String create_camera="com.currently.android:id/camera_icon";
    String create_capture="com.currently.android:id/capture_button";
    String create_flipcamera="com.currently.android:id/flipCameraView";
    String create_flashicon="com.currently.android:id/cameraFlashView";
    String create_carousel="com.currently.android:id/iv_grid";
    String create_carouselcapturebtn="com.currently.android:id/grid_capture_button";
    String create_video="com.currently.android:id/btn_video";
    String create_ongoingbtn="com.currently.android:id/btn_live_moment";
    String create_ongointime="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.cardview.widget.CardView/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat/android.widget.GridView/androidx.appcompat.widget.LinearLayoutCompat[8]/android.widget.TextView";
    String create_selfiecapture="com.currently.android:id/selfie_clcik_btn";
    String create_selfieskip="com.currently.android:id/tv_skip_selfie";
    String create_selfiebackbtn="com.currently.android:id/iv_back";
    String create_selectcategory="com.currently.android:id/activityImg";
    String create_prevongoing="com.currently.android:id/iv_live_moment";
    String create_editcategory="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup/android.widget.ImageView";
    String create_retakeicon="com.currently.android:id/retake_layout";
    String create_retakeback="com.currently.android:id/tv_retake_back";
    String create_retakeselfie="com.currently.android:id/tv_retake_selfie";
    String create_prevbackbtn="com.currently.android:id/backIcon";
    String create_discardbtn="com.currently.android:id/btn_discard_moment";
    String create_cancelbtn="com.currently.android:id/btn_close";
    String create_downloadprev="com.currently.android:id/btn_download_moment";
    String create_mentionclick="com.currently.android:id/mention_image";
    String create_mentionsearch="com.currently.android:id/enterMobileNoET";
    String create_mentionuser="com.currently.android:id/nameTxt";
    String create_mentiondone="com.currently.android:id/btn_done";
    String create_locationclick="com.currently.android:id/locationImg";
    String create_locationsearch="com.currently.android:id/et_search";
    String create_locationselect="com.currently.android:id/tv_location_name";
    String create_captionclick="com.currently.android:id/tv_caption_preview";
    String create_captionwrite="com.currently.android:id/et_caption";
    String create_captiondone="com.currently.android:id/btn_done";
    String create_momenttypebtn="com.currently.android:id/iv_audiance_icon";
    String create_publicmoment="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.CheckBox";
    String create_privatemoment="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.CheckBox";
    String create_closefriendmoment="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.CheckBox";
    String create_editclosefriend="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.RelativeLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView";
    String create_closebottomsheet="com.currently.android:id/touch_outside";
    String create_postbutton="com.currently.android:id/btn_post_moment";
    String create_sharemomentback="com.currently.android:id/backIcon";
 
   public static void getMentionedUsersList() {
	  try {
		  for (int j = 1; j <= 9; j++) {
	  
	    	BaseClass.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
	    			+ "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
	    			+ "android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"
	    			+ "android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/"
	    			+ "android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/"
	    			+ "androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup["+j+"]/android.view.ViewGroup/"
	    			+ "androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[2]")).click();
	    	
	    }
	  }catch(Exception e){
	    	System.out.println("Test");
	   
   }
   
 
}
}

