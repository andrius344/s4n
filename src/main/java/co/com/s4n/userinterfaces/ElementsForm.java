package co.com.s4n.userinterfaces;
import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ElementsForm {

 	 public static final Target TXT_NAME = Target.the("field name").located(By.id("id_nombre"));
 	 public static final Target TXT_LAST_NAME = Target.the("field last name").located(By.id("id_apellido"));
 	 public static final Target TXT_EMAIL = Target.the("field email").located(By.id("id_email"));
 	 public static final Target TXT_PASSWORD = Target.the("field passwordS").located(By.id("id_password"));
 	 public static final Target TXT_BIRTHDATE = Target.the("field birthdate").located(By.name("birthdate"));
	 public static final Target BUTTON_WOMAN = Target.the("field passwordS").located(By.id("id_genero_mujer"));
	 public static final Target BUTTON_MEN = Target.the("field passwordS").located(By.id("id_genero_hombre"));
	 public static final Target BUTTON_CREATE_ACCOUNT = Target.the("create account").locatedBy("//*[@class='btn btn-default' and @type='submit']");
 	
}
