
package Mavenprojecttest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Autoapk {
	
	public static AndroidDriver driver;
	
	    public static void main(String[] args) throws MalformedURLException {
	        DesiredCapabilities dc = new DesiredCapabilities();

	        // Set Appium automation name, platform name, platform version, and device name
	        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
	        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "4.65  720p (Galaxy Nexus) API 28");

	        // Enable auto-granting of permissions
	        dc.setCapability("autoGrantPermissions", true);

	        
	        // Specify the URL of the Appium server (replace with your server URL)
	        URL serverURL = new URL("http://0.0.0.0:4723/wd/hub");

	        // Create an AndroidDriver instance with the specified capabilities
	        AndroidDriver driver = new AndroidDriver(serverURL, dc);

	        // Print a message to confirm that the Appium session has started
	        System.out.println("Appium session started successfully");
	        
	     // Set the path to your APK file
	        String apkURL = "https://dev.agilecyber.com/_apk/mythings/app-armeabi-v7a-release.apk";
	       
	      
	        // Set the path to the downloaded APK file
	        dc.setCapability(MobileCapabilityType.APP, apkURL);
	        System.out.println("Apk Run Successfully");
	    }

	        // Now, you can perform mobile app testing using the specified APK file.

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

	    }
