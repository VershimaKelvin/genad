package com.mycompany.genad;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;

/**
 *
 * @author USER
 */

public class LoginPage {
    private final Page page;

    // Selectors
    private final String googleLoginButton = "#google-login-btn";

    public LoginPage(Page page) {
        this.page = page;
    }

    public void navigateToLogin() {
        page.navigate("https://genz.ad/");
        page.locator("text='Sign in'").click();
    }

    public void clickGoogleLogin() {
        page.locator("text='Continue with Google'").click();
    }

    public boolean isLoggedIn() {
        return page.locator("#logout-btn").isVisible();
    }

    // Handle Google login
  public void handleGoogleLogin(String email, String password) {
      
    // Fill email and click next
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
            
            //TODO: Come back and handle captcha here
            
        } 
        else {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
    
}
  


}
