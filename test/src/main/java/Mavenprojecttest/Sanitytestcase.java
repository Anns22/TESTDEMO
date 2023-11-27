package Mavenprojecttest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
public class Sanitytestcase {
	public static AndroidDriver driver;
	public static void login_normal() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();

		 // Set Appium automation name, platform name, platform version, and device name
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "4.65  720p (Galaxy Nexus) API 28");
		dc.setCapability("appPackage", "com.mythings.app");
		dc.setCapability("appActivity", "com.mythings.app.MainActivity");

		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		dc.setCapability(MobileCapabilityType.FULL_RESET, false);
		
		 // Enable auto-granting of permissions
        dc.setCapability("autoGrantPermissions", true);
		
        // Set the path to your APK file
        String apkURL = "https://dev.agilecyber.com/_apk/mythings/app-armeabi-v7a-release.apk";
       
      
        // Set the path to the downloaded APK file
        dc.setCapability(MobileCapabilityType.APP, apkURL);
        System.out.println("Apk Run Successfully");


		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, dc);
		  System.out.println("Appium session started successfully");
	}
	public static void login_Gmail() throws InterruptedException {

		Thread.sleep(25000);
        WebElement Get_Started = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Get Started\"]"));
        Get_Started.click();
        
        Thread.sleep(8000);
        WebElement Continue_Google = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Continue with Google\"]"));
        Continue_Google.click();

        Thread.sleep(11000); 
        WebElement click_gmail = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout"));
        click_gmail.click();

        Thread.sleep(8000);
        WebElement allow_location = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]"));
        allow_location.click();
        
        Thread.sleep(11000);
        WebElement No_thanks = driver.findElement(By.id("android:id/button2"));
        No_thanks.click();
        
        Thread.sleep(1000);
        System.out.println("1. Completed Login with Gmail");
	}
	public static void logout_Gmail() throws InterruptedException {

		Thread.sleep(45000);
		List <WebElement> Profile = driver.findElements(By.className("android.widget.ImageView"));
		System.out.println("     Image view size of home page  " +Profile);
		
		Thread.sleep(4000);
		Profile.get(2).click();
				
		Thread.sleep(4000);
		WebElement Logout = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Log Out\"]"));
		Logout.click();
	
		Thread.sleep(4000);
		WebElement confirm = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
		confirm.click();
		
		Thread.sleep(1000);
        System.out.println("2. Completed Logout the Gmail Account");
	}
	public static void login_with_password() throws InterruptedException {

		 Thread.sleep(7000);
		 WebElement email = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
		 email.click();
		 
		 Thread.sleep(4000);
		 Actions action = new Actions(driver);
		 action.sendKeys(email,"testmobileacs+1@gmail.com").sendKeys(Keys.ENTER).perform();
		 
		 Thread.sleep(4000);
		 WebElement continue1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Continue\"]"));
		 continue1.click();
		 
		 Thread.sleep(4000);
		 WebElement password = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
		 password.click();
		 
		 Thread.sleep(4000);
		 action.sendKeys(password,"Siva@1234").sendKeys(Keys.ENTER).perform();
		 
		 Thread.sleep(4000);
		 WebElement continue2 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Continue\"]"));
		 continue2.click();
		 
		 Thread.sleep(5000);
	     WebElement No_thanks = driver.findElement(By.id("android:id/button2"));
	     No_thanks.click();
	
	     Thread.sleep(1000);
	     System.out.println("3. Completed Login with Email and password");
	}
	public static void create_Project_Construction() throws InterruptedException {

		Thread.sleep(35000);
		WebElement Plus_button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
		Plus_button.click();		
		Thread.sleep(4000);
		WebElement Create_Project = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[4]"));
		Create_Project.click();
		Thread.sleep(4000);
		WebElement Construction = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"));
		Construction.click();
		Thread.sleep(4000);
		WebElement Project_Name = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
		Project_Name.click();
		Thread.sleep(2000);
		Project_Name.sendKeys("Project Construction");
		KeyEvent keyEvent = new KeyEvent(AndroidKey.ENTER);
        driver.pressKey(keyEvent);
        Thread.sleep(4000);
		WebElement Create = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Create Project\"]"));
		Create.click();
		Thread.sleep(4000);
		WebElement done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
		done.click();
		Thread.sleep(4000);
		List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
		int size2 = imageview.size();
		     System.out.println("     Image view size of home page  " +size2);
		Thread.sleep(4000);
		     System.out.println("4. Completed Create project in Construction Category");
		Thread.sleep(5000);
		int resize =size2-2;
		imageview.get(resize).click();
		Thread.sleep(5000);
		int resize1 =size2-5;
		imageview.get(resize1).click();
	
	}
	public static void Create_project_Events() throws InterruptedException {
		
		Thread.sleep(8000);
		WebElement Plus_button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
		Plus_button.click();		
		Thread.sleep(4000);
		WebElement Create_Project = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[4]"));
		Create_Project.click();
		Thread.sleep(4000);
		WebElement events = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]"));
		events.click();
		Thread.sleep(4000);
		WebElement Project_Name = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
		Project_Name.click();
		Thread.sleep(2000);
		Project_Name.sendKeys("Project Events");
		KeyEvent keyEvent = new KeyEvent(AndroidKey.ENTER);
        driver.pressKey(keyEvent);
        Thread.sleep(4000);
		WebElement Create = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Create Project\"]"));
		Create.click();		
		Thread.sleep(4000);
		WebElement done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
		done.click();
		Thread.sleep(4000);
		List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
		int size2 = imageview.size();
		     System.out.println("     Image view size of home page  "+size2);
		Thread.sleep(4000);
		     System.out.println("5. Completed Create project in Events Category");
		Thread.sleep(5000);
		int resize =size2-2;
		imageview.get(resize).click();
		Thread.sleep(5000);
		int resize1 =size2-5;
		imageview.get(resize1).click();
			
	}
	public static void Create_project_Travel() throws InterruptedException {

		Thread.sleep(8000);
		WebElement Plus_button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
		Plus_button.click();
		Thread.sleep(4000);
		WebElement Create_Project = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[4]"));
		Create_Project.click();
		Thread.sleep(4000);
		WebElement Travel = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]"));
		Travel.click();
		Thread.sleep(4000);
		WebElement Project_Name = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
		Project_Name.click();
		Thread.sleep(2000);
		Project_Name.sendKeys("Project Travel");
		KeyEvent keyEvent = new KeyEvent(AndroidKey.ENTER);
        driver.pressKey(keyEvent);
        Thread.sleep(4000);
		WebElement Create = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Create Project\"]"));
		Create.click();
		Thread.sleep(4000);
		WebElement done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
		done.click();
		Thread.sleep(4000);
		List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
		int size2 = imageview.size();
		     System.out.println("     Image view size of home page  "+size2);
		Thread.sleep(4000);
		     System.out.println("6. Completed Create project in Travel Category");
		Thread.sleep(5000);
		int resize =size2-2;
		imageview.get(resize).click();
		Thread.sleep(5000);
		int resize1 =size2-5;
		imageview.get(resize1).click();
		
		
	}
	
	public static void Create_project_work() throws InterruptedException {

		Thread.sleep(8000);
		WebElement Plus_button = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
		Plus_button.click();
		Thread.sleep(4000);
		WebElement Create_Project = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[4]"));
		Create_Project.click();
		Thread.sleep(4000);
		WebElement work = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]"));
		work.click();
		Thread.sleep(4000);
		WebElement Project_Name = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
		Project_Name.click();
		Thread.sleep(2000);
		Project_Name.sendKeys("Project Work");
		KeyEvent keyEvent = new KeyEvent(AndroidKey.ENTER);
        driver.pressKey(keyEvent);
        Thread.sleep(4000);
		WebElement Create = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Create Project\"]"));
		Create.click();		
		Thread.sleep(4000);
		WebElement done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
		done.click();	
		Thread.sleep(4000);
		List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
		int size2 = imageview.size();
		     System.out.println("     Image view size of home page  "+size2);
		     Thread.sleep(4000);
		     System.out.println("7. Completed Create project in Work Category");
		Thread.sleep(5000);
		int resize =size2-2;
		imageview.get(resize).click();
		Thread.sleep(5000);
		int resize1 =size2-5;
		imageview.get(resize1).click();
		
	}
	public static void Create_project_Item() throws InterruptedException {

		Thread.sleep(8000);
		WebElement Plus_button = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
		Plus_button.click();
		Thread.sleep(4000);
		WebElement Create_Project = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[4]"));
		Create_Project.click();
		Thread.sleep(4000);
		WebElement item = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]"));
		item.click();
		Thread.sleep(4000);
		WebElement Project_Name = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
		Project_Name.click();
		Thread.sleep(2000);
		Project_Name.sendKeys("Project Item");
		KeyEvent keyEvent = new KeyEvent(AndroidKey.ENTER);
        driver.pressKey(keyEvent);
        Thread.sleep(4000);
		WebElement Create = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Create Project\"]"));
		Create.click();
		Thread.sleep(4000);
		WebElement done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
		done.click();	
		Thread.sleep(4000);
		List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
		int size2 = imageview.size();
		     System.out.println("     Image view size of home page  "+size2);
		Thread.sleep(4000);
		     System.out.println("8. Completed Create project in Item Category");
		Thread.sleep(5000);
		int resize =size2-2;
		imageview.get(resize).click();
		Thread.sleep(5000);
		int resize1 =size2-5;
		imageview.get(resize1).click();
		
		
		
	}
	   public static void Create_project_Custom_NEW_CATEGORY() throws InterruptedException {

		    Thread.sleep(8000);
			WebElement Plus_button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			Plus_button.click();			
			Thread.sleep(4000);
			WebElement Create_Project = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[4]"));
			Create_Project.click();
			Thread.sleep(4000);
			WebElement Custom = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[6]"));
			Custom.click();
			Thread.sleep(4000);
			WebElement New_Category = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"New category\"]"));
			New_Category.click();
			Thread.sleep(5000);			
			List<WebElement> Category_Name = driver.findElements(By.className("android.widget.EditText"));
			System.out.println("     Size of Category page   " + Category_Name.size());
			Thread.sleep(5000);
			Actions action = new Actions(driver);
			action.sendKeys(Category_Name.get(0), "New").sendKeys(Keys.ENTER).perform();			
	        Thread.sleep(5000);
	        Category_Name.get(1).sendKeys("Description");
//	        KeyEvent keyEvent = new KeyEvent(AndroidKey.ENTER);
//	        driver.pressKey(keyEvent);
	        Thread.sleep(5000);
			WebElement add_category = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Add Category\"]"));
			add_category.click();
			Thread.sleep(4000);
			WebElement Project_Name = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
			Project_Name.click();
			Thread.sleep(2000);
			Project_Name.sendKeys("Project Custom New Category");
			KeyEvent keyEvent1 = new KeyEvent(AndroidKey.ENTER);
