package test;


import com.mycompany.genad.SignupPage;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import utils.TestBase;


public class SignupTest extends TestBase{
    
    private SignupPage signup;

    @BeforeEach
    public void setUpTest() {
        setUp();
        signup = new SignupPage(page);
    }

    @AfterEach
    public void tearDownTest() {
        tearDown();
    }

    @Test
    public void testGoogleSignUp() {
        setUpTest();
        signup.navigateToSignUp();
        signup.clickGoogleSignup();

        // Use real or test credentials here
        signup.handleGoogleSignUp("kelvinityavyar@gmail.com", "Barefooted@123");
        assertTrue(signup.isSignedUpIn(), "Google login was not successful");
    }
    
    
}
