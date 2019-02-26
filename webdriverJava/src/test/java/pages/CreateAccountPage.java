package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

  public class CreateAccountPage extends BasePage{

  public CreateAccountPage(WebDriver navegador) {
        super(navegador);
    }

  public AddressesPage clicarBotaoHome (){
        navegador.findElement(By.id("email_create")).sendKeys("fabiom@db.com.br");
        navegador.findElement(By.xpath("//div[@class=\"submit\"]//button[@id=\"SubmitCreate\"]")).click();
        navegador.findElement(By.id("id_gender1")).click();
        navegador.findElement(By.id( "customer_firstname")).sendKeys("Fabio kk");
        navegador.findElement(By.id( "customer_lastname")).sendKeys("Silva dos Santos");
        navegador.findElement(By.id( "passwd")).sendKeys("123456");
        WebElement campoType = navegador.findElement(By.name("days"));
        new Select(campoType).selectByIndex(2);
        campoType = navegador.findElement(By.name("months"));
        new Select(campoType).selectByIndex(3);
        campoType = navegador.findElement(By.name("years"));
        new Select(campoType).selectByIndex(20);
        navegador.findElement(By.id( "firstname")).sendKeys("Paulo");
        navegador.findElement(By.id( "lastname")).sendKeys("Silva dos Santos");
        navegador.findElement(By.id( "company")).sendKeys("DBSERVER");
        navegador.findElement(By.id( "address1")).sendKeys("Rua Jose Mountary 456");
        navegador.findElement(By.id( "address2")).sendKeys("Azenha");
        navegador.findElement(By.id( "city")).sendKeys("Porto Alegre");
        campoType = navegador.findElement(By.name("id_state"));
        new Select(campoType).selectByIndex(10);
        navegador.findElement(By.id( "postcode")).sendKeys("00000");
        navegador.findElement(By.id( "phone")).sendKeys("5551989898");
        navegador.findElement(By.id( "phone_mobile")).sendKeys("55517777");
        navegador.findElement(By.id( "submitAccount")).click();
        return new AddressesPage (navegador);
    }
}