//          driver.pressKey(keyEvent1);
	        Thread.sleep(4000);
			WebElement Create = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Create Project\"]"));
			Create.click();			
			Thread.sleep(4000);
			WebElement done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
			done.click();		
			Thread.sleep(4000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			     System.out.println("     Image view size of home page  "+size2);
			Thread.sleep(4000);
			     System.out.println("9. Completed Create project in Custom New Category");
			Thread.sleep(5000);
			int resize =size2-2;
			imageview.get(resize).click();
			Thread.sleep(5000);
			int resize1 =size2-5;
			imageview.get(resize1).click();
		   
		   
	}

	   public static void create_Item_Transport() throws InterruptedException {

			Thread.sleep(7000);
		    WebElement Plus_Button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
		    Plus_Button.click();		    
		    Thread.sleep(5000);
		    WebElement Add_Item = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
		    Add_Item.click();
		    Thread.sleep(5000);
		    WebElement Transport = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Select Category\"]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]"));
		    Transport.click();
		    Thread.sleep(5000);
			WebElement Transport_Name = driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Add Item\"])[1]/android.widget.ScrollView/android.widget.EditText[1]"));
			Transport_Name.click();
			Thread.sleep(5000);
			Actions actions = new Actions(driver);
		    actions.sendKeys(Transport_Name, "Van").sendKeys(Keys.ENTER).perform();
		    Thread.sleep(6000); 
		    actions.sendKeys(Transport_Name, "Comfort for travel").perform();
		    Thread.sleep(3500); 
		    List<WebElement> scroll_view = driver.findElements(By.className("android.widget.ScrollView"));
		         System.out.println("     Scroll View of Add Item page  "+scroll_view.size());
		    scroll_view.get(0).click();			
			Thread.sleep(5500);
			WebElement Add_Item1 = driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Add Item\"])[2]"));
			Add_Item1.click();
			Thread.sleep(2000);
			WebElement Done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
			Done.click();			
			
			Thread.sleep(5000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			     System.out.println("     Image view size of home page  "+size2);
			Thread.sleep(5000);
			int resize =size2-4;
			imageview.get(resize).click();
			
			Thread.sleep(5000);
			int resize1=size2-5;
			imageview.get(resize1).click();
			
			Thread.sleep(1500);
			System.out.println("10. Completed create Item in Transport Category");
		
	   }
	   
	   public static void create_Item_Properties() throws InterruptedException {

			Thread.sleep(7000);
		    WebElement Plus_Button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
		    Plus_Button.click();		    
		    Thread.sleep(5000);
		    WebElement Add_Item = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
		    Add_Item.click();
		    Thread.sleep(5000);
		    WebElement  Properties= driver.findElement(By.xpath("//android.view.View[@content-desc=\"Select Category\"]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]"));
		    Properties.click();
		    Thread.sleep(5000);
			WebElement Transport_Name = driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Add Item\"])[1]/android.widget.ScrollView/android.widget.EditText[1]"));
			Transport_Name.click();
			Thread.sleep(3500);
			Actions actions = new Actions(driver);
		    actions.sendKeys(Transport_Name, "Land").sendKeys(Keys.ENTER).perform();
		    Thread.sleep(6000); 
		    actions.sendKeys(Transport_Name, "It is located in chennai ").perform();
		    Thread.sleep(3500); 
		    List<WebElement> scroll_view = driver.findElements(By.className("android.widget.ScrollView"));
		         System.out.println("     Scroll View of Add Item page  "+scroll_view.size());
		    scroll_view.get(0).click();		    
		    Thread.sleep(5500);
			WebElement Add_Item1 = driver.findElement(By.xpath("(//ndroid.view.View[@content-desc=\"Add Item\"])[2]"));
			Add_Item1.click();
			Thread.sleep(5000);
			WebElement Done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
			Done.click();
						
			Thread.sleep(5000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			     System.out.println("     Image view size of home page  "+size2);
			Thread.sleep(5000);
			int resize =size2-4;
			imageview.get(resize).click();
			
			Thread.sleep(5000);
			int resize1=size2-5;
			imageview.get(resize1).click();
		    	
			Thread.sleep(1500);
			System.out.println("11. Completed create Item in Properties Category");
			
		}
	   public static void create_Item_Personal() throws InterruptedException {
			
			Thread.sleep(7000);
		    WebElement Plus_Button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
		    Plus_Button.click();		    
		    Thread.sleep(5000);
		    WebElement Add_Item = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
		    Add_Item.click();
		    Thread.sleep(5000);
		    WebElement  Personal_item= driver.findElement(By.xpath("//android.view.View[@content-desc=\"Select Category\"]/android.view.View[3]/android.view.View/android.view.View/android.view.View[3]"));
		    Personal_item.click();
		    Thread.sleep(5000);
			WebElement Personal_item_Name = driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Add Item\"])[1]/android.widget.ScrollView/android.widget.EditText[1]"));
			Personal_item_Name.click();
			Thread.sleep(3500);
			Actions actions = new Actions(driver);
		    actions.sendKeys(Personal_item_Name, "Ganesh").sendKeys(Keys.ENTER).perform();
		    Thread.sleep(6000); 
		    actions.sendKeys(Personal_item_Name, "He is my brother").perform();
		    Thread.sleep(3500); 
		    List<WebElement> scroll_view = driver.findElements(By.className("android.widget.ScrollView"));
		    System.out.println("     Scroll View of Add Item page  "+scroll_view.size());
		    scroll_view.get(0).click();
		    Thread.sleep(5500);
			WebElement Add_Item1 = driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Addtem\"])[2]"));
			Add_Item1.click();
			Thread.sleep(5000);
			WebElement Done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Don\"]"));
			Done.click();
			
			Thread.sleep(5000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			System.out.println("     Image view size of home page  "+size2);
			Thread.sleep(5000);
			int resize =size2-4;
			imageview.get(resize).click();
			
			Thread.sleep(5000);
			int resize1=size2-5;
			imageview.get(resize1).click();
			
			Thread.sleep(1500);
			System.out.println("12. Completed create Item in Personal Category");
			
		}
	
	   public static void Edit_Item_Transport() throws InterruptedException {

			Thread.sleep(9000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			     System.out.println("     Image view size of home page  "+size2);
			Thread.sleep(7000);
			int resize =size2-4;
			imageview.get(resize).click();
			Thread.sleep(5000);
			
			List <WebElement>transport = driver.findElements(By.className("android.widget.ImageView"));
			     System.out.println("     Image view size of home page  "+transport.size());
			Thread.sleep(5000);
			transport.get(4).click();
			
			Thread.sleep(3000);
			WebElement Select_transport = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/anroid.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[6]/android.view.View/android.view.View"));
			Select_transport.click();
			
			Thread.sleep(3000);
		    WebElement dots = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.wdget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
		    dots.click();
		    Thread.sleep(3000);
		    WebElement edit = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Edit\"]"));
		    edit.click();
			Thread.sleep(7000);
			WebElement  Transport_Item_Name= driver.findElement(By.className("android.widget.EditText"));
	        Transport_Item_Name.click();
		    Thread.sleep(4000); 
			Actions actions = new Actions(driver);
			actions.sendKeys(Transport_Item_Name, "  Edited").sendKeys(Keys.ENTER).perform();
			Thread.sleep(6000); 
			actions.perform();
			Thread.sleep(3500); 
			List<WebElement> scroll_view = driver.findElements(By.className("android.widget.ScrollView"));
			     System.out.println("     Scroll view size of Transport page  " +scroll_view.size());
			scroll_view.get(0).click();
			Thread.sleep(3500); 
			WebElement save = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Save\"]"));
			save.click();
			 
			Thread.sleep(3500);
			driver.navigate().back();
			Thread.sleep(3500);
			driver.navigate().back();
			 
			Thread.sleep(4000);
			List<WebElement> imageview1 = driver.findElements(By.className("android.widget.ImageView"));
			int size3 = imageview1.size();
			Thread.sleep(3500);
			     System.out.println("     Image view size of Home page  "+size3);
			Thread.sleep(5000);
			int resize1 =size3-5;
			Thread.sleep(3500);
			imageview1.get(resize1).click();
			
			Thread.sleep(1500);
			System.out.println("13. Completed Edit Item in Transport Category");
		}
	   
	   public static void Edit_Item_Property() throws InterruptedException {

			Thread.sleep(9000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			     System.out.println("     Image view size of Home page  "+size2);
			Thread.sleep(7000);
			int resize =size2-4;
			imageview.get(resize).click();
			Thread.sleep(5000);
			
			List <WebElement>properties = driver.findElements(By.className("android.widget.ImageView"));
			     System.out.println("     Image view size of Home page  "+properties.size());
			Thread.sleep(5000);
			properties.get(3).click();
			
			Thread.sleep(3000);
			WebElement Select_properties = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[6]/android.view.View/android.view.View"));
			Select_properties.click();
			
			Thread.sleep(3000);
			WebElement dots = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
			dots.click();
			Thread.sleep(3000);
			WebElement edit = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Edit\"]"));
			edit.click();
			Thread.sleep(7000);
			WebElement  Property_Item_Name= driver.findElement(By.className("android.widget.EditText"));
		    Property_Item_Name.click();
			Thread.sleep(4000); 
			Actions actions = new Actions(driver);
			actions.sendKeys(Property_Item_Name, "  Edited").sendKeys(Keys.ENTER).perform();
			Thread.sleep(6000); 
			actions.perform();
			Thread.sleep(3500); 
			List<WebElement> scroll_view = driver.findElements(By.className("android.widget.ScrollView"));
			     System.out.println("     Scroll view size of properties page  "+scroll_view.size());
			scroll_view.get(0).click();
			Thread.sleep(3500); 
			WebElement save = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Save\"]"));
			save.click();
			 
			Thread.sleep(3500);
			driver.navigate().back();
			Thread.sleep(3500);
			driver.navigate().back();
			 
			Thread.sleep(4000);
			List<WebElement> imageview1 = driver.findElements(By.className("android.widget.ImageView"));
			int size3 = imageview1.size();
			Thread.sleep(3500);
			     System.out.println("     Image view size of home page  " +size3);
			Thread.sleep(5000);
			int resize1 =size3-5;
			Thread.sleep(3500);
			imageview1.get(resize1).click();
			
			Thread.sleep(1500);
			System.out.println("14. Completed Edit Item in Properties Category");
			
		}
	   public static void Edit_Item_Personal() throws InterruptedException {

			Thread.sleep(9000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			     System.out.println("     Image view size of Home page  "+size2);
			Thread.sleep(7000);
			int resize =size2-4;
			imageview.get(resize).click();
			Thread.sleep(5000);
			
			List <WebElement>personal = driver.findElements(By.className("android.widget.ImageView"));
			     System.out.println("     Image view size of Home page  "+personal.size());
			Thread.sleep(5000);
			personal.get(5).click();
			
			Thread.sleep(3000);
			WebElement Select_personal = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[6]/android.view.View/android.view.View"));
			Select_personal.click();
			
			Thread.sleep(3000);
			WebElement dots = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
			dots.click();
			Thread.sleep(3000);
			WebElement edit = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Edit\"]"));
			edit.click();
			Thread.sleep(7000);
			WebElement  Personal_Item_Name= driver.findElement(By.className("android.widget.EditText"));
			Personal_Item_Name.click();
			Thread.sleep(4000); 
			Actions actions = new Actions(driver);
			actions.sendKeys(Personal_Item_Name, "  Edited").sendKeys(Keys.ENTER).perform();
			Thread.sleep(6000); 
			actions.perform();
			Thread.sleep(3500); 
			List<WebElement> scroll_view = driver.findElements(By.className("android.widget.ScrollView"));
			     System.out.println("     Scroll view size of Personal page  "+scroll_view.size());
			scroll_view.get(0).click();
			Thread.sleep(3500); 
			WebElement save = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Save\"]"));
			save.click();
			 
			Thread.sleep(3500);
			driver.navigate().back();
			Thread.sleep(3500);
			driver.navigate().back();
			 
			Thread.sleep(4000);
			List<WebElement> imageview1 = driver.findElements(By.className("android.widget.ImageView"));
			int size3 = imageview1.size();
			Thread.sleep(3500);
			     System.out.println("     Image view size of home page  "+size3);
			Thread.sleep(5000);
			int resize1 =size3-5;
			Thread.sleep(3500);
			imageview1.get(resize1).click();
			
			Thread.sleep(1500);
			System.out.println("15. Completed Edit Item in Personal Category");
			
		}
	
	   public static void ADDPEOPLE_Search_People_Invite_CONTACT() throws InterruptedException {

			Thread.sleep(8000);
			WebElement Plus_button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			Plus_button.click();
            Thread.sleep(3000);
			WebElement Add_People_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[5]"));
			Add_People_1.click();
			Thread.sleep(4000);
			WebElement search_people = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"));
			search_people.click();
			Thread.sleep(4000);
			WebElement invite_contact = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Invite Contacts\"]"));
			invite_contact.click();
			Thread.sleep(4000);
			WebElement Allow_contact = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]"));
			Allow_contact.click();
			Thread.sleep(4000);
			List <WebElement> contact = driver.findElements(By.className("android.widget.ImageView"));
			Thread.sleep(2000);
			System.out.println("     Size of contact page  "+contact.size());
			Thread.sleep(2000);
			contact.get(2).click();
