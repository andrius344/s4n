package co.com.s4n.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.s4n.userinterfaces.ElementsForm.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.s4n.model.AccuntModel;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

public class CreateAccounts implements Task{
	
	 private AccuntModel accuntModel;
	 
	 public CreateAccounts(AccuntModel accuntModel) {
	        this.accuntModel = accuntModel;
	    }

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(this.accuntModel.getName()).into(TXT_NAME),
				Enter.theValue(this.accuntModel.getLast_name()).into(TXT_LAST_NAME),
				Enter.theValue(this.accuntModel.getEmail()).into(TXT_EMAIL),
				Enter.theValue(this.accuntModel.getPassword()).into(TXT_PASSWORD),
				Enter.theValue(this.accuntModel.getBirthday()).into(TXT_BIRTHDATE)
		);
		actor.attemptsTo(Check.whether(this.accuntModel.getGender().equals("hombre")
				         ).andIfSo(Click.on(BUTTON_MEN)));
		actor.attemptsTo(Check.whether(this.accuntModel.getGender().equals("mujer")
				         ).andIfSo(Click.on(BUTTON_WOMAN)));
		actor.attemptsTo(Click.on(BUTTON_CREATE_ACCOUNT));
		
	}
	
	  public static CreateAccounts In(AccuntModel accuntModel) {
	        return instrumented(CreateAccounts.class, accuntModel);
	    }

}
