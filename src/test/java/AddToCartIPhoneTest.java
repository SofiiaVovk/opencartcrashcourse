import com.opencart.navigation.Navigation;
import com.opencart.steps.FeaturedPageBL;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.ShoppingCartPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class AddToCartIPhoneTest {
    @Test
    public void addToCartIphoneTestWithValidParameters(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        FeaturedPageBL featuredPageBL = mainPageBL.getFeaturedPageBL()
                .clickOnIPhoneCartButton();
        ShoppingCartPageBL shoppingCartPageBL = mainPageBL.getHeaderPageBL()
                .clickOnShoppingCartButton();
        shoppingCartPageBL.checkIPhoneSumCorrect();


    }

}