//			Thread.sleep(4000);
//			WebElement invite = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"invite \"])[1]"));
//			invite.click();			
//          WebElement send_button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.View[3]"));
			Thread.sleep(10000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().back();
			
			Thread.sleep(1500);
			System.out.println("16. Completed Add People through Search People (Invite Contact)");
			
		}
		public static void ADDPEOPLE_Search_People_Invite_GMAIL() throws InterruptedException {

			Thread.sleep(8000);
			WebElement Plus_button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			Plus_button.click();
            Thread.sleep(2000);
			WebElement Add_People_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[5]"));
			Add_People_1.click();
			Thread.sleep(4000);
			WebElement search_people = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"));
			search_people.click();
			Thread.sleep(4000);
			WebElement Invite_Email = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"inviteviaEmail\"]"));
			Invite_Email.click();
			Thread.sleep(4000);
//			driver.findElement(By.xpath(""))
			WebElement click = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView"));
			click.click();
			Thread.sleep(4000);
			Actions action = new Actions(driver);
			action.sendKeys(click, "s").sendKeys(Keys.ENTER).perform();
			Thread.sleep(7000);
            WebElement comment = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]"));
			comment.click();
			Thread.sleep(4000);
			Actions action1 = new Actions(driver);
			action.sendKeys(comment, "Useful Application").sendKeys(Keys.ENTER).perform();
			Thread.sleep(4000);
			WebElement send = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Send\"]"));
			send.click();
			Thread.sleep(4000);
			WebElement done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
			done.click();
			Thread.sleep(4000);
			driver.navigate().back();
			
			Thread.sleep(1500);
			System.out.println("17. Completed Add People through Search People (Invite Gmail)");
			
		}
	
		public static void ADDPEOPLE_Create_People_Profile_FAMILY() throws InterruptedException {

			Thread.sleep(20000);
			WebElement Plus_button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			Plus_button.click();
            Thread.sleep(2000);
			WebElement Add_People_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[5]"));
			Add_People_1.click();
			Thread.sleep(2000);
			WebElement AddMyPeopleProfile = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]"));
			AddMyPeopleProfile.click();
			Thread.sleep(2000);
			WebElement family = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"));
		    family.click();
		    Thread.sleep(7000);
		    WebElement  Personal_Item_Name= driver.findElement(By.className("android.widget.EditText"));
		    Personal_Item_Name.click();
		    Thread.sleep(4000); 
		    Actions actions = new Actions(driver);
		    actions.sendKeys(Personal_Item_Name, "Add Family People").sendKeys(Keys.ENTER).perform();
		    Thread.sleep(6000); 
		    actions.sendKeys(Personal_Item_Name, "For Family").perform();
		    Thread.sleep(3500); 
		    List<WebElement> scroll_view = driver.findElements(By.className("android.widget.ScrollView"));
		         System.out.println("     Scrollview of add my people family page  "+scroll_view.size());
		    scroll_view.get(0).click();
		    Thread.sleep(4000); 
		    WebElement Add_People = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Add My People\"]"));
		    Add_People.click();
		    Thread.sleep(5000);
			WebElement Done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
			Done.click();
			
			Thread.sleep(5000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			     System.out.println("     Image view size of people  "+size2);
			Thread.sleep(5000);
			int resize =size2-3;
			imageview.get(resize).click();
				
		    Thread.sleep(3000);
			List <WebElement> family1= driver.findElements(By.className("android.widget.ImageView"));
			Thread.sleep(3000);
			     System.out.println("     Image view Size of home page  "+family1.size());
		    Thread.sleep(3000);
			family1.get(3).click();
			Thread.sleep(3000);
			driver.navigate().back();
			int resize1 =size2-5;
			imageview.get(resize1).click();
			
			Thread.sleep(1500);
			System.out.println("18. Completed Add People through Create people profile (Family)");
			
		}
		public static void ADDPEOPLE_Create_People_Profile_FRIENDS() throws InterruptedException {
			
			Thread.sleep(20000);
			WebElement Plus_button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/andrid.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			Plus_button.click();
            Thread.sleep(2000);
			WebElement Add_People_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[5]"));
			Add_People_1.click();
			Thread.sleep(2000);
			WebElement AddMyPeopleProfile = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]"));
			AddMyPeopleProfile.click();
			Thread.sleep(2000);
			WebElement friends = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]"));
		    friends.click();
		    Thread.sleep(7000);
		    WebElement  Personal_Item_Name= driver.findElement(By.className("android.widget.EditText"));
		    Personal_Item_Name.click();
		    Thread.sleep(4000);  
		    Actions actions = new Actions(driver);
		    actions.sendKeys(Personal_Item_Name, "Add Friends People").sendKeys(Keys.ENTER).perform();
		    Thread.sleep(6000); 
		    actions.sendKeys(Personal_Item_Name, "For Friends").perform();
		    Thread.sleep(3500); 
		    List<WebElement> scroll_view = driver.findElements(By.className("android.widget.ScrollView"));
		         System.out.println("     Scrollview of add my people family page  "+scroll_view.size());
		    scroll_view.get(0).click();
		    Thread.sleep(4000); 
		    WebElement Add_People = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Add My People\"]"));
		    Add_People.click();
		    Thread.sleep(5000);
			WebElement Done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
			Done.click();
			Thread.sleep(5000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			     System.out.println("     Image view size of people  "+size2);
			Thread.sleep(5000);
			int resize =size2-3;
			imageview.get(resize).click();
				
			Thread.sleep(3000);
			List <WebElement> friends1= driver.findElements(By.className("android.widget.ImageView"));
			Thread.sleep(3000);
			     System.out.println("     Image view Size of home page  "+friends1.size());
			Thread.sleep(3000);
			friends1.get(4).click();
			Thread.sleep(3000);
			driver.navigate().back();
			int resize1 =size2-5;
			imageview.get(resize1).click();
				
			Thread.sleep(1500);
			System.out.println("19. Completed Add People through Create people profile (Friends)");
			
		}
	
		public static void EDITPEOPLE_Edit_People_Profile_FAMILY() throws InterruptedException {

			Thread.sleep(15000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			     System.out.println("     Image view size of home page  "+size2);
			Thread.sleep(5000);
			int resize =size2-3;
			imageview.get(resize).click();
			Thread.sleep(3000);
			List <WebElement> family1= driver.findElements(By.className("android.widget.ImageView"));
			Thread.sleep(3000);
			     System.out.println("     Image view size of people page "+family1.size());
			Thread.sleep(3000);
			family1.get(3).click();
			Thread.sleep(3000);
			WebElement family = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View[2]"));
			family.click();
			Thread.sleep(3000);
			WebElement dots = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
			dots.click();
			Thread.sleep(3000);
			WebElement edit = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Edit\"]"));
			edit.click();
			Thread.sleep(7000);
			WebElement  Personal_Item_Name= driver.findElement(By.className("android.widget.EditText"));
			Personal_Item_Name.click();
			Thread.sleep(4000); 
			Actions actions = new Actions(driver);
			actions.sendKeys(Personal_Item_Name, "  Edited").sendKeys(Keys.ENTER).perform();
			Thread.sleep(6000); 
			actions.perform();
			Thread.sleep(3500); 
			List<WebElement> scroll_view = driver.findElements(By.className("android.widget.ScrollView"));
			     System.out.println("     Scroll view size of people page  "+scroll_view.size());
			scroll_view.get(0).click();
			Thread.sleep(3500); 
			WebElement save = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Save\"]"));
			save.click();
			 
			Thread.sleep(3500);
			driver.navigate().back();
			Thread.sleep(3500);
			driver.navigate().back();
			
			Thread.sleep(4000);
			List<WebElement> imageview1 = driver.findElements(By.className("android.widget.ImageView"));
			int size3 = imageview1.size();
			Thread.sleep(3500);
			     System.out.println("     Image view size of people page " +size3);
			Thread.sleep(5000);
			int resize1 =size3-5;
			Thread.sleep(3500);
			imageview1.get(resize1).click();
			
			Thread.sleep(1500);
			System.out.println("20. Completed Edit people profile (Family)");
			
		}
		public static void EDITPEOPLE_Edit_People_Profile_FRIENDS() throws InterruptedException {

			Thread.sleep(15000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			     System.out.println("     Image view size of home page  "+size2);
			Thread.sleep(5000);
			int resize =size2-3;
			imageview.get(resize).click();
			Thread.sleep(3000);
			List <WebElement> friends= driver.findElements(By.className("android.widget.ImageView"));
			Thread.sleep(3000);
			     System.out.println("     Image view size of people page "+friends.size());
			Thread.sleep(3000);
			friends.get(4).click();
			Thread.sleep(3000);
			WebElement friends1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View[2]"));
			friends1.click();
			Thread.sleep(3000);
			WebElement dots = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
			dots.click();
			Thread.sleep(3000);
			WebElement edit = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Edit\"]"));
			edit.click();
			Thread.sleep(7000);
			WebElement  Personal_Name= driver.findElement(By.className("android.widget.EditText"));
			Personal_Name.click();
			Thread.sleep(4000); 
			Actions actions = new Actions(driver);
			actions.sendKeys(Personal_Name, "  Edited").sendKeys(Keys.ENTER).perform();
			Thread.sleep(6000); 
			actions.perform();
			Thread.sleep(3500); 
			List<WebElement> scroll_view = driver.findElements(By.className("android.widget.ScrollView"));
			     System.out.println("     Scroll view size of people page  "+scroll_view.size());
			scroll_view.get(0).click();
			Thread.sleep(3500); 
			WebElement save = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Save\"]"));
			save.click();
			 
			Thread.sleep(3500);
			driver.navigate().back();
			Thread.sleep(3500);
			driver.navigate().back();
			
			Thread.sleep(4000);
			List<WebElement> imageview1 = driver.findElements(By.className("android.widget.ImageView"));
			int size3 = imageview1.size();
			Thread.sleep(3500);
			System.out.println("     Image view size of people page " +size3);
			Thread.sleep(5000);
			int resize1 =size3-5;
			Thread.sleep(3500);
			imageview1.get(resize1).click();
			
			Thread.sleep(1500);
			System.out.println("21. Completed Edit people profile (Friends)");
			
		}
	
		public static void ADDPEOPLE_Create_Pet_profile() throws InterruptedException {
			
			Thread.sleep(20000);
			WebElement Plus_button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			Plus_button.click();
			Thread.sleep(2000);
			WebElement Add_People_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[5]"));
			Add_People_1.click();
			Thread.sleep(2000);
			WebElement add = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]"));
			add.click();
			Thread.sleep(2000);
			WebElement name = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Add New Pet\"]/android.widget.ScrollView/android.widget.EditText[1]"));
			name.click();
			Thread.sleep(2000);
			name.sendKeys("baby");
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			WebElement addpeople = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Add New Pet\"]/android.widget.ScrollView"));
			addpeople.click();
			Thread.sleep(2000);
			WebElement addw = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Add Pet\"]"));
			addw.click();
			Thread.sleep(2000);
			WebElement done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
			done.click();
			
			Thread.sleep(15000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			     System.out.println("     image view size of the home page  "+size2);
			Thread.sleep(5000);
			int resize =size2-3;
			imageview.get(resize).click();
			
			Thread.sleep(3000);
			List <WebElement> pet= driver.findElements(By.className("android.widget.ImageView"));
			Thread.sleep(3000);
			System.out.println("     image view size of the pet page  "+pet.size());
			Thread.sleep(3000);
			pet.get(5).click();
			Thread.sleep(3000);
			driver.navigate().back();
			int resize1 =size2-5;
			imageview.get(resize1).click();
			
			Thread.sleep(1500);
			System.out.println("22. Completed Add People through pet profile ");
			
		}
		public static void EDITPEOPLE_Edit_Pet_profile() throws InterruptedException {
			Thread.sleep(15000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			System.out.println("     image view size of home page  "+size2);
			Thread.sleep(5000);
			int resize =size2-3;
			imageview.get(resize).click();
			Thread.sleep(3000);
			List <WebElement> friends= driver.findElements(By.className("android.widget.ImageView"));
			Thread.sleep(3000);
			System.out.println("     Image view size of people page  "+friends.size());
			Thread.sleep(3000);
			friends.get(5).click();
			Thread.sleep(3000);
			WebElement pet = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View"));
			pet.click();
			Thread.sleep(3000);
			WebElement dots = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
			dots.click();
			Thread.sleep(3000);
			WebElement edit = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Edit\"]"));
			edit.click();
		    Thread.sleep(7000);
			WebElement  Pet_Name= driver.findElement(By.className("android.widget.EditText"));
			Pet_Name.click();
			Thread.sleep(4000); 
			Actions actions = new Actions(driver);
			actions.sendKeys(Pet_Name, "  Edited").sendKeys(Keys.ENTER).perform();
			Thread.sleep(6000); 
			actions.perform();
			Thread.sleep(3500); 
			List<WebElement> scroll_view = driver.findElements(By.className("android.widget.ScrollView"));
			System.out.println("     scroll view size of people page  "+scroll_view.size());
			scroll_view.get(0).click();
			Thread.sleep(3500); 
			WebElement save = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Save\"]"));
			save.click();
			 
			Thread.sleep(3500);
			driver.navigate().back();
			Thread.sleep(3500);
			driver.navigate().back();
			 
			Thread.sleep(4000);
			List<WebElement> imageview1 = driver.findElements(By.className("android.widget.ImageView"));
			int size3 = imageview1.size();
			Thread.sleep(3500);
			System.out.println("     Image view size of people page  " +size3);
			Thread.sleep(3000);
			int resize1 =size3-5;
			Thread.sleep(2500);
			imageview1.get(resize1).click();
			
			Thread.sleep(1500);
			System.out.println("23. Completed Edit pet profile");
			
		}
		public static void ADDPEOPLE_Invite_People_invite_CONTACT() throws InterruptedException {

			Thread.sleep(10000);
			WebElement Plus_button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			Plus_button.click();
            Thread.sleep(3000);
			WebElement Add_People_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[5]"));
			Add_People_1.click();
			Thread.sleep(3000);
			WebElement invite_people = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]"));
			invite_people.click();
			Thread.sleep(4000);
			WebElement invite_contact = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"));
			invite_contact.click();
