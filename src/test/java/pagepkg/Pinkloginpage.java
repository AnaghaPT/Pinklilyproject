package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pinkloginpage {
	   WebDriver driver;

	    // WebElement declarations using @FindBy annotations
	    @FindBy(id="anaghapt1998@gmail.com")
	    WebElement Emailfeild;
	    
	    @FindBy(id="anagha@5123")
	    WebElement Passwordfeild;
	    
	    @FindBy(xpath = "//*[@id=\"LoginHeading\"]")
	    WebElement Loginbutton;
	    
	    // Other WebElements for adding items to cart, checkout, etc.

	    // Constructor to initialize WebDriver and PageFactory
	    public Pinkloginpage(WebDriver driver) {
	        this.driver = driver; 
	        PageFactory.initElements(driver, this);
	    }

	    // Method to enter username and password
	    public void setValues(String email, String pwd) {
	        
	       Emailfeild.sendKeys(email);
	    
	        Passwordfeild.sendKeys(pwd);
	    }

	    // Method to click on the login button
	    public void clickLoginButton() {
	    	Loginbutton.click();
	    }

	    // Additional methods for adding items to cart, clicking cart, checkout, etc.
	}



