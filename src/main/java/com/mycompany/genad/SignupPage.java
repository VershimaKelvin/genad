
package com.mycompany.genad;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;

/**
 *
 * @author USER
 */
public class SignupPage {
    
    private final Page page;
    
    public SignupPage(Page page) {
        this.page = page;
    }
    
     public void navigateToSignUp() {
        page.navigate("https://genz.ad/");
        page.locator("text='Sign up'").click();
    }
    
    
    public void clickGoogleSignup() {
        page.locator("text='Sign up with Google'").click();
    }
    
    public boolean isSignedUpIn() {
        return page.locator("#logout-btn").isVisible();
    }
    
    public void handleGoogleSignUp(String email, String password){
      page.locator("input[name='identifier']").fill(email);
    page.locator("text='Next'").click();

    // Wait for the password input to appear
    try {
        page.locator("input[name='Passwd']").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        page.locator("input[name='Passwd']").fill(password);  
        page.locator("text='Next'").click();
        
        
    } catch (Exception e) {
        // If password field doesn't appear, handle "Captcha" 
        if (page.locator("text='Try again'").isVisible()) {
            
            //Come back and handle captcha here
        } 
        else {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
  }
      
      
}
