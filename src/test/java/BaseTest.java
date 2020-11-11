import com.opencart.driver.DriverRepository;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void setup() {
        DriverRepository.downloadWebDriver();
    }

    @BeforeClass
    public void createDriver() {
        DriverRepository.instanceWebBrowser();
    }

    @AfterClass
    public void closeBrowser() {
      DriverRepository.closeBrowser();
    }
}
