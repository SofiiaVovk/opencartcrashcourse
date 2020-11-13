import com.opencart.navigation.Navigation;
import com.opencart.steps.AppleCinema30PageBL;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.ShoppingCartPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class AddToCartAppleCinema30Test extends BaseTest {
    @Test
    public void addAppleCinema30ToCartWithValidParameters(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        AppleCinema30PageBL appleCinema30PageBL = mainPageBL.getFeaturedPageBL()
                .clickOnAppleCinema30CartButton()
                .inputAvailableOptions();
        ShoppingCartPageBL shoppingCartPageBL = mainPageBL.getHeaderPageBL()
                .clickOnShoppingCartButton();
        shoppingCartPageBL.checkAppleCinema30SumCorrect();
    }
}