//			driver.findElement(By.xpath(""))
			Thread.sleep(4000);
			List <WebElement> contact = driver.findElements(By.className("android.widget.ImageView"));
			Thread.sleep(2000);
			     System.out.println("     Image view size of contact page  "+contact.size());
			Thread.sleep(2000);
			contact.get(2).click();
//			Thread.sleep(7000);
//			WebElement invite = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"invite \"])[1]"));
//			invite.click();
			Thread.sleep(15000);
			WebElement back = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
			back.click();
//          WebElement send_button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.View[3]"));
		    Thread.sleep(4000);
//          driver.navigate().back();
		    
		    Thread.sleep(1500);
			System.out.println("24. Completed Add people through Invite people (Invite contact)");
		
		}
		public static void ADDPEOPLE_Invite_People_invite_GMAIL() throws InterruptedException {
			
			Thread.sleep(10000);
			WebElement Plus_button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			Plus_button.click();
            Thread.sleep(3000);
			WebElement Add_People_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[5]"));
			Add_People_1.click();
			Thread.sleep(2000);
			WebElement invite_people = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]"));
			invite_people.click();
			Thread.sleep(4000);
			WebElement invite_gmail = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]"));
			invite_gmail.click();
//			driver.findElement(By.xpath(""))
			Thread.sleep(4000);
			WebElement click = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView"));
			click.click();
			Thread.sleep(4000);
			Actions action = new Actions(driver);
			action.sendKeys(click, "s").sendKeys(Keys.ENTER).perform();
			Thread.sleep(7000);
            WebElement comment = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]"));
			comment.click();
			Thread.sleep(4000);
			Actions action1 = new Actions(driver);
			action.sendKeys(comment, "Useful Application").sendKeys(Keys.ENTER).perform();
			Thread.sleep(4000);
			WebElement send = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Send\"]"));
			send.click();
			Thread.sleep(4000);
			WebElement done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
			done.click();
			
			Thread.sleep(1500);
			System.out.println("25. Completed Add people through Invite people (Invite Gmail)");
		
		}
		public static void ADDPEOPLE_Invite_People_invitation_link() throws InterruptedException {
			
			Thread.sleep(20000);
			WebElement Plus_button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			Plus_button.click();
            Thread.sleep(2000);
			WebElement Add_People_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[5]"));
			Add_People_1.click();
            Thread.sleep(2000);
			WebElement invite_people = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Invite People\"]"));
			invite_people.click();
			Thread.sleep(10000);
			WebElement share_invitation = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Share invitation link\"]"));
			share_invitation.click();
            Thread.sleep(10000);
			driver.navigate().back();
			
			Thread.sleep(1500);
			System.out.println("26. Completed Add people through Invite people (Share Invitation Link)");
		
		}
		
		public  static void Create_Task_PERSONAL() throws InterruptedException {

			Thread.sleep(15000);
			WebElement Plus_button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			Plus_button.click();
			Thread.sleep(5000);
			WebElement Create_task = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[3]"));
			Create_task.click();
			Thread.sleep(5000);
			WebElement Personal_Task = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]"));
			Personal_Task.click();
			Thread.sleep(5000);
			List<WebElement> sub1 = driver.findElements(By.className("android.widget.ImageView"));
			int size = sub1.size();
			Thread.sleep(5000);
			sub1.get(0).click();
			Thread.sleep(2000);
			sub1.get(0).sendKeys("Task-1");
			Thread.sleep(2500);
			WebElement Create_Task = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Create\"]"));
			Create_Task.click();
			
			Thread.sleep(4000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			     System.out.println("     Image view size of the home page "+size2);
			Thread.sleep(5000);
			int resize =size2-2;
			imageview.get(resize).click();
			Thread.sleep(5000);
			int resize1 =size2-6;
			imageview.get(resize1).click();
			
			Thread.sleep(1500);
			System.out.println("27. Completed Create Personal Task");
		}
		
		
		public static void Create_Task_Item() throws InterruptedException {

			Thread.sleep(10000);
			WebElement Plus_button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			Plus_button.click();
			Thread.sleep(5000);
			WebElement Create_task = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[3]"));
			Create_task.click();
			Thread.sleep(5000);
			WebElement item_task = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
			item_task.click();
			Thread.sleep(7000);
			List <WebElement> select = driver.findElements(By.className("android.widget.ImageView"));
			     System.out.println("      Image view size of task page  "+select.size());
			Thread.sleep(3000);
			WebElement webElement = select.get(1);
			Thread.sleep(3000);
			webElement.click();
			Thread.sleep(3000);
			WebElement task = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Item Task\"]/android.widget.ScrollView/android.widget.ImageView[1]"));
			task.sendKeys("task in item");
			Thread.sleep(2500);
			WebElement Create_Task = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Create\"]"));
			Create_Task.click();
			
			Thread.sleep(4000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			     System.out.println("     Image view size of the home page "+size2);
			Thread.sleep(5000);
			int resize =size2-2;
			imageview.get(resize).click();
			Thread.sleep(5000);
			int resize1 =size2-6;
			imageview.get(resize1).click();
			
			Thread.sleep(1500);
			System.out.println("28. Completed Create Item Task");
			
		}
		public static void Create_Task_People() throws InterruptedException {
			
			Thread.sleep(15000);
			WebElement Plus_button = driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			Plus_button.click();
			Thread.sleep(5000);
			WebElement Create_task = driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[3]"));
			Create_task.click();
			Thread.sleep(5000);
			WebElement people_task = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[3]"));
			people_task.click();
			Thread.sleep(4000);
		    WebElement select = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View"));
		    select.click();
			Thread.sleep(3000);
			WebElement task = driver.findElement(By.xpath("//android.view.View[@content-desc=\"People Task\"]/android.widget.ScrollView/android.widget.ImageView[1]"));
			task.sendKeys("task in People ");
			Thread.sleep(2500);
			WebElement Create_Task = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Create\"]"));
			Create_Task.click();
			Thread.sleep(4000);
			
			Thread.sleep(4000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			     System.out.println("     Image view size of people task  "+size2);
			Thread.sleep(5000);
			int resize =size2-1;
			imageview.get(resize).click();
			Thread.sleep(5000);
			int resize1 =size2-5;
			imageview.get(resize1).click();
			

			Thread.sleep(1500);
			System.out.println("29. Completed Create People Task");
			
		}
		public static void scrollDown() {
		    String scrollableList = "new UiScrollable(new UiSelector().scrollable(true).instance(0))";
		    String scrollToEnd = ".scrollToEnd(1)";

		    driver.findElement(MobileBy.AndroidUIAutomator(scrollableList + scrollToEnd));
		}

		public static void Create_Task_Project() throws InterruptedException {

			Thread.sleep(10000);
			WebElement Plus_button = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			Plus_button.click();
			Thread.sleep(5000);
			WebElement Create_task = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[3]"));
			Create_task.click();
			Thread.sleep(8000);
			scrollDown();
//	        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "Project Task" + "\").instance(8))"));
            Thread.sleep(5000);
			WebElement project_task = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]"));
			project_task.click();
			Thread.sleep(7000);
			List <WebElement> select = driver.findElements(By.className("android.widget.ImageView"));
			     System.out.println("     Image view size of project page  "+select.size());
			Thread.sleep(3000);
			WebElement webElement = select.get(1);
			Thread.sleep(3000);
			webElement.click();
			Thread.sleep(3000);
			WebElement task = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Project Tasks\"]/android.widget.ScrollView/android.widget.ImageView[1]"));
			task.sendKeys("task in Project");
			Thread.sleep(2500);
			WebElement Create_Task = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Create\"]"));
			Create_Task.click();
			
			Thread.sleep(4000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			     System.out.println("     Image view size of the home page "+size2);
			Thread.sleep(5000);
			int resize =size2-2;
			imageview.get(resize).click();
			Thread.sleep(5000);
			int resize1 =size2-6;
			imageview.get(resize1).click();
//      	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "Search View" + "\").instance(8))"));
//          driver.findElement(new AppiumBy.)

			Thread.sleep(1500);
			System.out.println("30. Completed Create Project Task");
			
		}
		
		public static void Upload_Through_Inbox() throws InterruptedException {

			Thread.sleep(15000);
			WebElement Plus_button2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			Plus_button2.click();
			Thread.sleep(4000);
			WebElement upload_Doc = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Upload Document\"]"));
			upload_Doc.click();			
			Thread.sleep(4000);
			WebElement upload_click = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Upload File\"]"));
			upload_click.click();
			Thread.sleep(4000);
			WebElement lines = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Show roots\"]"));
			lines.click();
			Thread.sleep(4000);
			WebElement downloads = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView"));
			downloads.click();
			Thread.sleep(4000);
			List<WebElement> size = driver.findElements(By.className("android.widget.LinearLayout"));
			size.get(2).click();
			Thread.sleep(4000);
			WebElement upload = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Upload\"]"));
			upload.click();
			
			Thread.sleep(6000);
			List<WebElement> size1 = driver.findElements(By.className("android.view.View"));
			System.out.println(size1.size());
			Thread.sleep(2000);
			size1.get(5).click();
			

			Thread.sleep(2500);
			List<WebElement> Select_inbox = driver.findElements(By.className("android.view.View"));
			System.out.println(Select_inbox.size());
			Thread.sleep(2500);
			Select_inbox.get(1).click();
			
