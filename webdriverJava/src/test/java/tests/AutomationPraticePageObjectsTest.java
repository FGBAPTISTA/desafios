package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.CreateAccountPage;
import pages.HomePage;
import suporte.Web;

public class AutomationPraticePageObjectsTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChromeAutomationPrice();
    }

    @Test
    public void testAutomationPrice () {
        new HomePage(navegador).clicarProduct()
                .clicarAddToCart()
                .clicarProceedToCheckout()
                .clicarProceedToCheckoutAddress()
                .clicarBotaoHome()
                .clicarProceedToChekoutShipping()
                .clicarTermsOfService()
                .clicarPayment()
                .clicarIConfirmMyOrder();
    }

    @After
    public void tearDown() {
        //    navegador.quit();
    }

}
