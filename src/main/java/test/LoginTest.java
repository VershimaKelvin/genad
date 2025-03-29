package test;


import com.mycompany.genad.LoginPage;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import utils.TestBase;


public class LoginTest extends TestBase {

    private LoginPage loginPage;

    @BeforeEach
    public void setUpTest() {
        setUp();
        loginPage = new LoginPage(page);
    }

    @AfterEach
    public void tearDownTest() {
        tearDown();
    }

    @Test
    public void testGoogleLogin() {
        setUpTest();
        loginPage.navigateToLogin();
        loginPage.clickGoogleLogin();

        // Use real or test credentials here
        loginPage.handleGoogleLogin("kelvinityavyar@gmail.com", "Barefooted@123");
        assertTrue(loginPage.isLoggedIn(), "Google login was not successful");
    }
    
}