//			Thread.sleep(4000);
//			WebElement select_the_tag = driver.findElement(By.xpath("//android.view.View[@content-desc=\"#ererr\"]"));
//			select_the_tag.click();
			Thread.sleep(4000);
			WebElement upload2 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Upload\"]"));
			upload2.click();
			Thread.sleep(4000);
			WebElement done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
			done.click();
			
			Thread.sleep(5500);
			List<WebElement> findElements = driver.findElements(By.className("android.widget.ImageView"));
			System.out.println(findElements.size());
			Thread.sleep(2500);
			findElements.get(1).click();
			Thread.sleep(2500);
			WebElement continue1= driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Continue\"]"));
			continue1.click();
			Thread.sleep(7500);
			WebElement save_manually = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Save Manually\"]"));
			save_manually.click();
			Thread.sleep(3500);
			WebElement cancel = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Cancel\"]"));
			cancel.click();
			Thread.sleep(3000);
			 
			 
			 WebElement confirm = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			 confirm.click();
			Thread.sleep(3500);
			driver.navigate().back();
			System.out.println("completed upload document through INBOX");
			
			}
		public static void Upload_Through_Item() throws InterruptedException {

			

			Thread.sleep(15000);
			WebElement Plus_button2 = driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			Plus_button2.click();
			Thread.sleep(4000);
			WebElement upload_Doc = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Upload Document\"]"));
			upload_Doc.click();
			
			
			Thread.sleep(4000);
			WebElement upload_click = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Upload File\"]"));
			upload_click.click();
			
			Thread.sleep(4000);
			List<WebElement> Select_Doc = driver.findElements(By.className("android.widget.LinearLayout"));
			Select_Doc.get(2).click();
			Thread.sleep(4000);
			WebElement upload = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Upload\"]"));
			upload.click();
			
			
			
			Thread.sleep(6000);
			List<WebElement> size1 = driver.findElements(By.className("android.view.View"));
			System.out.println("Size of upload file page " + size1.size());
			Thread.sleep(2000);
			size1.get(5).click();
			
			
			Thread.sleep(2500);
			List<WebElement> Select_inbox = driver.findElements(By.className("android.view.View"));
			System.out.println("size of select destination page " + Select_inbox.size());
			Thread.sleep(2500);
			Select_inbox.get(3).click();
			
			
			Thread.sleep(4000);
			List<WebElement> list = driver.findElements(By.className("android.widget.ImageView"));
			System.out.println("size of select items " +list.size());
			Thread.sleep(2500);
			list.get(1).click();
			
			Thread.sleep(4000);
			WebElement New_folder = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Add new folder\"]"));
			New_folder.click();
			
			Thread.sleep(4000);
			List<WebElement> Folder_Name = driver.findElements(By.className("android.widget.EditText"));

			Actions action = new Actions(driver);
		action.sendKeys(Folder_Name.get(0), "Laptop").sendKeys(Keys.ENTER).perform();
				
			
			
			
			
			
			Thread.sleep(15000);
			WebElement Upload = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Upload here\"]"));
			Upload.click();
			
//			Thread.sleep(4000);
//			WebElement select_the_tag = driver.findElement(By.xpath("//android.view.View[@content-desc=\"#ererr\"]"));
//			select_the_tag.click();
			Thread.sleep(4000);
			WebElement upload2 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Upload\"]"));
			upload2.click();
			Thread.sleep(4000);
			WebElement done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
			done.click();
			
			
			Thread.sleep(5000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			Thread.sleep(2000);
			int size10 = imageview.size();
			int a = size10 - 4;
			Thread.sleep(2500);
			imageview.get(a).click();
			
			Thread.sleep(5000);
			List<WebElement> mything_page = driver.findElements(By.className("android.widget.ImageView"));
			System.out.println("Mythings page overall size " +mything_page.size());
			mything_page.get(7).click();
			
			
			Thread.sleep(2500);
			List<WebElement> sss = driver.findElements(By.className("android.view.View"));
			System.out.println(sss.size());
			Thread.sleep(4500);
			sss.get(11).click();
			
			

			Thread.sleep(4500);
			driver.navigate().back();
			
			
			Thread.sleep(2500);
			int b = size10 - 5;
			Thread.sleep(2500);
			imageview.get(b).click();
			
			System.out.println("completed upload documents through add item  ");
			
			
		}
		public static void Upload_Through_People() throws InterruptedException {

			Thread.sleep(15000);
			WebElement Plus_button2 = driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			Plus_button2.click();
			Thread.sleep(4000);
			WebElement upload_Doc = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Upload Document\"]"));
			upload_Doc.click();
			
			
			Thread.sleep(4000);
			WebElement upload_click = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Upload File\"]"));
			upload_click.click();
			
			Thread.sleep(4000);
			List<WebElement> Select_Doc = driver.findElements(By.className("android.widget.LinearLayout"));
			Select_Doc.get(2).click();
			Thread.sleep(4000);
			WebElement upload = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Upload\"]"));
			upload.click();
			
			
			Thread.sleep(6000);
			List<WebElement> size1 = driver.findElements(By.className("android.view.View"));
			System.out.println("Size of upload file page " + size1.size());
			Thread.sleep(2000);
			size1.get(5).click();
			
			Thread.sleep(2500);
			List<WebElement> Select_inbox = driver.findElements(By.className("android.view.View"));
			System.out.println("size of select destination page " + Select_inbox.size());
			Thread.sleep(2500);
			Select_inbox.get(5).click();
			
			Thread.sleep(2500);
			 List<WebElement> Select_People = driver.findElements(By.className("android.widget.ImageView"));
			 System.out.println(Select_People.size());
			 Thread.sleep(2500);
			 Select_People.get(2).click();
			 
			 Thread.sleep(4000);
				WebElement New_folder = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Add new folder\"]"));
				New_folder.click();
				
				Thread.sleep(4000);
				List<WebElement> Folder_Name = driver.findElements(By.className("android.widget.EditText"));
			
				Actions action = new Actions(driver);
			action.sendKeys(Folder_Name.get(0), "Baby").sendKeys(Keys.ENTER).perform();
			
			
			Thread.sleep(10000);
			WebElement Upload = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Upload here\"]"));
			Upload.click();
			
