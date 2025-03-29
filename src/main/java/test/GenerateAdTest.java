/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.mycompany.genad.GenerateAdPage;
import com.mycompany.genad.LoginPage;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import utils.TestBase;

/**
 *
 * @author USER
 */
public class GenerateAdTest extends TestBase {
    
     private GenerateAdPage generateAdPage;

    @BeforeEach
    public void setUpTest() {
        setUp();
        generateAdPage = new GenerateAdPage(page);
    }

    @AfterEach
    public void tearDownTest() {
        tearDown();
    }

    @Test
    public void testGoogleLogin() {
        setUpTest();
        generateAdPage.navigateToLogin();
        generateAdPage.clickGoogleLogin();

        // Use real or test credentials here
        generateAdPage.handleAdGeneration("kelvinityavyar@gmail.com", "Barefooted@123");
        generateAdPage.navigateToAdGenerationPage();
        generateAdPage.fillAdGenerationForm("Coconut water", "A 30% discount on all bottles");
        assertTrue(generateAdPage.isLoggedIn(), "Google login was not successful");
    }
    
}
