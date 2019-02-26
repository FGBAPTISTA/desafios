package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.AddToCartPage;
import pages.CreateAccountPage;
import pages.LoginAutomationPraticePage;
import pages.ProceedToCheckoutPage;
import suporte.Web;

public class AutomationPracticePageObjectsAntTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChromeAutomationPrice();
    }

    @Test
    public void testAutomationPrice () {

        new LoginAutomationPraticePage(navegador).clicarSignIn()
                .digitarEmailAddress("fabiob@dbserver.com.br")
                .digitarPassword("teste123")
                .clicarSignIn()
                .clicarHome()
                .clicarProduct()
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
