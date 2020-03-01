package co.com.s4n.stepdefinitions;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class Hook {

	@Managed(driver = "chrome")
    WebDriver driver;
	
    public static final Actor USER = Actor.named("user");
    private static boolean beforeAll = true;
    @Before
    public void setUp() {
    	 if (beforeAll) {
             Runtime.getRuntime().addShutdownHook(new Thread() {
                 public void run() {
                     driver.quit();
                     driver = null;
                 }
             });
             beforeAll = false;
         }
        USER.can(BrowseTheWeb.with(driver));
        driver.manage().window().maximize(); 
        driver.get("http://3.87.50.247:3000");
        
    }
  

}