//			Thread.sleep(4000);
//			WebElement select_the_tag = driver.findElement(By.xpath("//android.view.View[@content-desc=\"#ererr\"]"));
//			select_the_tag.click();
			Thread.sleep(4000);
			WebElement upload2 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Upload\"]"));
			upload2.click();
			Thread.sleep(4000);
			WebElement done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
			done.click();
			
			
			Thread.sleep(5000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			Thread.sleep(2000);
			int size10 = imageview.size();
			int a = size10 - 3;
			Thread.sleep(2500);
			imageview.get(a).click();
			
			
			Thread.sleep(4000);
			List <WebElement> family= driver.findElements(By.className("android.widget.ImageView"));
			Thread.sleep(3000);
			System.out.println("     Image view size of people page  "+family.size());
			Thread.sleep(4000);
			family.get(5).click();
			Thread.sleep(5500);
			WebElement selectpeople = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View"));
			selectpeople.click();
			
//			Thread.sleep(2500);
//			List<WebElement> check = driver.findElements(By.className("android.view.View"));
//			System.out.println(check.size());
//			Thread.sleep(2500);
//			check.get(6).click();
			
		Thread.sleep(5500);
			
			List<WebElement> sss = driver.findElements(By.className("android.view.View"));
			System.out.println(sss.size());
			Thread.sleep(4500);
			sss.get(16).click();
			
			
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);
			driver.navigate().back();
			
			
			Thread.sleep(2500);
			int b = size10 - 5;
			Thread.sleep(2500);
			imageview.get(b).click();
			
			System.out.println("completed upload documents through people");
			
			
			
		}
		
		public static void Upload_Through_Project() throws InterruptedException {

			Thread.sleep(15000);
			WebElement Plus_button2 = driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			Plus_button2.click();
			Thread.sleep(4000);
			WebElement upload_Doc = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Upload Document\"]"));
			upload_Doc.click();
			
			
			Thread.sleep(4000);
			WebElement upload_click = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Upload File\"]"));
			upload_click.click();
			
			Thread.sleep(4000);
			List<WebElement> Select_Doc = driver.findElements(By.className("android.widget.LinearLayout"));
			Select_Doc.get(2).click();
			Thread.sleep(4000);
			WebElement upload = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Upload\"]"));
			upload.click();
			
			
			Thread.sleep(6000);
			List<WebElement> size1 = driver.findElements(By.className("android.view.View"));
			System.out.println("Size of upload file page " + size1.size());
			Thread.sleep(2000);
			size1.get(5).click();
			
			
			Thread.sleep(2500);
			List<WebElement> Select_inbox = driver.findElements(By.className("android.view.View"));
			System.out.println("size of select destination page " + Select_inbox.size());
			Thread.sleep(2500);
			Select_inbox.get(7).click();
			
			
			Thread.sleep(2000);
			List<WebElement> list = driver.findElements(By.className("android.widget.ImageView"));
			System.out.println(list.size());
			Thread.sleep(2500);
			list.get(1).click();
			
			
			Thread.sleep(4000);
			WebElement New_folder = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Add new folder\"]"));
			New_folder.click();
			
			Thread.sleep(4000);
			List<WebElement> Folder_Name = driver.findElements(By.className("android.widget.EditText"));

			Actions action = new Actions(driver);
		action.sendKeys(Folder_Name.get(0), "Baby").sendKeys(Keys.ENTER).perform();


		Thread.sleep(10000);
		WebElement Upload = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Upload here\"]"));
		Upload.click();

		//Thread.sleep(4000);
		//WebElement select_the_tag = driver.findElement(By.xpath("//android.view.View[@content-desc=\"#ererr\"]"));
		//select_the_tag.click();
		Thread.sleep(4000);
		WebElement upload2 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Upload\"]"));
		upload2.click();
		Thread.sleep(4000);
		WebElement done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
		done.click();


		Thread.sleep(10000);
		List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
		Thread.sleep(2000);
		int size10 = imageview.size();
		int a = size10 - 2;
		Thread.sleep(4500);
		imageview.get(a).click();
		
//		Thread.sleep(4500);
//		List <WebElement>project = driver.findElements(By.className("android.widget.ImageView"));
//		System.out.println(project.size());
//		Thread.sleep(4500);
//		project.get(4).click();
//		
//		Thread.sleep(4500);
//		List <WebElement>project1 = driver.findElements(By.className("android.widget.ImageView"));
//		System.out.println(project1.size());
//		Thread.sleep(4500);
//		project1.get(6).click();
//		
//		Thread.sleep(4500);
//		List <WebElement>project2 = driver.findElements(By.className("android.widget.ImageView"));
//		System.out.println(project2.size());
//		Thread.sleep(4500);
//		project2.get(6).click();
//		
		Thread.sleep(3500);
		List<WebElement> list1 = driver.findElements(By.className("android.view.View"));
		System.out.println(list1.size());
		Thread.sleep(5000);
		list1.get(3).click();
			
		
		
		Thread.sleep(5000);
		List<WebElement> sss = driver.findElements(By.className("android.view.View"));
		System.out.println(sss.size());
		Thread.sleep(4500);	
		sss.get(25).click();


		Thread.sleep(2500);
		driver.navigate().back();
		Thread.sleep(1500);
		driver.navigate().back();

		Thread.sleep(2500);
		int b = size10 - 5;
		Thread.sleep(2500);
		imageview.get(b).click();

			
			System.out.println("Completed upload document through project ");
