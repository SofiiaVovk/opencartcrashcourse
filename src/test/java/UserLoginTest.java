import com.opencart.navigation.Navigation;
import com.opencart.steps.*;
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
        logoutAccount.verifyLogout();
    }

    @Test(priority = 2)
    public void changeUserPassword() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HeaderPageBL headerPageBL = new HeaderPageBL();
        ForgottenPageBL forgottenPageBL = headerPageBL
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .clickOnForgottenPassword()
                .changePasswordWithURL();
        forgottenPageBL.verifyChangePassword();
    }

    @Test(priority = 3)
    public void loginUserWithValidParameters(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.verifyLoginWithNewPassword();
    }
}
