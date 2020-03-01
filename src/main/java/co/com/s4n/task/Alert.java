package co.com.s4n.task;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.webdriver.WebDriverFacade;

public class Alert implements Question<Boolean>{
	 private WebDriver driver;
	
	 public Alert() {
	 this.driver = ((WebDriverFacade) (Serenity.getWebdriverManager().getCurrentDriver())).getProxiedDriver();
	 }

	@Override
	public Boolean answeredBy(Actor actor) {
		this.driver.switchTo().alert().accept();
		return true;
	}
	 
	 public static Alert is() {
	        return new Alert();
	    }
}