//			
//			
			
		}
		
		public static void Upload_Through_Archive() throws InterruptedException {

			Thread.sleep(15000);
			WebElement Plus_button2 = driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			Plus_button2.click();
			Thread.sleep(4000);
			WebElement upload_Doc = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Upload Document\"]"));
			upload_Doc.click();
			
			
			Thread.sleep(4000);
			WebElement upload_click = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Upload File\"]"));
			upload_click.click();
			
			Thread.sleep(4000);
			List<WebElement> Select_Doc = driver.findElements(By.className("android.widget.LinearLayout"));
			Select_Doc.get(2).click();
			Thread.sleep(4000);
			WebElement upload = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Upload\"]"));
			upload.click();
			
			
			Thread.sleep(6000);
			List<WebElement> size1 = driver.findElements(By.className("android.view.View"));
			System.out.println("Size of upload file page " + size1.size());
			Thread.sleep(2000);
			size1.get(5).click();
			
			Thread.sleep(2500);
			List<WebElement> Select_archive = driver.findElements(By.className("android.view.View"));
			System.out.println("size of select destination page " + Select_archive.size());
			Thread.sleep(2500);
			Select_archive.get(9).click();
			
			Thread.sleep(4000);
			WebElement New_folder = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Add new folder\"]"));
			New_folder.click();
			
			Thread.sleep(4000);
			List<WebElement> Folder_Name = driver.findElements(By.className("android.widget.EditText"));

			Actions action = new Actions(driver);
		action.sendKeys(Folder_Name.get(0), "Baby").sendKeys(Keys.ENTER).perform();


		Thread.sleep(15000);
		WebElement Upload = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Upload here\"]"));
		Upload.click();

		//Thread.sleep(4000);
		//WebElement select_the_tag = driver.findElement(By.xpath("//android.view.View[@content-desc=\"#ererr\"]"));
		//select_the_tag.click();
		Thread.sleep(4000);
		WebElement upload2 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Upload\"]"));
		upload2.click();
		Thread.sleep(4000);
		WebElement done = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"));
		done.click();

		Thread.sleep(5000);
		List <WebElement>profile1 = driver.findElements(By.className("android.widget.ImageView"));
		System.out.println(profile1.size());
		Thread.sleep(4000);
		profile1.get(2).click();

		Thread.sleep(4000);
		List<WebElement> llll = driver.findElements(By.className("android.widget.ImageView"));
		System.out.println(llll.size());
		Thread.sleep(3000);
		llll.get(2).click();


		Thread.sleep(3000);
		driver.navigate().back();

		System.out.println("completed upload document through archive ");
			
			
			
			
		}
		
		public static void Delete_Project() throws InterruptedException {

			Thread.sleep(15000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			     System.out.println("     Image view size of home page  "+size2);
			Thread.sleep(5000);
			int resize =size2-2;
			imageview.get(resize).click();
			
			Thread.sleep(5000);
			WebElement construction = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Construction\"]"));
			construction.click();
			Thread.sleep(5000);
			List <WebElement> size  = driver.findElements(By.className("android.widget.ImageView"));
			     System.out.println("     Select the Project CONSTRUCTION  "+size.size());
			Thread.sleep(5000);
			size.get(9).click();
			Thread.sleep(5000);
			WebElement Move_to_Trash = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Move to trash\"]"));
			Move_to_Trash.click();
			Thread.sleep(5000);
			WebElement confirm = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm.click();
			
			Thread.sleep(5000);
			WebElement Events = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Event\"]"));
			Events.click();
			Thread.sleep(5000);
			List <WebElement> size1  = driver.findElements(By.className("android.widget.ImageView"));
			     System.out.println("     Select the Project EVENTS  "+size1.size());
			Thread.sleep(5000);
			size1.get(10).click();
			Thread.sleep(5000);
			WebElement Move_to_Trash1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Move to trash\"]"));
			Move_to_Trash1.click();
			Thread.sleep(5000);
			WebElement confirm1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm1.click();
			
			Thread.sleep(5000);
			WebElement Travel = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Travel\"]"));
			Travel.click();
			Thread.sleep(5000);
			List <WebElement> size3  = driver.findElements(By.className("android.widget.ImageView"));
			     System.out.println("     Select the Project TRAVEL  "+size3.size());
			Thread.sleep(5000);
			size3.get(11).click();
			Thread.sleep(5000);
			WebElement Move_to_Trash3 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Move to trash\"]"));
			Move_to_Trash3.click();
			Thread.sleep(5000);
			WebElement confirm3 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm3.click();
			
			Thread.sleep(5000);
			WebElement Work = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Work\"]"));
			Work.click();
			Thread.sleep(5000);
			List <WebElement> size4  = driver.findElements(By.className("android.widget.ImageView"));
			     System.out.println("     Select the Project WORK  "+size4.size());
			Thread.sleep(5000);
			size4.get(11).click();
			Thread.sleep(5000);
			WebElement Move_to_Trash4 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Move to trash\"]"));
			Move_to_Trash4.click();
			Thread.sleep(5000);
			WebElement confirm4 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm4.click();
			
			Thread.sleep(5000);
			WebElement Item = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Item\"]"));
			Item.click();
			Thread.sleep(5000);
			List <WebElement> size5  = driver.findElements(By.className("android.widget.ImageView"));
			     System.out.println("     Select the Project ITEM  "+size5.size());
			Thread.sleep(5000);
			size5.get(11).click();			
			Thread.sleep(5000);
			WebElement Move_to_Trash5 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Move to trash\"]"));
			Move_to_Trash5.click();			
			Thread.sleep(5000);
			WebElement confirm5 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm5.click();
			
			Thread.sleep(5000);
			WebElement Custom = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Custom\"]"));
			Custom.click();
			Thread.sleep(5000);
			List <WebElement> size6  = driver.findElements(By.className("android.widget.ImageView"));
			     System.out.println("     Select the Project CUSTOM  "+size6.size());
			Thread.sleep(5000);
			size6.get(10).click();
			Thread.sleep(5000);
			WebElement Move_to_Trash6 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Move to trash\"]"));
			Move_to_Trash6.click();
			Thread.sleep(5000);
			WebElement confirm6 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm6.click();
			
			Thread.sleep(5000);
			int resize1=size2-5;
			imageview.get(resize1).click();
			
			Thread.sleep(3000);
			System.out.println("36. Delete All the Projects");
		
		}
	
		public static void Delete_Things() throws InterruptedException {

			Thread.sleep(9000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			System.out.println(size2);
			Thread.sleep(7000);
			int resize =size2-4;
			imageview.get(resize).click();
			Thread.sleep(5000);
			
			List <WebElement>transport = driver.findElements(By.className("android.widget.ImageView"));
			System.out.println(transport.size());
			Thread.sleep(5000);
			transport.get(4).click();
			Thread.sleep(3000);
			WebElement click = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[6]/android.view.View/android.view.View"));
			click.click();
			Thread.sleep(3000);
			WebElement dots = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
		    dots.click();
			Thread.sleep(3000);
			WebElement Move_To_Trash = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Move to trash\"]"));
			Move_To_Trash.click();
			Thread.sleep(3000);
			WebElement confirm = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm.click();
			Thread.sleep(3000);
			Thread.sleep(3500);
			driver.navigate().back();
			 
			Thread.sleep(3500);
			List <WebElement>properties = driver.findElements(By.className("android.widget.ImageView"));
			System.out.println(properties.size());
			Thread.sleep(5000);
			properties.get(3).click();
			Thread.sleep(3000);
			WebElement click1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[6]/android.view.View/android.view.View"));
			click1.click();
			Thread.sleep(3000);
			WebElement dots1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
			dots1.click();
			Thread.sleep(3000);
		    WebElement Move_To_Trash1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Move to trash\"]"));
			Move_To_Trash1.click();
			Thread.sleep(3000);
			WebElement confirm1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm1.click();
			Thread.sleep(3000);
			Thread.sleep(3500);
			driver.navigate().back();
				 
			Thread.sleep(3500);
			List <WebElement>personal = driver.findElements(By.className("android.widget.ImageView"));
			System.out.println(personal.size());
			Thread.sleep(5000);
			personal.get(5).click();
			Thread.sleep(3000);
			WebElement click2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[6]/android.view.View/android.view.View"));
			click2.click();
			Thread.sleep(3000);
			WebElement dots2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
			dots2.click();
			Thread.sleep(3000);
			WebElement Move_To_Trash2 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Move to trash\"]"));
			Move_To_Trash2.click();
			Thread.sleep(3000);
			WebElement confirm2 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm2.click();
			Thread.sleep(3000);
			Thread.sleep(3500);
			driver.navigate().back();
					 
			Thread.sleep(4000);
			List<WebElement> imageview1 = driver.findElements(By.className("android.widget.ImageView"));
			int size3 = imageview1.size();
			Thread.sleep(3500);
			System.out.println("tell" +size3);
			Thread.sleep(5000);
			int resize1 =size3-5;
			Thread.sleep(3500);
			imageview1.get(resize1).click();
			
			Thread.sleep(2000);
			System.out.println("37. Delete All the Things");
					
		}
		
		public static void Delete_People() throws InterruptedException {
			
			Thread.sleep(15000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			System.out.println(size2);
			Thread.sleep(5000);
			int resize =size2-3;
			imageview.get(resize).click();
			
			Thread.sleep(3000);
			List <WebElement> family1= driver.findElements(By.className("android.widget.ImageView"));
			Thread.sleep(3000);
			System.out.println(family1.size());
			Thread.sleep(3000);
			family1.get(3).click();
			Thread.sleep(3000);
			WebElement family = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View[2]"));
			family.click();
			Thread.sleep(3000);
			WebElement dots = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
			dots.click();
			Thread.sleep(3000);
			WebElement Delete = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Move to trash\"]"));
			Delete.click();
			Thread.sleep(3000);
			WebElement confirm = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm.click();
			Thread.sleep(3000);
			driver.navigate().back();
			 
			Thread.sleep(3000);
			List <WebElement> friends= driver.findElements(By.className("android.widget.ImageView"));
			Thread.sleep(3000);
			System.out.println(friends.size());
			Thread.sleep(3000);
			friends.get(4).click();
			Thread.sleep(3000);
			WebElement friends1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View[2]"));
		    friends1.click();
			Thread.sleep(3000);
			WebElement dots1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
			dots1.click();
			Thread.sleep(3000);
			WebElement Delete1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Move to trash\"]"));
			Delete1.click();
			Thread.sleep(3000);
			WebElement confirm1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm1.click();
			Thread.sleep(3000);
			driver.navigate().back();
				 
			Thread.sleep(3000);
			List <WebElement> pet= driver.findElements(By.className("android.widget.ImageView"));
			Thread.sleep(3000);
			System.out.println(pet.size());
			Thread.sleep(3000);
			friends.get(5).click();
			Thread.sleep(3000);
			WebElement pet1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View"));
			pet1.click();
			Thread.sleep(3000);
			WebElement dots2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
			dots2.click();
			Thread.sleep(3000);
			WebElement Delete2 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Move to trash\"]"));
			Delete2.click();
			Thread.sleep(3000);
			WebElement confirm2 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm2.click();
			Thread.sleep(3000);
			driver.navigate().back();
				 
			Thread.sleep(4000);
			List<WebElement> imageview1 = driver.findElements(By.className("android.widget.ImageView"));
			int size3 = imageview1.size();
			Thread.sleep(3500);
			System.out.println("tell" +size3);
			Thread.sleep(5000);
			int resize1 =size3-5;
			Thread.sleep(3500);
			imageview1.get(resize1).click();
			
			Thread.sleep(2000);
			System.out.println("38. Delete All the People");
			
		}
		public static void Edit_Delete_Task() throws InterruptedException {

			Thread.sleep(15000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			     System.out.println("     Image view size of home page  "+size2);
			Thread.sleep(5000);
			int resize =size2-1;
			imageview.get(resize).click();
			
			Thread.sleep(6000);
			WebElement select = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Task-1\"]"));
			select.click();
			Thread.sleep(6000);
			WebElement name = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.EditText[1]"));
			name.click();
			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			actions.sendKeys(name, " edited").sendKeys(Keys.ENTER).perform();
			Thread.sleep(6000);
			WebElement delete = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView"));
			delete.click();
			Thread.sleep(4000);
			WebElement confirm = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm.click();
			
			Thread.sleep(4000);
			List <WebElement> press = driver.findElements(By.className("android.view.View"));
			System.out.println(press.size());
			Thread.sleep(4000);
			press.get(9).click();		
//			Thread.sleep(6000);
//			WebElement select1 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"task in item Camera. Edited\"]"));
//			select1.click();
			Thread.sleep(6000);
			WebElement name1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.EditText[1]"));
			name1.click();
			Thread.sleep(3000);
			Actions actions1 = new Actions(driver);
			actions1.sendKeys(name1, " edited").sendKeys(Keys.ENTER).perform();
			Thread.sleep(6000);
			WebElement delete1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView"));
			delete1.click();
			Thread.sleep(4000);
			WebElement confirm1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm1.click();
			
			Thread.sleep(4000);
			List <WebElement> press1 = driver.findElements(By.className("android.view.View"));
			System.out.println(press1.size());
			Thread.sleep(4000);
			press1.get(9).click();			
//			Thread.sleep(4000);
//			WebElement select2 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"task in People baby. Edited\"]"));
//			select2.click();
			Thread.sleep(6000);
			WebElement name2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.EditText[1]"));
			name2.click();
			Thread.sleep(3000);
			Actions actions2 = new Actions(driver);
			actions2.sendKeys(name2, " edited").sendKeys(Keys.ENTER).perform();
			Thread.sleep(6000);
			WebElement delete2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView"));
			delete2.click();
			Thread.sleep(4000);
			WebElement confirm2 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm2.click();

			Thread.sleep(4000);
			List <WebElement> press2 = driver.findElements(By.className("android.view.View"));
			System.out.println(press2.size());
			Thread.sleep(4000);
			press2.get(8).click();
//			Thread.sleep(4000);
//			WebElement select3 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Task in Project Project Travel\"]"));
//			select3.click();
			Thread.sleep(6000);
			WebElement name3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.EditText[1]"));
			name3.click();
			Thread.sleep(3000);
			Actions actions3 = new Actions(driver);
			actions3.sendKeys(name3, " edited").sendKeys(Keys.ENTER).perform();
			Thread.sleep(6000);
			WebElement delete3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView"));
			delete3.click();
			Thread.sleep(4000);
			WebElement confirm3 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm3.click();
			
			Thread.sleep(5000);
			List<WebElement> imageview1 = driver.findElements(By.className("android.widget.ImageView"));
			int size4 = imageview1.size();
			int resize1 =size4-5;
			imageview1.get(resize1).click();

			Thread.sleep(1500);
			System.out.println("39. Completed Edit and Delete all the Task");
						
		}
		public static void Using_Trash_RestoreAll() throws InterruptedException {

            Thread.sleep(5000);
			List <WebElement>profile = driver.findElements(By.className("android.widget.ImageView"));
			System.out.println(profile.size());
			Thread.sleep(3000);
			profile.get(2).click();
			
			Thread.sleep(3000);
			WebElement Trash = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Trash\"]"));
			Trash.click();
			Thread.sleep(3000);
			WebElement list = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]"));
			list.click();
			Thread.sleep(3000);
			WebElement Three_dots = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
			Three_dots.click();
			Thread.sleep(3000);
			WebElement selectall = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Select all*\"]"));
			selectall.click();
			Thread.sleep(3000);
			WebElement Restoreall = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Restore\"]"));
			Restoreall.click();
			Thread.sleep(3000);
			WebElement confirm = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Confirm\"]"));
			confirm.click();
			Thread.sleep(3000);
			driver.navigate().back();
				 				
			Thread.sleep(1500);
			System.out.println("40. Completed Using Trash RESTORE ALL");
			
		}
		public static void Things_Archive() throws InterruptedException {

			Thread.sleep(15000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			System.out.println(size2);
			Thread.sleep(5000);
			int resize =size2-4;
			imageview.get(resize).click();
			
			Thread.sleep(5000);
			List <WebElement>Things = driver.findElements(By.className("android.widget.ImageView"));
			System.out.println(Things.size());
			Thread.sleep(5000);
			Things.get(7).click();
			Thread.sleep(4000);
			WebElement three_dots = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
			three_dots.click();
			Thread.sleep(4000);
			WebElement Archive = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Archive\"]"));
			Archive.click();
			Thread.sleep(4000);
			WebElement confirm = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm.click();
			
			Thread.sleep(4000);
			List<WebElement> imageview1 = driver.findElements(By.className("android.widget.ImageView"));
			int size3 = imageview1.size();
			Thread.sleep(3500);
			System.out.println("tell" +size3);
			Thread.sleep(5000);
			int resize1 =size3-5;
			Thread.sleep(3500);
			imageview1.get(resize1).click();
			
			Thread.sleep(5000);
			List <WebElement>profile = driver.findElements(By.className("android.widget.ImageView"));
			System.out.println(profile.size());
			Thread.sleep(3000);
			profile.get(2).click();
