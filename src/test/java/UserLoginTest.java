import com.opencart.navigation.Navigation;
import com.opencart.pages.RegisterPage;
import com.opencart.steps.ForgottenPageBL;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.RegisterPageBL;
import org.testng.annotations.Test;


import static com.opencart.enums.URLs.BASE_URL;

public class UserLoginTest extends BaseTest {

    @Test(priority = 1)
    public void registerUserWithValidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        registerPageBL.verifyUserRegistration();
        MainPageBL logoutAccount = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLogoutButton()
                .clickContinue();
        logoutAccount.verifyLogout(mainPageBL);
    }

    @Test(priority = 2)
    public void getChangePasswordURL() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        ForgottenPageBL forgottenPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .clickOnForgottenPassword()
                .changePasswordWithURL();
    }
}