//			WebElement Profile = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]"));
//			Profile.click();
			Thread.sleep(4000);
			WebElement Archive1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Archive\"]"));
			Archive1.click();
			Thread.sleep(4000);
			driver.navigate().back();
						
		}
		public static void people_Archive() throws InterruptedException {

			Thread.sleep(15000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			System.out.println(size2);
			Thread.sleep(5000);
			int resize =size2-3;
			imageview.get(resize).click();
			
			Thread.sleep(3000);
			List <WebElement> family1= driver.findElements(By.className("android.widget.ImageView"));
			Thread.sleep(3000);
			System.out.println(family1.size());
			Thread.sleep(3000);
			family1.get(3).click();
			Thread.sleep(3000);
			WebElement family = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View[2]"));
			family.click();
			Thread.sleep(3000);
			WebElement three_dots = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
			three_dots.click();
			Thread.sleep(4000);
			WebElement Archive = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Archive\"]"));
			Archive.click();
			Thread.sleep(4000);
			WebElement confirm = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm.click();
			
			Thread.sleep(4000);
			List<WebElement> imageview1 = driver.findElements(By.className("android.widget.ImageView"));
			int size3 = imageview1.size();
			Thread.sleep(3500);
			System.out.println("tell" +size3);
			Thread.sleep(5000);
			int resize1 =size3-6;
			Thread.sleep(3500);
			imageview1.get(resize1).click();
				
			Thread.sleep(9000);
			List <WebElement>profile = driver.findElements(By.className("android.widget.ImageView"));
			System.out.println(profile.size());
			Thread.sleep(6000);
			profile.get(2).click();
//			WebElement Profile = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]"));
//			Profile.click();
			Thread.sleep(4000);
			WebElement Archive1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Archive\"]"));
			Archive1.click();
			Thread.sleep(4000);
			driver.navigate().back();
						
		}
		public static void project_Archive() throws InterruptedException {
			
			Thread.sleep(15000);
			List<WebElement> imageview = driver.findElements(By.className("android.widget.ImageView"));
			int size2 = imageview.size();
			System.out.println(size2);
			Thread.sleep(5000);
			int resize =size2-2;
			imageview.get(resize).click();
						
			Thread.sleep(3000);
			List <WebElement> project = driver.findElements(By.className("android.widget.ImageView"));
			System.out.println(project.size());
			Thread.sleep(3000);
			project.get(9).click();			
//			WebElement project = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View/android.view.View/android.view.View[1]"));
//			project.click();			
			Thread.sleep(5000);
			WebElement three_dots = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]"));
			three_dots.click();
			Thread.sleep(4000);
			WebElement Archive = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Archive\"]"));
			Archive.click();
			Thread.sleep(4000);
			WebElement confirm = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm.click();
			Thread.sleep(4000);
			driver.navigate().back();
			
			Thread.sleep(4000);
			List<WebElement> imageview1 = driver.findElements(By.className("android.widget.ImageView"));
			int size3 = imageview1.size();
			Thread.sleep(3500);
			System.out.println("tell" +size3);
			Thread.sleep(5000);
			int resize1 =size3-5;
			Thread.sleep(3500);
			imageview1.get(resize1).click();
				
			Thread.sleep(5000);
			List <WebElement>profile = driver.findElements(By.className("android.widget.ImageView"));
			System.out.println(profile.size());
			Thread.sleep(4000);
			profile.get(2).click();
//			WebElement Profile = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]"));
//			Profile.click();
			Thread.sleep(4000);
			WebElement Archive1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Archive\"]"));
			Archive1.click();
			Thread.sleep(4000);
			driver.navigate().back();
		
		}
		
		public static void R_B_Archive_Inbox() throws InterruptedException {
			
			Thread.sleep(5000);
			List <WebElement>profile = driver.findElements(By.className("android.widget.ImageView"));
			System.out.println(profile.size());
			Thread.sleep(4000);
			profile.get(2).click();
			Thread.sleep(4000);
			WebElement Archive1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Archive\"]"));
			Archive1.click();
			Thread.sleep(4000);
			List <WebElement>dots = driver.findElements(By.className("android.widget.ImageView"));
			System.out.println(dots.size());
			Thread.sleep(4000);
			dots.get(2).click();
			Thread.sleep(4000);
			WebElement Unarchive = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Unarchive\"]"));
			Unarchive.click();
			Thread.sleep(4000);
			WebElement confirm1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm1.click();
			Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(4000);
			WebElement inbox = driver.findElement(By.xpath("//android.view.View[@content-desc=\"1\"]/android.widget.ImageView[2]"));
			inbox.click();
			Thread.sleep(4000);
			WebElement continue1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Continue\"]"));
			continue1.click();
			Thread.sleep(4000);
			List <WebElement> ssss = driver.findElements(By.className( "android.widget.ImageView"));
			System.out.println(ssss.size());
			Thread.sleep(4000);
			ssss.get(1).click();		
//			WebElement  three_dots2= driver.findElement(By.xpath("//android.view.View[@content-desc=\"transport Restored From archive about an hour ago You've successfully restored this item from archive. Now, select a category to save it. Select category to save the restored item.\"]/android.widget.ImageView[2]"));
//			three_dots2.click();
			Thread.sleep(4000);
			WebElement MoveToTrash = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Move to trash\"]"));
			MoveToTrash.click();
			Thread.sleep(4000);
			WebElement confirm2 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
			confirm2.click();
			Thread.sleep(4000);
			driver.navigate().back();
			
			Thread.sleep(5000);
			List <WebElement>profile1 = driver.findElements(By.className("android.widget.ImageView"));
			System.out.println(profile1.size());
			Thread.sleep(4000);
			profile1.get(2).click();
			Thread.sleep(4000);
			WebElement Trash = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Trash\"]"));
			Trash.click();
			Thread.sleep(3000);
			WebElement dots2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
			dots2.click();
			Thread.sleep(3000);
			WebElement selectall = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Select all*\"]"));
			selectall.click();			
//			WebElement Tick = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.widget.ImageView[2]"));
//			Tick.click();
			Thread.sleep(3000);
			WebElement Delete = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Delete\"]"));
			Delete.click();
			Thread.sleep(3000);
			WebElement DeleteConfirm = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Delete\"]"));
			DeleteConfirm.click();
			Thread.sleep(4000);
			driver.navigate().back();
			 
			Thread.sleep(5000);
			List<WebElement> imageview1 = driver.findElements(By.className("android.widget.ImageView"));
			int size4 = imageview1.size();
			int resize1 =size4-5;
			imageview1.get(resize1).click();
			
		}
		public static void update() throws InterruptedException {

			Thread.sleep(10000);
			WebElement update_MayBeLater = driver
					.findElement(By.xpath("//android.widget.Button[@content-desc=\"Maybe Later\"]"));
			update_MayBeLater.click();
		}
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		login_normal();
		update();
		login_Gmail();
		logout_Gmail();
		login_with_password();
//		                                        CREATE PROJECT
		create_Project_Construction();
		Create_project_Events();
		Create_project_Travel();
		Create_project_work();
		Create_project_Item();
		Create_project_Custom_NEW_CATEGORY();
//		                                        CREATE ITEM
		create_Item_Transport();
		create_Item_Properties();
		create_Item_Personal();
//		                                        EDIT ITEM
		Edit_Item_Transport();
		Edit_Item_Property();
		Edit_Item_Personal();
//		                                        ADD PEOPLE THROUGH SEARCH CAEGORY
		ADDPEOPLE_Search_People_Invite_CONTACT();
		ADDPEOPLE_Search_People_Invite_GMAIL();
//                                                ADD PEOPLE PROFILE		
		ADDPEOPLE_Create_People_Profile_FAMILY();
		ADDPEOPLE_Create_People_Profile_FRIENDS();
//                                                EDIT PEOPLE PROFILE
		EDITPEOPLE_Edit_People_Profile_FAMILY();
		EDITPEOPLE_Edit_People_Profile_FRIENDS();
//                                                ADD and EDIT of PEOPLE PET PROFILE
		ADDPEOPLE_Create_Pet_profile();
		EDITPEOPLE_Edit_Pet_profile();
//                                                ADD PEOPLE THROUGH INVITE PEOPLE
        ADDPEOPLE_Invite_People_invite_CONTACT();
        ADDPEOPLE_Invite_People_invite_GMAIL();
        ADDPEOPLE_Invite_People_invitation_link();
//                                                CREATE TASK		
		Create_Task_PERSONAL();
		Create_Task_Item();
		Create_Task_People();              
		Create_Task_Project();		
//                                                UPLOAD DOCUMENTS
		Upload_Through_Inbox();
		Upload_Through_Item();
		Upload_Through_People();
//  	Upload_Through_Project();
		Upload_Through_Archive();
//                                                DELETE ( PROJRCT , THINGS , PEOPLE , TASK)		
		Delete_Project();
		Delete_Things();
		Delete_People();
        Edit_Delete_Task(); 
//                                                TRASH
		Using_Trash_RestoreAll();
//	                                              Archive	
		Things_Archive();
		people_Archive();
		project_Archive();
//                                                INBOX AND ARCHIVE		
		R_B_Archive_Inbox();
		
        System.out.println("NICE");
	}
}

